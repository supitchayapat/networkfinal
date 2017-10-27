package client.login;

import client.window.Window;
import com.sun.javafx.property.adapter.PropertyDescriptor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class Login {
    //implements Initializable {

    @FXML
    public TextField hostnameTextfield;
    @FXML
    private TextField portTextfield;
    @FXML
    private TextField usernameTextfield;
    public static Window con;
    @FXML
    private BorderPane borderPane;
    private Scene scene;


    private static Login instance;

    public Login() {
        instance = this;
    }

    public static Login getInstance() {
        return instance;
    }

    public void onActionbtnLogin(ActionEvent event) throws IOException {
        String hostname = hostnameTextfield.getText();
        int port = Integer.parseInt( portTextfield.getText() );
        String username = usernameTextfield.getText();

        FXMLLoader fmxlLoader = new FXMLLoader( getClass().getResource( "/views/ChatView.fxml" ) );
        Parent window = (Pane) fmxlLoader.load();
        con = fmxlLoader.<Window>getController();
//        PropertyDescriptor.Listener listener = new PropertyDescriptor.Listener( hostname, port, username, con );
//        Thread x = new Thread( listener );
//        x.start();
        this.scene = new Scene( window );

    }

    public void showErrorDialog(String could_not_connect_to_server) {
    }

    public void showScene() {
    }
}
