package com.example.proyecto2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ventana2Controlador {

    private HelloController controllerHello;
    private Stage stage;
    @FXML
    TextField spcTituloNuevoCuestionario;


    @FXML
    TextField spcDescripcionNuevoCuestionario;

    @FXML
    Button btnCancelarNuevoCuestionario;

    @FXML
    Button btnSiguienteNuevoCuestionario;

    void botonCancelar(ActionEvent event){

    }
    public void init(String text, Stage stage, HelloController helloController) {
        this.controllerHello = helloController;
        this.stage = stage;

    }
}
