package lesson8;

import com.sun.webkit.network.URLs;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.nio.file.Paths;

public class ChatApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent auth = FXMLLoader.load(Paths.get("C:\\Users\\user\\IdeaProjects\\JavaFull_10_2020\\Java2\\src\\main\\resources\\lesson8\\chat.fxml").toUri().toURL());
        primaryStage.setTitle("Чат");
        primaryStage.setScene(new Scene(auth));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
