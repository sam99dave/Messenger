import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.*;
import java.util.*;

public class MainController {
    @FXML
    private Button login;
    @FXML
    private Button signup;
    @FXML
    private Label username1;
    @FXML
    private Label username2;
    @FXML
    private Label password1;
    @FXML
    private Label password2;
    @FXML
    private Button logging;
    @FXML
    private Button register;
    @FXML
    private TextField eusername1;
    @FXML
    private TextField eusername2;
    @FXML
    private TextField epassword1;
    @FXML
    private TextField epassword2;
    @FXML
    private TextField ename;
    @FXML
    private Label name2;
    @FXML
    private Label chatLabel;
    @FXML
    private TextField enterMessage;
    @FXML
    private Button send;

    DataBase database = new DataBase();

    Member thisUser = null;
    Stage primaryStage;



    @FXML
    public void getLoggedIn(ActionEvent Event) throws Exception{
        Stage primaryStage = new Stage();

        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(root,502,177);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setTitle("Log In\n");
        primaryStage.setScene(scene);
        primaryStage.show();




    }

    @FXML
    public void getSignedUp(ActionEvent Event) throws Exception{
        Stage primaryStage = new Stage();

        Parent root = FXMLLoader.load(getClass().getResource("signup.fxml"));
        Scene scene = new Scene(root,492,219);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setTitle("Sign Up\n");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    public void chatPlaceBySign(ActionEvent Event) throws Exception{
        Stage primaryStage = new Stage();

        String username, password, name;
        username = eusername2.getText();
        password = epassword2.getText();
        name = ename.getText();

        thisUser = new Member(name);
        database.newClient(username, password, thisUser);

        Parent root = FXMLLoader.load(getClass().getResource("MainGUI.fxml"));
        Scene scene = new Scene(root,1169,785);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setTitle("Chat Place\n");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    @FXML
    public void chatPlaceByLog(ActionEvent Event) throws Exception{
        Stage primaryStage = new Stage();

        String username, password;
        username = eusername1.getText();
        password = epassword1.getText();

        thisUser = database.getMember(username, password);

        Parent root = FXMLLoader.load(getClass().getResource("MainGUI.fxml"));
        Scene scene = new Scene(root,1169,785);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setTitle("Chat Place\n");
        primaryStage.setScene(scene);
        primaryStage.show();


    }









}
