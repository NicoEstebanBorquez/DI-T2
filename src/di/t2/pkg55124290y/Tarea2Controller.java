package di.t2.pkg55124290y;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Tarea2Controller implements Initializable {
    
    @FXML
    private Label labelSaludo;
    @FXML TextField txtNombre;
    
    @FXML
    private void funcionSaludar(ActionEvent event) {
  
        String nombreUser = txtNombre.getText();
        labelSaludo.setText("Hola " + nombreUser);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
