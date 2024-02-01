//package lab5.javafxusingflowpane;
//
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.layout.FlowPane;
//import javafx.stage.Stage;
//
//public class ShortJavaFXForm extends Application {
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) {
//        primaryStage.setTitle("JavaFX Form with FlowPane");
//
//        Label nameLabel = new Label("Username:");
//        TextField nameTextField = new TextField();
//
//        Label passwordLabel = new Label("Password:");
//        PasswordField passwordField = new PasswordField();
//
//        CheckBox rememberCheckBox = new CheckBox("Remember me");
//        Button loginButton = new Button("Login");
//
//        FlowPane flowPane = new FlowPane(nameLabel, nameTextField, new Separator(), passwordLabel, passwordField, rememberCheckBox, loginButton);
//        flowPane.setHgap(10);
//        flowPane.setVgap(10);
//        flowPane.setPadding(new Insets(10));
//
//        primaryStage.setScene(new Scene(flowPane, 300, 150));
//        primaryStage.show();
//    }
//}
