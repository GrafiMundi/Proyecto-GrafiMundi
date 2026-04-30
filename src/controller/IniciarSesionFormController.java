package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class IniciarSesionFormController {

    @FXML
    private VBox panelFormIniciarSesion;

    @FXML
    private TextField txtUsuarioIniciarSesion;

    @FXML
    private PasswordField txtContraseñaInicio;

    @FXML
    private TextField txtContraseñaInicioMask;

    @FXML
    private CheckBox checkVerContraseñaInicio;

    @FXML
    private Button btnIngresarInicioS;

    @FXML
    private Button btnLimpiarInicioS;

    @FXML
    public void initialize() {

    }
}

//FXML de inicio de sesion completo aunque por el momento no es funcional no toquen los controller ni los fxml plz