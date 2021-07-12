/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Chad Higgins
 *
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.EventListener;
import java.util.List;
import java.util.ResourceBundle;

public class ToDoManagerController implements Initializable {

    private ToDoList List;
    private String Desc;
    private String Date;
    private int currentCommand;
    private int validInput;

    FileChooser fileChooser = new FileChooser();

    //text section
    @FXML
    public TextArea DisplayList;

    @FXML
    public TextArea UserPrompt;

    @FXML
    public TextField UserInput;

    @FXML
    public void EditDateClicked(ActionEvent actionEvent) {

        //update UserPrompt "Enter in new Date"
        UserPrompt.setText("Enter in new Date");

        currentCommand = 1;

    }

    @FXML
    public void EditDescClicked(ActionEvent actionEvent) {

        //update UserPrompt "Enter in new description"
        UserPrompt.setText("Enter in new description");

        currentCommand = 2;

    }

    @FXML
    public void MarkDoneClicked(ActionEvent actionEvent) {

        if (!List.getItem().isEmpty())
        List.editItemDone();

        // get current Item object from ToDoList, call getItem
        DisplayList.setText(List.getItem());
    }

    @FXML
    public void DeleteItemClicked(ActionEvent actionEvent) {

        //check if isEmpty
        //use list method to remove the item from the ToDoList

        if (!List.getItem().isEmpty())
        {
            List.removeItem();
        }

        DisplayList.setText(List.getItem());
    }

    @FXML
    public void SaveClicked(ActionEvent actionEvent) {

        //call file chose
        File file = fileChooser.showSaveDialog(new Stage());

        //call ListToFile
        FileManager.ListToFile(file, List);

    }

    @FXML
    public void LoadClicked(ActionEvent actionEvent) {

        //call file chose
        File file = fileChooser.showOpenDialog(new Stage());

        //call FileToList
        List = FileManager.FileToList(file);
    }

    @FXML
    public void EnterListener(KeyEvent keyEvent) {

            if (keyEvent.getCode() == KeyCode.ENTER) {
                CurrentCommand(currentCommand);
            }
    }

    private void CurrentCommand(int Command) {

        switch (Command)
        {
            case 1:
                getDateInput();
                if (validInput == 1)
                {
                    break;
                }

                // call editItemDate, listen for input
                List.editItemDate(UserInput.getText());

                // get current Item object from ToDoList, call getItem
                DisplayList.setText(List.getItem());
                UserPrompt.setText("");
                currentCommand = 0;
                break;

            case 2:
                getDescInput();
                if (validInput == 1)
                {
                    break;
                }

                // call editItemDesc
                List.editItemDesc(UserInput.getText());

                // get current Item object from ToDoList, call getItem
                DisplayList.setText(List.getItem());
                UserPrompt.setText("");
                currentCommand = 0;
                break;

            case 3:
                getDescInput();
                if (validInput == 1)
                {
                    break;
                }
                else
                {
                    currentCommand = 4;
                    UserPrompt.setText("Enter a date: YYYY-MM-DD");
                }
                break;

            case 4:
                getDateInput();
                if (validInput == 1)
                {
                    break;
                }
                else
                {
                    List.newItem(Date, Desc);
                    DisplayList.setText(List.getItem());
                    UserPrompt.setText("");
                    currentCommand = 0;
                }
                break;

            default: break;
        }
    }

    @FXML
    public void NextItemClicked(ActionEvent actionEvent) {

        //call .next on the current ToDoList object
        //display that item
        List.nextItem();
        DisplayList.setText(List.getItem());
    }

    @FXML
    public void PreviousItemClicked(ActionEvent actionEvent) {

        //call .previous on the current List<ToDoList> object
        //display that item
        List.prevItem();
        DisplayList.setText(List.getItem());
    }

    @FXML
    public void ShowCompletedClicked(ActionEvent actionEvent) {

        //call createDisplay for 1
        DisplayList.setText(createDisplay(1, List));
    }

    @FXML
    public void ShowAllClicked(ActionEvent actionEvent) {

        //call createDisplay for default
        DisplayList.setText(createDisplay(0, List));
    }

    @FXML
    public void ShowIncompleteClicked(ActionEvent actionEvent) {

        //call createDisplay for 2
        DisplayList.setText(createDisplay(2, List));
    }

    @FXML
    public void NewItemClicked(ActionEvent actionEvent) {

        UserPrompt.setText("Enter a description: Between 1 and 256 characters");
        currentCommand = 3;
    }

    @FXML
    public void NewToDoListClicked(ActionEvent actionEvent) {

        //call Clear Items method
        List.clearItemList();
        DisplayList.setText("");
    }

    //help functions
    public boolean dateChecker(String Date) {

        //if Date match format YYYY-MM-DD //use .matchs
        //return ture;
        if (Date != null) {
            return Date.matches("[0-9][0-9][0-9][0-9]-[0-1][0-9]-[0-3][0-9]");
        }
        else
        {
            return false;
        }
    }

    public boolean descChecker(String Desc)
    {
        if (Desc != null) {
            return Desc.length() > 0 && Desc.length() < 257;
        }
        else{
            return false;
        }
    }

    private void getDateInput()
    {
        UserPrompt.setText("Enter a date: YYYY-MM-DD");

        if (dateChecker(UserInput.getText())) {
            Date = UserInput.getText();
            validInput = 0;
        }
        else
        {
            UserPrompt.setText("Try Again: Enter a Date");
            validInput = 1;
        }
    }

    private void getDescInput() {
        UserPrompt.setText("Enter a description: Between 1 and 256 characters");

        if (descChecker(UserInput.getText())) {
            Desc = UserInput.getText();
            validInput = 0;
        }
        else
        {
            UserPrompt.setText("Try Again: Enter a description");
            validInput = 1;
        }
    }

    public String createDisplay(int Done, ToDoList List)
    {
        StringBuilder updatedDisplay = new StringBuilder();

        switch (Done) {
            case 1 -> {
                //loop threw the current ToDoList items
                //if Done is true
                //add desc then date to a string and then new line
                //update DisplayList to the new string
                for (int i = 0; i < List.ItemSize(); i++) {
                    if (List.isDone(i)) {
                        updatedDisplay.append(List.getItem(i)).append("\n");
                    }
                }
                return updatedDisplay.toString();
            }
            case 2 -> {
                //loop threw the current ToDoList items
                //if Done is false
                //add desc then date to a string and then new line
                //update DisplayList to the new string
                for (int i = 0; i < List.ItemSize(); i++) {
                    if (!List.isDone(i)) {
                        updatedDisplay.append(List.getItem(i)).append("\n");
                    }
                }
                return updatedDisplay.toString();
            }
            default -> {
                //loop threw the current ToDoList items
                //add desc then date to a string and then new line
                //update DisplayList to the new string
                for (int i = 0; i < List.ItemSize(); i++) {
                    updatedDisplay.append(List.getItem(i)).append("\n");
                }
                return updatedDisplay.toString();
            }
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        fileChooser.setInitialDirectory(new File("C:\\"));
        List = new ToDoList();
    }
}
