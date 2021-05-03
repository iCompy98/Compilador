package valen.sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
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
        private JFileChooser fc = new JFileChooser();
        private String aux_lector;
        private boolean saveFlag=true;

        public Controller(){
//            System.out.println(lbl_Test.getText());

        }

        public void accion(ActionEvent e) throws Exception {
        //System.out.println("Holaaaa");
        txt_resultados.setText("");
        String data = txt_Test.getText();
        File archivo=null;
        String ruta= "prueba.txt";

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

        /*@Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
            int x=1;
            txt_Test.textProperty().addListener((Observable, oldValue, newValue) -> {
                txt_Test.appendText(x+"\t");
        });
        }*/
}