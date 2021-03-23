/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author rohan
 */
public class NewClass extends Application {
    
   
    @Override
    public void start(Stage stage){ 
        
        try{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("main.fxml"));
        Scene scene = new Scene(root,300,300);       
        stage.setScene(scene);
        stage.show();
    }
        catch(Exception e){
            
            e.printStackTrace();
        }
    }
 
  
    public static void main(String[] args) {
        launch(args);
    }
    
}
