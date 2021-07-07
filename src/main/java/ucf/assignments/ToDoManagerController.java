/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Chad Higgins
 *
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class ToDoManagerController {

    //text section
    public TextArea DisplayList;
    public TextField UserInput;
    public TextArea UserPrompt;
    public TextArea DisplayTitle;


    public void EditDateClicked(ActionEvent actionEvent) {

        //update UserPrompt "Enter in new Date"
        // get current Item object from ToDoList, call getItem
        // call editItemDate
    }

    public void EditDescClicked(ActionEvent actionEvent) {

        //update UserPrompt "Enter in new description"
        // get current Item object from ToDoList, call getItem
        // call editItemDesc
    }

    public void MarkDoneClicked(ActionEvent actionEvent) {

        // get current Item object from ToDoList, call getItem
        //call setDone
    }

    public void DeleteItemClicked(ActionEvent actionEvent) {

        //check if isEmpty
        //use list method to remove the item from the ToDoList

    }

    public void SaveClicked(ActionEvent actionEvent) {

        //call ListToFile
    }

    public void SaveAllClicked(ActionEvent actionEvent) {

        //call AllListToFile
    }

    public void LoadClicked(ActionEvent actionEvent) {

        //call FileToList
    }

    public void LoadAllClicked(ActionEvent actionEvent) {

        //call AllFilesToList
    }

    public void EditTitleClicked(ActionEvent actionEvent) {

        //call setTitle
        //update DisplayTitle to show new Title
    }

    public void DeleteToDoListClicked(ActionEvent actionEvent) {

        //check if isEmpty
        //use list method to remove the ToDoList Object from List
    }

    public void EnterListener(KeyEvent keyEvent) {

        //if enter key is hit
        //get text from userInput
    }

    public void NextItemClicked(ActionEvent actionEvent) {

        //call .next on the current ToDoList object
    }

    public void NextListClicked(ActionEvent actionEvent) {

        //call .next on the current List<ToDoList> object
    }

    public void PreviousListClicked(ActionEvent actionEvent) {

        //call .previous on the current ToDoList object
    }

    public void PreviousItemClicked(ActionEvent actionEvent) {

        //call .previous on the current List<ToDoList> object
    }

    public void NewToDoListClicked(ActionEvent actionEvent) {

        //update UserPrompt "What is the Title"

        //ToDoList x = new ToDoList( call for UserInput)
        //Add the item to the ToDoList List
    }

    public void ShowCompletedClicked(ActionEvent actionEvent) {

        //loop threw the current ToDoList items
        //if Done is true
        //add desc then date to a string and then new line
        //update DisplayList to the new string
    }

    public void ShowAllClicked(ActionEvent actionEvent) {

        //loop threw the current ToDoList items
        //add desc then date to a string and then new line
        //update DisplayList to the new string
    }

    public void ShowIncompleteClicked(ActionEvent actionEvent) {

        //loop threw the current ToDoList items
        //if Done is false
        //add desc then date to a string and then new line
        //update DisplayList to the new string
    }

    public void NewItemClicked(ActionEvent actionEvent) {

        //call newItem method
    }

    public void SortItemsClicked(ActionEvent actionEvent) {

        //call SortItemByDate
    }
}
