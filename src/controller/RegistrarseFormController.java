package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;


public class RegistrarseFormController {

    @FXML
    private VBox panelFormRegistro;

    @FXML
    private TextField txtEmailRegistro;

    @FXML
    private TextField txtUsuarioRegistro;

    @FXML
    private TextField txtContraseñaRegistro;

    @FXML
    private TextField txtConfirmarContraRegistro;

    @FXML
    private Button btnRegistrarse;

    @FXML
    private Button btnLimpiarRegistrarse;

    @FXML
    public void initialize() {

    }
}

//FXML de registro completo aunque por el momento no es funcional no toquen los controller ni los fxml plz