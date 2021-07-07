 /*
  *
  *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
  *  *  Copyright 2021 Chad Higgins
  *
  */

 package ucf.assignments;

 import javafx.application.Application;
 import javafx.fxml.FXMLLoader;
 import javafx.scene.Parent;
 import javafx.scene.Scene;
 import javafx.stage.Stage;

 import java.io.IOException;

 public class ToDoManager extends Application {

     public static void main(String[] args) {

         //make new List<ToDoList
         //make new List<String> Master
         // Master = call LoadMasterSave

         launch(args);

         //call SaveMasterSave
     }

     @Override
     public void start(Stage primaryStage) {

         try {
             Parent root = FXMLLoader.load(getClass().getResource("ToDoManager.fxml"));

             Scene scene = new Scene(root);

             primaryStage.setScene(scene);
             primaryStage.setTitle("ToDoManager");
             primaryStage.show();

         } catch (IOException e) {
             e.printStackTrace();
         }
     }
 }
