/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Chad Higgins
 *
 */

package ucf.assignments;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/*
1.The application shall manage a single list of items ------
        1.1 The list shall have the capacity to store at least 100 unique items -------
2. An item shall have a description --------
        2.1 A description shall be between 1 and 256 characters in length ------
3. An item shall have a due date ---------
        3.1 A due date shall be a valid date within the Gregorian Calendar -------
        3.2 A due date shall be displayed to users in the format: YYYY-MM-DD  -------

4. A user shall be able to add a new item to the list ---------
5. A user shall be able to remove an item from the list -------
6. A user shall be able to clear the list of all items --------
7. A user shall be able to edit the description of an item within the list ---------
8. A user shall be able to edit the due date of an item within the list -----------
9. A user shall be able to mark an item in the list as either complete or incomplete ---------
10. A user shall be able to display all of the existing items in the list -----
11. A user shall be able to display only the incomplete items in the list -----
12. A user shall be able to display only the completed items in the list -----

13. A user shall be able to save the list (and all of its items) to external storage ----------
14. A user shall be able to load a list (and all of its items) from external storage ----------

15. The developer shall provide a help screen with directions on how to use the application.
    The help screen shall describe how to execute each behavioral requirement provided by the application
    (e.g. add an item, remove an item, edit an item, etc)
    The help screen shall include a dedication to "Rey"
    This help screen shall be provided as either a dedicated window within the application,
    or a markdown file called `readme.md` on your GitHub repository for the project.)
*/

class FileManagerTest {

    @Test
    void listToFileUserSave13() {

        //create "testFile"
        File testfile = new File("testFile.txt");
        //create "ListTestFile"
        File ListTestFile = new File("ListTestFile.txt");

        //create ToDoList
        ToDoList testList = new ToDoList();
        testList.newItem("1999-01-01", "Test Desc", "Completed");

        //call listToFile
        FileManager.ListToFile(ListTestFile, testList);

        //loop
        //compare files by reading each lines from both files
        Scanner scanner = new Scanner("testFile.txt");
        Scanner scanner2 = new Scanner("ListTestFile.txt");
        //if false assert false
        while(scanner.hasNextLine() && scanner2.hasNextLine())
        {
            if(!scanner.nextLine().equals(scanner2.nextLine()))
            {
                assertFalse(false);
            }
        }
        assertTrue(true);
    }

    @Test
    void fileToListUserLoad14() {

        //create test file
        File file = new File("testFile.txt");
        //create test list, with test values
        ToDoList testList = new ToDoList();
        testList.newItem("1999-01-01", "Test Desc", "Completed");

        //create new ToDoList
        //call fileToList
        ToDoList newList = FileManager.FileToList(file);

        //assert false is no match
        //else assert true
        assertEquals(newList.getItem(0), testList.getItem(0));
    }
}