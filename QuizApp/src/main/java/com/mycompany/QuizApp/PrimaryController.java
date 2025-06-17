package com.mycompany.QuizApp;

import com.mycompany.utils.MyAlert;
import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class PrimaryController {

   public void handleQuestionManagement(ActionEvent event) throws IOException
   {
       MyAlert.getInstance().showMsg("Question Management Coming soon...");
       Scene scene = new Scene(new FXMLLoader(App.class.getResource("questions.fml")).load());
       
       
       
       Stage stage = new Stage();
       stage.setScene(scene);
       stage.setTitle("Quiz App");
       stage.show();
       
   }
   
   public void handleFractice(ActionEvent event)
   {
       MyAlert.getInstance().showMsg("Practice Coming soon");
   }
}
