package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;


/**
 * JavaFX App
 */
public class App extends Application {

    private int lineNumber  ;
    private final int MAX_LINES = 50 ;

    private TextArea createConsole() {
        TextArea appConsole = new TextArea();
        appConsole.setWrapText(false);
        appConsole.setEditable(false);

        Pattern newline = Pattern.compile("\n");
        appConsole.setTextFormatter(new TextFormatter<String>(change ->  {

            String newText = change.getControlNewText();

            // count lines in proposed new text:
            Matcher matcher = newline.matcher(newText);
            int lines = 1 ;
            while (matcher.find()) lines++;

            // if there aren't too many lines just return the changed unmodified:
            if (lines <= MAX_LINES) return change ;

            // drop first (lines - 50) lines and replace all text
            // (there's no other way AFAIK to drop text at the beginning 
            // and replace it at the end):
            int linesToDrop = lines - MAX_LINES ;
            int index = 0 ; 
            for (int i = 0 ; i < linesToDrop ; i++) {
                index = newText.indexOf('\n', index) ;
            }
            change.setRange(0, change.getControlText().length());
            change.setText(newText.substring(index+1));

            return change  ;
        }));

        return appConsole;
    }

    @Override
    public void start(Stage stage) {

        TextArea appConsole = createConsole();

        // Fill with 45 lines to start:
        appConsole.appendText("Line 1");
        for (lineNumber = 2 ; lineNumber <= 45 ; lineNumber++) {
            appConsole.appendText("\nLine "+lineNumber);
        }

        // add a new line every 2 seconds:
        Timeline demo = new Timeline(
            new KeyFrame(Duration.seconds(2), 
                e -> appConsole.appendText("\nLine "+(lineNumber++))
            )
        );
        demo.setCycleCount(Animation.INDEFINITE);
        demo.play();

        stage.setScene(new Scene(new BorderPane(appConsole)));

        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }

}
