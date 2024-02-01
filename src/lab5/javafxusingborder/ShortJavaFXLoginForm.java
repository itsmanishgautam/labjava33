//package lab5.javafxusingborder;
//
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.layout.BorderPane;
//import javafx.stage.Stage;
//
//public class ShortJavaFXLoginForm extends Application {
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) {
//        primaryStage.setTitle("JavaFX Login Form with BorderPane");
//
//        Label headingLabel = new Label("Login Form");
//        Label nameLabel = new Label("Username:");
//        TextField nameTextField = new TextField();
//        Label passwordLabel = new Label("Password:");
//        PasswordField passwordField = new PasswordField();
//        CheckBox rememberCheckBox = new CheckBox("Remember me");
//        Button loginButton = new Button("Login");
//
//        BorderPane borderPane = new BorderPane();
//        borderPane.setTop(headingLabel);
//        BorderPane.setAlignment(headingLabel, javafx.geometry.Pos.CENTER);
//        borderPane.setMargin(headingLabel, new Insets(10, 0, 20, 0));
//
//        borderPane.setLeft(nameLabel);
//        borderPane.setCenter(nameTextField);
//        borderPane.setBottom(rememberCheckBox);
//        BorderPane.setAlignment(rememberCheckBox, javafx.geometry.Pos.CENTER);
//        borderPane.setMargin(rememberCheckBox, new Insets(20, 0, 20, 0));
//
//        borderPane.setRight(passwordLabel);
//        borderPane.setMargin(passwordLabel, new Insets(0, 10, 0, 10));
//        borderPane.setMargin(passwordField, new Insets(0, 10, 0, 10));
//        borderPane.setCenter(passwordField);
//
//        borderPane.setBottom(loginButton);
//        BorderPane.setAlignment(loginButton, javafx.geometry.Pos.CENTER);
//        borderPane.setMargin(loginButton, new Insets(20, 0, 10, 0));
//
//        Scene scene = new Scene(borderPane, 300, 200);
//        primaryStage.setScene(scene);
//
//        primaryStage.show();
//    }
//}
