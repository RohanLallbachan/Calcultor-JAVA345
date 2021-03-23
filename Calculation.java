/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import javafx.fxml.FXML;


/**
 *
 * @author rohan
 */


public class Calculation {
    
    @FXML
    public float calculation(float num1, float num2, String operator){
        
        switch(operator)
        {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "X":
                return num1 * num2;
            case "/":
                return num1 / num2;
             
            default: 
                return 0;
             
        
        }
    }
    
}
