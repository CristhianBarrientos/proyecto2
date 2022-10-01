package com.example.proyecto2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    private Stage stage;
    @FXML
    private Label txtName;
    @FXML
    private Label welcomeText;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void botonAgregarCuestionario(){


    }
    @FXML
    Button agregarCuestionario;

    @FXML
    Button btnActivarCuestionarioAPP;
    @FXML
    Button btnClonarCuestionarioAPP;
    @FXML
    Button btnEvaluarCuestionarioAPP;
    @FXML
    Button btnTop3CuestionarioAPP;
    @FXML
    void botonAgregarCuestionario(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = loader.load();
        ventana2Controlador controller = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        controller.init(txtName.getText(),stage,this);
        stage.show();
        this.stage.close();

    }

    public void setStage(Stage primStage) {
        stage = primStage;



    }
}