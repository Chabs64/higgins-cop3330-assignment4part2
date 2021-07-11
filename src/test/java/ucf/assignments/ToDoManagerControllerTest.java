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

class ToDoManagerControllerTest {

    @Test
    void dateCheckerUserFormat3_2() {
        //create a string give it a proper date
        String TheDate = "1999-01-01";

        //call dateChecker
        ToDoManagerController controller = new ToDoManagerController();
        //assert that the dateChecker is right
        assertTrue(controller.dateChecker(TheDate));
    }

    @Test
    void dateCheckerGregorain3_1() {
        //create a string give it a proper date
        String TheDate = "1999-99-99";

        //call dateChecker
        ToDoManagerController controller = new ToDoManagerController();
        //assert that the dateChecker is right
        assertFalse(controller.dateChecker(TheDate));
    }

    @Test
    void descCheckerSizeMin2_1() {
        //create string, make it empty
        String testDesc = null;

        ToDoManagerController controller = new ToDoManagerController();
        //call descChecker
        assertFalse(controller.descChecker(testDesc));
    }

    @Test
    void descCheckerSizeMax2_1() {
        //create string, make it more then 256 chars
        String testDesc = "";
        for (int i = 0; i < 1000; i++) {
            testDesc.concat("A");
        }

        ToDoManagerController controller = new ToDoManagerController();
        //call descChecker
        assertFalse(controller.descChecker(testDesc));
    }

    @Test
    void descCheckerGood2_1() {
        //create string, make it between 1 and 256 char
        String testDesc = "Good Desc";

        ToDoManagerController controller = new ToDoManagerController();
        //call descChecker
        assertTrue(controller.descChecker(testDesc));
    }

    @Test
    void createDisplayShowAll10() {
        //create new todolist
        //add test elements
        ToDoList testList = new ToDoList();
        testList.newItem("YYYY-MM-DD", "Desc1");
        testList.newItem("YYYY-MM-DD", "Desc2");
        testList.nextItem();
        testList.editItemDone();
        testList.newItem("YYYY-MM-DD", "Desc3");

        //create test elements string
        String testElement = "Incomplete\nDesc1\nYYYY-MM-DD\n\nCompleted\nDesc2\nYYYY-MM-DD\n\nIncomplete\nDesc3\nYYYY-MM-DD\n\n";

        //call createDisplay
        ToDoManagerController controller = new ToDoManagerController();
        //assert createDisplay returns the right string
        assertEquals(testElement, controller.createDisplay(3, testList));
    }

    @Test
    void createDisplayShowIncomplete11() {
        //create new todolist
        //add test elements
        ToDoList testList = new ToDoList();
        testList.newItem("YYYY-MM-DD", "Desc1");
        testList.newItem("YYYY-MM-DD", "Desc2");
        testList.nextItem();
        testList.editItemDone();
        testList.newItem("YYYY-MM-DD", "Desc3");

        //create test elements string
        String testElement = "Incomplete\nDesc1\nYYYY-MM-DD\n\nIncomplete\nDesc3\nYYYY-MM-DD\n\n";

        //call createDisplay
        ToDoManagerController controller = new ToDoManagerController();
        //assert createDisplay returns the right string
        assertEquals(testElement, controller.createDisplay(2, testList));
    }

    @Test
    void createDisplayShowCompleted12() {
        //create new todolist
        //add test elements
        ToDoList testList = new ToDoList();
        testList.newItem("YYYY-MM-DD", "Desc1");
        testList.newItem("YYYY-MM-DD", "Desc2");
        testList.nextItem();
        testList.editItemDone();
        testList.newItem("YYYY-MM-DD", "Desc3");

        //create test elements string
        String testElement = "Completed\nDesc2\nYYYY-MM-DD\n\n";

        //call createDisplay
        ToDoManagerController controller = new ToDoManagerController();
        //assert createDisplay returns the right string
        assertEquals(testElement, (String) controller.createDisplay(1, testList));
    }
}