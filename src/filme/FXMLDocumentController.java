/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filme;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author hader
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private CheckBox checkboxAcao;
    @FXML
    private CheckBox checkboxTerror;
    @FXML
    private CheckBox checkboxRomance;
    @FXML
    private CheckBox checkboxComedia;
    @FXML
    private RadioButton radioJumanji;
    @FXML
    private RadioButton radioTitanic;
    @FXML
    private RadioButton radioNenhum;
    @FXML
    private TextField textOpniao;
    @FXML
    private Button botaoSalvar;
    @FXML
    private Label labelRespostas;
    @FXML
    private ToggleGroup veragora;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Filmes");
        label.setText("Filmes");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void save(ActionEvent event) {
        String resposta=" ";
        
        if(checkboxAcao.isSelected()){
         
            resposta+="\n" +checkboxAcao.getText();
            
        }
        
        if(checkboxComedia.isSelected()){
            resposta+="\n" +checkboxComedia.getText();
        }
        
        if(checkboxRomance.isSelected())
        {
            resposta+="\n" +checkboxRomance.getText();
        }
        
        if(checkboxTerror.isSelected()){
            resposta+="\n" +checkboxTerror.getText();
        }
        
        if(radioJumanji.isSelected())
        {
            resposta+="\n" + radioJumanji.getText();
        }
        
        if(radioTitanic.isSelected()){
            resposta+="\n" + radioTitanic.getText();
        }
        
        if(radioNenhum.isSelected()){
            resposta+="\n" + radioNenhum.getText();
        }
      
        resposta+="\n"+textOpniao.getText();
        
        labelRespostas.setText(resposta);
    }
    
}
