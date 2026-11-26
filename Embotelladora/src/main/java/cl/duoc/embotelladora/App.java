package cl.duoc.embotelladora;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        Label mensaje = new Label("JavaFX funcionando");
        stage.setScene(new Scene(mensaje, 400, 200));
        stage.setTitle("Sistema Embotelladora");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
