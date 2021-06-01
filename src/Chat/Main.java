package Chat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Objects.requireNonNull(getClass().getResource("chat.fxml")));
        Parent root = loader.load();
        primaryStage.setTitle("MyChat");
        primaryStage.setScene(new Scene(root));

        Controller controller = loader.getController();
        controller.userList.getItems().addAll("User1", "User2");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}