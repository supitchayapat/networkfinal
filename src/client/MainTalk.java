package client;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainTalk extends Application{
//    private static Stage primaryStage;


    @Override
    public void start(Stage primaryStage) throws Exception {
//        primaryStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("model/gamechat.fxml"));
//        primaryStage.initStyle( StageStyle.UNDECORATED);
        primaryStage.setTitle("Pat Chat");
        primaryStage.getIcons().add(new Image(getClass().getClassLoader().getResource("image/monkey.png").toString()));
        Scene scene = new Scene(root, 1040, 620);
//        scene.setRoot(root);
//        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
//        primaryStage.setOnCloseRequest(e -> Platform.exit());
    }
//    public static Stage getPrimaryStage() {
//        return primaryStage;
//    }
    public static void main(String[] args) {
        launch(args);
    }



//    public static Stage getPrimaryStage() {
//        return primaryStage;
//    }

    }

