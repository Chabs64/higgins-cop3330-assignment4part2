/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Chad Higgins
 *
 */

package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
6. A user shall be able to add a new todo list
7. A user shall be able to remove an existing todo list
8. A user shall be able to edit the title of an existing todo list
9. A user shall be able to add a new item to an existing todo list
10.A user shall be able to remove an item from an existing todo list
11. A user shall be able to edit the description of an item within an existing todo list
12. A user shall be able to edit the due date of an item within an existing todo list
13. A user shall be able to mark an item in a todo list as complete
14. A user shall be able to display all of the existing items in a todo list
15. A user shall be able to display only the incompleted items in a todo list
16. A user shall be able to display only the completed items in a todo list
17. A user shall be able to save all of the items in a single todo list to external storage
18. A user shall be able to save all of the items across all of the todo lists to external storage
19. A user shall be able to load a single todo list that was previously saved to external storage
20. A user shall be able to load multiple todo lists that were previous saved to external storage
 */

class FileManagerTest {

    @Test
    void listToFile() {

        //create "testFile" in resources
        //create ToDoList
        // add items

        //call listToFile

        //loop
        //compare files by reading each lines from both files
        //if false assert false

        //assert true
    }

    @Test
    void fileToList() {

        //create test file
        //create test list

        //create new ToDoList
        //call fileToList

        //loop thru each element and compare
        //assert false is no match

        //else assert true


    }

    @Test
    void allFilesToList() {

        //create 2 test files
        //create test list<toDoItems>

        //create new ToDoList
        //call allFilesToList

        //loop thru each ToDoList
        //loop thru each item and compare
        //assert false is no match

        //else assert true
    }

    @Test
    void ALlListsToFile() {

        //create 2 ToDoList
        //add newItems
        //create a masterSave that hold the 2 file names

        //call AllListsToFile

        //find each file with the masterSave
        //read each file and compare element
        //assert false is elements don't match

        //assert True
    }

    @Test
    void loadMasterSave() {

        //create masterSaveTestFile
        //create new masterSave List
        //call LoadMasterSave

        //create masterSaveKey
        // add the same test elements

        //loop thru each element in masterSaveList compared to masterSave Key
        //if false assert false

        //assert true.
    }

    @Test
    void saveMasterSave() {

        //create test master save file
        //create masterSave list
        // add elements

        //call save Master Save

        //loop
        //compare files by reading each lines from both files
        //if false assert false

        //assert true
    }
}