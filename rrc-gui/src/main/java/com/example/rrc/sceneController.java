// https://www.youtube.com/watch?v=9XJicRt_FaI
// Credit to Bro Code on YouTube, I learned a lot of stuff about JavaFX from watching this one video.

package com.example.rrc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Objects;


public class sceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private AnchorPane scenePane;

    // A method used to close the GUI window.
    public void exit() {
        stage = (Stage) scenePane.getScene().getWindow();
        // Closes the stage.
        stage.close();
    }
    public void switchToSelectBlock(ActionEvent event) throws Exception {
        // Method is run by a button press which switches stages and scenes to let the user add blocks to the queue.
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("selectBlock.fxml")));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToSelectDeployable(ActionEvent event) throws Exception {
        // Method is run by a button press which switches stages and scenes to let the user add deployables to the queue.
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("selectDeployableType.fxml")));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public static Text totalCost;

    // This method is run by a button and switches to the calculate screen where the elements in the queue are tallied
    // up and neatly printed out.
    public void switchToCalculateCost(ActionEvent event) {
        totalCost = new Text();
        // Uses method from CalculateCost class.
        CalculateCost.calc();
        Group root = new Group();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene1 = new Scene(root,750,500,Color.web("#07131e"));
        Button but = new Button("Main Menu");
        // Makes a button with the specified traits below, including an action to go to the main menu.
        but.setTranslateX(300);
        but.setTranslateY(407);
        but.prefHeight(26);
        but.prefWidth(151);
        but.setBackground(Background.fill(Color.BLACK));
        but.setTextFill(Color.WHITE);
        root.getChildren().add(but);
        but.setOnAction(event1 -> { //https://jenkov.com/tutorials/javafx/button.html this tutorial helped me write this.
            try {
                mainMenu(event1);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        // Properties set for the stage.
        root.setTranslateX(0);
        root.setTranslateY(0);
        stage.setScene(scene1);
        stage.show();
        stage.setX(750);
        stage.setY(500);
        stage.setResizable(false);


        // Test formatted neatly to print the total raid cost of the elements in the queue and the most efficient way of
        // raiding.
        Text txt = new Text();
        CalculateCost.cheapest();
        txt.setText("Total Cost:" +
                "\nRockets: " + CalculateCost.totalRockets +
                "\nExplosive 5.56: " + CalculateCost.total556 +
                "\nC4: " + CalculateCost.totalC4 +
                "\nSatchels: " + CalculateCost.totalSatchels +
                "\nF1 Grenades: " + CalculateCost.totalF1s +
                "\nBeancan Grenades: " + CalculateCost.totalBeancans +
                "\nHigh Velocity Rockets: " + CalculateCost.totalHVs +
                "\n40mm HE Grenades: " + CalculateCost.totalHEs +
                "\nMLRS Rockets: " + CalculateCost.totalMLRS +
                "\n\nCheapest way to raid is by using : " + CalculateCost.tool + ", the sulfur cost would be: " + CalculateCost.sulfurCost);
        txt.setFill(Color.WHITE);
        txt.setX(50);
        txt.setY(50);

        root.getChildren().add(txt);
    }
    // Stage switch method that is triggered by a button press.
    public void switchToClearQueue(ActionEvent event) throws Exception {
        RustCalculator.clearQueue();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("clearQueue.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Stage switch method that is triggered by a button press.
    public void mainMenu(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene1.fxml")));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static String selected;

    // Stage switch method that is triggered by a button press and changes the 'selected' variable accordingly.
    public void pickTwigBlock(ActionEvent event) throws Exception {
        selected = "twig";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmount.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    // Stage switch method that is triggered by a button press and changes the 'selected' variable accordingly.
    public void pickWoodBlock(ActionEvent event) throws Exception {
        selected = "wood";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmount.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    // Stage switch method that is triggered by a button press and changes the 'selected' variable accordingly.
    public void pickStoneBlock(ActionEvent event) throws Exception {
        selected = "stone";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmount.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    // Stage switch method that is triggered by a button press and changes the 'selected' variable accordingly.
    public void pickMetalBlock(ActionEvent event) throws Exception {
        selected = "metal";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmount.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    // Stage switch method that is triggered by a button press and changes the 'selected' variable accordingly.
    public void pickArmorBlock(ActionEvent event) throws Exception {
        selected = "armor";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmount.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    TextField textAmountBox;

    // Used to submit the amount of blocks entered by the user in a textBox.
    public void submitAmount(ActionEvent event) throws Exception {
        String amount = textAmountBox.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountPass.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        // Passes the gathered data into a different method.
        submit(amount);
    }
    @FXML
    TextField textAmountBoxDeployables;

    // Used to submit the amount of deployables entered by the user in a textBox.
    public void submitAmountDeployables(ActionEvent event) throws Exception {
        String amount = textAmountBoxDeployables.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountPass.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        // Passes the gathered data into a different method.
        submitDeployables(amount);
    }

    // This method passes the earlier selected block and the recently gathered amount data to add a specific
    // amount of blocks to the queue.
    public void submit(String amount) {
        int parsed;
        try {
            // Try catch to make sure there are no words entered instead of numbers.
            parsed = Integer.parseInt(amount);
            RustCalculator.blockQueueAdd(selected, parsed);
        } catch (NumberFormatException ignored) {
        }
    }

    // This method passes the earlier selected deployable and the recently gathered amount data to add a specific
    // amount of deployables to the queue.
    public void submitDeployables(String amount) {
        int parsed;
        try {
            // Try catch to make sure there are no words entered instead of numbers.
            parsed = Integer.parseInt(amount);
            RustCalculator.deployableQueueAdd(selected, parsed);
        } catch (NumberFormatException ignored) {
        }
    }

    // Method that prints the queue to the user.
    public void displayList(ActionEvent event) {
        Group root = new Group();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene1 = new Scene(root,750,500,Color.web("#07131e"));
        Button but = new Button("Main Menu");
        but.setTranslateX(300);
        but.setTranslateY(407);
        but.prefHeight(26);
        but.prefWidth(151);
        but.setBackground(Background.fill(Color.BLACK));
        but.setTextFill(Color.WHITE);
        root.getChildren().add(but);
        but.setOnAction(event1 -> { //https://jenkov.com/tutorials/javafx/button.html same website helped with the
            // same thing as earlier.
            try {
                mainMenu(event1);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        // Properties set for the stage.
        root.setTranslateX(0);
        root.setTranslateY(0);
        stage.setScene(scene1);
        stage.show();
        stage.setX(750);
        stage.setY(500);
        stage.setResizable(false);


        // Text is set at a wrapping width of 800 to prevent letters trailing out of the window.
        Text txt = new Text();
        txt.setWrappingWidth(800);
        // Simply prints the already formatted queue.
        txt.setText("" + RustCalculator.blockQueue);
        txt.setFill(Color.WHITE);
        txt.setX(50);
        txt.setY(50);

        root.getChildren().add(txt);

    }

    // The methods below this comment are to redirect the user with buttons and different fxml pages.
    // Each method has a different link to a fxml file.
    public void selectDoor(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectDoor.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void selectWindow(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectWindow.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void selectBarricade(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectBarricade.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void selectStorage(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectStorage.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void selectExternal(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectExternal.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void selectHatch(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectHatch.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void selectFence(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectFence.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void pickWoodDoor(ActionEvent event) throws Exception {
        selected = "wood";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickMetalDoor(ActionEvent event) throws Exception {
        selected = "metal";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickArmorDoor(ActionEvent event) throws Exception {
        selected = "armored";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickGarageDoor(ActionEvent event) throws Exception {
        selected = "garage";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickWoodenBars(ActionEvent event) throws Exception {
        selected = "wooden bars";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickStrengthenedGlass(ActionEvent event) throws Exception {
        selected = "strengthened glass";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickMetalBars(ActionEvent event) throws Exception {
        selected = "metal bars";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickReinforcedGlass(ActionEvent event) throws Exception {
        selected = "reinforced glass";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickWoodWall(ActionEvent event) throws Exception {
        selected = "wood wall";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickWoodGate(ActionEvent event) throws Exception {
        selected = "wood gate";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickStoneWall(ActionEvent event) throws Exception {
        selected = "stone wall";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickStoneGate(ActionEvent event) throws Exception {
        selected = "stone gate";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickStoneBarricade(ActionEvent event) throws Exception {
        selected = "stone";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickWoodenCover(ActionEvent event) throws Exception {
        selected = "wooden cover";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickSandbag(ActionEvent event) throws Exception {
        selected = "sandbag";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickWoodBarricade(ActionEvent event) throws Exception {
        selected = "wood";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickBarbedWood(ActionEvent event) throws Exception {
        selected = "barbed wood";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickConcrete(ActionEvent event) throws Exception {
        selected = "concrete";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickMetalBarricade(ActionEvent event) throws Exception {
        selected = "metal";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickTriangleHatch(ActionEvent event) throws Exception {
        selected = "triangle";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickSquareHatch(ActionEvent event) throws Exception {
        selected = "square";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickDropBox(ActionEvent event) throws Exception {
        selected = "drop box";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickSmallBox(ActionEvent event) throws Exception {
        selected = "small box";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickFridge(ActionEvent event) throws Exception {
        selected = "fridge";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickLargeBox(ActionEvent event) throws Exception {
        selected = "large box";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickLocker(ActionEvent event) throws Exception {
        selected = "locker";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickVendingMachine(ActionEvent event) throws Exception {
        selected = "vending machine";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickFence(ActionEvent event) throws Exception {
        selected = "fence";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void pickGate(ActionEvent event) throws Exception {
        selected = "gate";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("selectAmountDeployables.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
