package sample;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


import javax.swing.*;

public class tempConvert extends Application {

    public void start(Stage stage){
        Button convertButton = new Button();
        convertButton.setText("Convert");

        ComboBox<String> pickScaleFrom = new ComboBox();
        ComboBox<String> pickScaleTo = new ComboBox();
        pickScaleFrom.getItems().add("Fahrenheit");
        pickScaleFrom.getItems().add("Celsius");
        //or use: pickScaleFrom.getItems().addAll("Fahrenheit", "Celcius");

        pickScaleTo.getItems().add("Fahrenheit");
        pickScaleTo.getItems().add("Celsius");
        //or use: pickScaleTo.getItems().addAll("Fahrenheit", "Celsius");

        pickScaleFrom.getSelectionModel().selectFirst();
        pickScaleTo.getSelectionModel().selectLast();

        Label from = new Label("From:");
        Label to = new Label("To:");

        TextField userInput = new TextField();
        Label inputValues = new Label("Input Value: ");
        Label results = new Label();


        HBox scales = new HBox();
        scales.setAlignment(Pos.CENTER);
        scales.setSpacing(10);
        scales.getChildren().add(from);
        scales.getChildren().add(pickScaleFrom);
        scales.getChildren().add(to);
        scales.getChildren().add(pickScaleTo);
        //or use: scales.getChildren().addAll(from, pickScaleFrom, to, pickScaleTo);

        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        root.getChildren().add(input);
        root.getChildren().add(scales);
        root.getChildren().add(convertButton);
        root.getChildren().add(results);
        //or use: scales.getChildren().addAll(input, scales, convertButton, result);

        Scene scene = new Scene(root, 400, 400);
        stage.setTitle("Temperature Converter");
        stage.setScene(scene);
        stage.show();

    }




}