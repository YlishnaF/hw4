package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
@FXML
    public Button btnSendMessage;
    public TextArea textArea;
    public TextField textField;


    @FXML
    public void sendMsg(ActionEvent actionEvent) {
        textArea.appendText(textField.getText()+" \n");
    }
}
