/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author rohan
 */
public class Process {
    
    @FXML
    public Label result;
    private float number1 = 0;
    private float number2;
    private boolean start = true;
    private String operator = "";
    private Calculation model = new Calculation();
    
    
    @FXML
    public void processNumbers(ActionEvent event){
        
        if(start)
        {
            result.setText("");
            start = false;
        }
        
        String value = ((Button)event.getSource()).getText();
        result.setText(result.getText()+ value);
        
    }
    
    @FXML
    public void processOperators(ActionEvent event){
        
        String value = ((Button)event.getSource()).getText();
        
        if(value.equals("="))
        {
            if(!operator.isEmpty())
            {
                switch(value)
                {
                    case "C":
                        result.setText("");
                        this.number1 = 0;
                        this.number2 = 0;
                        break;
                    default:
                        break;
                    
                }
                
                operator = value;
                number1 = Long.parseLong(result.getText());
                result.setText("");
                return;
            }
            else{
                if(operator.isEmpty())
                    return;
                number2= Long.parseLong(result.getText());
                float output = model.calculation(number1, number2, operator);
                result.setText(String.valueOf(output));
                operator = "";
                number1 = 0;
                number2 = 0;
                start = true;
            }
        }
        
    }
    
}
