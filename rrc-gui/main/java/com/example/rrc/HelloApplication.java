package com.example.rrc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

// Main stage/menu of the GUI. Huge thanks to Bro Code on YouTube, I learned a lot of stuff about JavaFX from
// watching https://www.youtube.com/watch?v=9XJicRt_FaI.

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage1) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene1.fxml")));
        stage1.setTitle("Rust Raid Calculator");    // Sets the window title to custom name.
        stage1.setScene(new Scene(root));
        stage1.setX(750);   // Sets the window size.
        stage1.setY(500);
        stage1.setResizable(false); // Turns user resizing off.
        stage1.show();  // Shows the actual stage.
    }

    public static void main(String[] args) {
        launch(args);
    }
}