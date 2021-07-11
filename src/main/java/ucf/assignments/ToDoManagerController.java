/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Chad Higgins
 *
 */

package ucf.assignments;

import javafx.event.ActionEvent;
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
import java.util.ResourceBundle;

public class ToDoManagerController implements Initializable {

    private ToDoList List;
    private String Desc;
    private String Date;
    private boolean InputUpdate;

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

        WaitForUser();

        // call editItemDate, listen for input
        List.editItemDate(UserInput.getText());

        // get current Item object from ToDoList, call getItem
        DisplayList.setText(List.getItem());
    }

    @FXML
    public void EditDescClicked(ActionEvent actionEvent) {

        //update UserPrompt "Enter in new description"
        UserPrompt.setText("Enter in new description");

        WaitForUser();

        // call editItemDesc, listen for input
        List.editItemDesc(UserInput.getText());

        // get current Item object from ToDoList, call getItem
        DisplayList.setText(List.getItem());
    }

    @FXML
    public void MarkDoneClicked(ActionEvent actionEvent) {

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

        //if enter key is hit
        //get text from userInput
        while(true) {
            if (keyEvent.getCode() == KeyCode.ENTER) {
                InputUpdate = true;
                break;
            }
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

        getDateInput();
        getDescInput();
        List.newItem(Date, Desc);
    }

    @FXML
    public void NewToDoListClicked(ActionEvent actionEvent) {

        //call Clear Items method
        List.clearItemList();
    }

    //help functions
    public boolean dateChecker(String Date) {

        //if Date match format YYYY-MM-DD //use .matchs
        //return ture;
        return Date.matches("[0-9][0-9][0-9][0-9]-[0-1][0-9]-[0-3][0-9]");
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
        while (true) {
            WaitForUser();

            if (dateChecker(UserInput.getText())) {
                Date = UserInput.getText();
                break;
            }
            else
            {
                UserPrompt.setText("Try Again: Enter a Date");
            }
        }
    }

    private void getDescInput()
    {
        UserPrompt.setText("Enter a description: Between 1 and 256 characters");
        while(true) {
            WaitForUser();
            if (descChecker(UserInput.getText())) {
                Desc = UserInput.getText();
                break;
            }
            else
            {
                UserPrompt.setText("Try Again: Enter a description");
            }
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

    private void WaitForUser() {
        while (InputUpdate) {
            Thread.onSpinWait();
        }
        InputUpdate = true;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        fileChooser.setInitialDirectory(new File("C:\\"));
        List = new ToDoList();
        InputUpdate = false;
    }
}
