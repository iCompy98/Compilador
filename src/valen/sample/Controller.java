package valen.sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import valen.parser.lenguajeC.LenguajeenCLexer;
import valen.parser.lenguajeC.LenguajeenCParser;
import valen.parser.lenguajeenMi.LenguajeenMiLexer;
import valen.parser.lenguajeenMi.LenguajeenMiParser;
import valen.parser.lenguajesLexer;
import valen.parser.lenguajesParser;
import valen.sample.exceptions.MyExceptions;

import javax.swing.*;
import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller /*implements Initializable*/ {

        @FXML
        private TextArea txt_Test;
        @FXML
        private TextArea txt_resultados;
        @FXML
        private AnchorPane container;
        @FXML
        private Label lbl_Test;
        @FXML
        private TextArea vBox;
        private JFileChooser fc = new JFileChooser();
        private String aux_lector;
        private boolean saveFlag=true;
        String ruta= "prueba.txt";

        /*@Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
                vBox.textProperty().addListener();
        }*/

        public void accion(ActionEvent e) throws Exception {
        //System.out.println("Holaaaa");
        txt_resultados.setText("");
        String data = txt_Test.getText();
        File archivo=null;


        //Crear archivo
        try {
            archivo = new File(ruta);
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
        }catch (Exception exc) {
            exc.printStackTrace();
        }

        try {
            correrGramatica(ruta);
        }catch(MyExceptions ex){
            txt_resultados.setText("Error:\n"+ex.getMessage());
        }
         //convertirGramatica(ruta);
    }

    public void correrGramatica(String ruta) throws Exception{
            CharStream input = CharStreams.fromFileName(ruta);
            lenguajesLexer lexico = new lenguajesLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexico);
            lenguajesParser sintactico = new lenguajesParser(tokens);
            ParseTree arbol = sintactico.cascaron();

            MyVisitor visitas = new MyVisitor();
            visitas.visit(arbol);

            txt_resultados.setText(visitas.getCadena());
        }

    public String convertirGramatica() throws Exception{
            String data = txt_Test.getText();
            File archivo= null;
            String ruta="traduccion.txt";
        try {
            archivo = new File(ruta);
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
        }catch (Exception exc) {
            exc.printStackTrace();
        }
        CharStream input = CharStreams.fromFileName(ruta);
        LenguajeenCLexer lexico = new LenguajeenCLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexico);
        LenguajeenCParser sintactico = new LenguajeenCParser(tokens);
        ParseTree arbol = sintactico.cascaron();

        LenguajeC visitas = new LenguajeC();
        visitas.visit(arbol);

        return visitas.getCodigo();
    }

    public String convertirGramaticaC_Mio() throws Exception{
        String data = txt_Test.getText();
        File archivo= null;
        String ruta="traduccion.txt";
        try {
            archivo = new File(ruta);
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
        }catch (Exception exc) {
            exc.printStackTrace();
        }
        CharStream input = CharStreams.fromFileName(ruta);
        LenguajeenMiLexer lexico = new LenguajeenMiLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexico);
        LenguajeenMiParser sintactico = new LenguajeenMiParser(tokens);
        ParseTree arbol = sintactico.cascaron();

        LenguajeMio visitas = new LenguajeMio();

        return visitas.visit(arbol);
    }


    public void traducir(ActionEvent e) throws Exception{
        txt_Test.setText(convertirGramaticaC_Mio());
    }

    public void saveFile(ActionEvent e) throws Exception{
        BufferedWriter escribir_archivo = null;
        if(saveFlag){
            //Primera vez
            saveFlag = false;
            String cadena = txt_Test.getText();
            fc.setApproveButtonText("Guardar");
            fc.showSaveDialog(null);

            try{
                File archivo = fc.getSelectedFile();
                FileWriter fw = new FileWriter(archivo);
                escribir_archivo = new BufferedWriter(fw);
                escribir_archivo.write(cadena);
            }catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (escribir_archivo != null)
                        escribir_archivo.close();
                } catch (IOException exception) {
                    System.out.println("Error al  cerrar el BufferWriter");
                }
            }
        }else{
            //Demas veces
            try {
                String texto = txt_Test.getText();
                File archivo = fc.getSelectedFile();
                FileWriter fw = new FileWriter(archivo);
                escribir_archivo = new BufferedWriter(fw);
                escribir_archivo.write(texto);
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (escribir_archivo != null)
                        escribir_archivo.close();
                } catch (IOException exception) {
                    System.out.println("Error al  cerrar el BufferWriter");
                }
            }
        }
    }

        public void openFile(ActionEvent e) throws Exception{

        txt_Test.setText("");
        fc.showOpenDialog(null);
        File archivo = fc.getSelectedFile();
        try{
            FileReader archivos= new FileReader(archivo);
            BufferedReader leer = new BufferedReader(archivos);
            aux_lector = leer.readLine();
            while(!(aux_lector == null)){
                txt_Test.appendText(aux_lector + "\n");
                aux_lector = leer.readLine();
            }
            leer.close();
        }catch (IOException exc) {
            JOptionPane.showMessageDialog(null, exc);
        }
    }

        public void saveAsFile(ActionEvent e) throws Exception{
            BufferedWriter escribir_archivo = null;
            try {
                String texto = txt_Test.getText();

                fc.setApproveButtonText("Guardar");
                fc.showSaveDialog(null);

                File archivo = fc.getSelectedFile();
                FileWriter fw = new FileWriter(archivo);
                escribir_archivo = new BufferedWriter(fw);
                escribir_archivo.write(texto);


            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (escribir_archivo != null)
                        escribir_archivo.close();
                } catch (IOException exception) {
                    System.out.println("Error al  cerrar el BufferWriter");
                }
            }
        }

        public void exit(ActionEvent e) throws Exception{
            System.exit(0);
        }
}