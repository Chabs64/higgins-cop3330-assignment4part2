/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Chad Higgins
 *
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class ToDoManagerController {

    //
    private final ToDoList List = new ToDoList();
    private String Desc;
    private String Date;

    //text section
    public TextArea DisplayList;
    public TextField UserInput;
    public TextArea UserPrompt;

    @FXML
    public void EditDateClicked(ActionEvent actionEvent) {

        //update UserPrompt "Enter in new Date"
        // get current Item object from ToDoList, call getItem
        // call editItemDate
    }

    @FXML
    public void EditDescClicked(ActionEvent actionEvent) {

        //update UserPrompt "Enter in new description"
        // get current Item object from ToDoList, call getItem
        // call editItemDesc
    }

    @FXML
    public void MarkDoneClicked(ActionEvent actionEvent) {

        // get current Item object from ToDoList, call getItem
        //call setDone
    }

    @FXML
    public void DeleteItemClicked(ActionEvent actionEvent) {

        //check if isEmpty
        //use list method to remove the item from the ToDoList
    }

    @FXML
    public void SaveClicked(ActionEvent actionEvent) {

        //call ListToFile
    }

    @FXML
    public void LoadClicked(ActionEvent actionEvent) {

        //call FileToList
    }

    @FXML
    public void EnterListener(KeyEvent keyEvent) {

        //if enter key is hit
        //get text from userInput
    }

    @FXML
    public void NextItemClicked(ActionEvent actionEvent) {

        //call .next on the current ToDoList object
    }

    @FXML
    public void PreviousItemClicked(ActionEvent actionEvent) {

        //call .previous on the current List<ToDoList> object
    }

    @FXML
    public void ShowCompletedClicked(ActionEvent actionEvent) {

        //loop threw the current ToDoList items
        //if Done is true
        //add desc then date to a string and then new line
        //update DisplayList to the new string
    }

    @FXML
    public void ShowAllClicked(ActionEvent actionEvent) {

        //loop threw the current ToDoList items
        //add desc then date to a string and then new line
        //update DisplayList to the new string
    }

    @FXML
    public void ShowIncompleteClicked(ActionEvent actionEvent) {

        //loop threw the current ToDoList items
        //if Done is false
        //add desc then date to a string and then new line
        //update DisplayList to the new string
    }

    @FXML
    public void NewItemClicked(ActionEvent actionEvent) {
        List.newItem(Date, Desc);
    }

    @FXML
    public void NewToDoListClicked(ActionEvent actionEvent) {

        //if ToDoList is Null, create new ToDoList
        //else call Clear Items method
    }


    //help functions
    private boolean dateChecker(String Date) {

        //if Date match format YYYY-MM-DD //use .matchs
        //return ture;

        return false;
    }

    private boolean descChecker(String Desc)
    {
        return Desc.length() > 1 && Desc.length() < 256;
    }
}
