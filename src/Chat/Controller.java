package Chat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML public ListView userList;
    @FXML private TextField textInp;
    @FXML private Button btnSend;
    @FXML private TextArea chatArea;

    @FXML private void sendAction(ActionEvent actionEvent) {
        sendMessage();
    }

    @FXML private void onKeyPressedInInputInTextField(KeyEvent keyEvent) {
        if(keyEvent.getCode() == KeyCode.ENTER) sendMessage();;
    }

    private void sendMessage(){
        chatArea.appendText(textInp.getText());
        chatArea.appendText(System.lineSeparator());
        textInp.clear();
    }
}