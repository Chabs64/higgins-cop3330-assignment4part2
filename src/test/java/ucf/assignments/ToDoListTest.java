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
        2.1 A description shall be between 1 and 256 characters in length
3. An item shall have a due date ---------
        3.1 A due date shall be a valid date within the Gregorian Calendar
        3.2 A due date shall be displayed to users in the format: YYYY-MM-DD

4. A user shall be able to add a new item to the list ---------
5. A user shall be able to remove an item from the list -------
6. A user shall be able to clear the list of all items --------
7. A user shall be able to edit the description of an item within the list ---------
8. A user shall be able to edit the due date of an item within the list -----------
9. A user shall be able to mark an item in the list as either complete or incomplete ---------
10. A user shall be able to display all of the existing items in the list
11. A user shall be able to display only the incomplete items in the list
12. A user shall be able to display only the completed items in the list

13. A user shall be able to save the list (and all of its items) to external storage ----------
14. A user shall be able to load a list (and all of its items) from external storage ----------

15. The developer shall provide a help screen with directions on how to use the application.
    The help screen shall describe how to execute each behavioral requirement provided by the application
    (e.g. add an item, remove an item, edit an item, etc)
    The help screen shall include a dedication to "Rey"
    This help screen shall be provided as either a dedicated window within the application,
    or a markdown file called `readme.md` on your GitHub repository for the project.)
*/

class ToDoListTest {

    @Test
    void newItemUserCan4() {

        //create new ToDoList
        ToDoList testList = new ToDoList();

        //call newItem("desc", "YYYY-MM-DD")
        testList.newItem("YYYY-MM-DD", "Desc");

        //Assert ToDoList.getItem , "Incomplete\n"+"desc\n"+"date\n"
        assertEquals("Incomplete\nDesc\nYYYY-MM-DD\n", testList.getItem());
    }

    @Test
    void editItemDateUserCan10() {

        //create new ToDoItem
        ToDoList testList = new ToDoList();
        //call new item
        testList.newItem("YYYY-MM-DD", "Desc");

        //call editItemDate("new date")
        testList.editItemDate("1999-01-01");

        //Assert getDate not equal to old date
        assertNotEquals("Incomplete\nDesc\nYYYY-MM-DD\n", testList.getItem());
    }

    @Test
    void editItemDescUserCan9() {

        //create new ToDoItem
        ToDoList testList = new ToDoList();
        //call new item
        testList.newItem("YYYY-MM-DD", "Desc");

        //call editItemDesc("new desc")
        testList.editItemDesc("new Desc");

        //Assert getDesc not equal to old desc
        assertNotEquals("Incomplete\nDesc\nYYYY-MM-DD\n", testList.getItem());
    }

    @Test
    void getItemUserCan6() {

        //create New ToDoList, add new ToDoItem
        ToDoList testList = new ToDoList();
        testList.newItem("Date", "Desc");

        //Assert getItem equal "Incomplete\ndesc\ndate\n"
        assertEquals("Incomplete\nDesc\nDate\n", testList.getItem());
    }

    @Test
    void nextItemUserNav() {
        //create new todolist
        ToDoList testList = new ToDoList();
        //add 2 items
        testList.newItem("Date1", "Desc1");
        testList.newItem("Date2", "Desc2");
        testList.newItem("Date3", "Desc3");

        //call next item, check if goes to new item
        testList.nextItem();
        testList.nextItem();
        testList.nextItem();
        testList.nextItem();

        //assert next item is next item, by calling get item
        assertEquals("Incomplete\nDesc3\nDate3\n", testList.getItem());
    }

    @Test
    void prevItem() {
        //create new todolist
        ToDoList testList = new ToDoList();
        //add 2 items
        testList.newItem("Date1", "Desc1");
        testList.newItem("Date2", "Desc2");
        testList.newItem("Date3", "Desc3");

        //call prev item, check if goes to new item
        testList.prevItem();
        testList.prevItem();
        testList.prevItem();
        testList.prevItem();

        //assert prev item is not next item, by calling get item
        assertEquals("Incomplete\nDesc1\nDate1\n", testList.getItem());
    }


    @Test
    void removeItemUserCan5() {
        //create new todolist
        ToDoList testList = new ToDoList();
        //add 2 items
        testList.newItem("Date1", "Desc1");
        testList.newItem("Date2", "Desc2");
        testList.newItem("Date3", "Desc3");

        //call next item, to got to next item
        testList.nextItem();
        //call removeItem, until no items remain
        testList.removeItem();
        testList.removeItem();
        testList.removeItem();
        testList.removeItem();

        //assert that the empty list should be empty
        assertEquals(null, testList.getItem());
    }

    @Test
    void clearItemListUserCan6() {
        //create new todolist
        ToDoList testList = new ToDoList();
        //add 2 items
        testList.newItem("Date1", "Desc1");
        testList.newItem("Date2", "Desc2");
        testList.newItem("Date3", "Desc3");

        //call clearItemList
        testList.clearItemList();

        //assert that the list should be empty
        assertEquals(null, testList.getItem());
    }

    @Test
    void itemSizeCanHaveAtLeast100Item1_1() {

        //create new ToDoList
        ToDoList testList = new ToDoList();

        //call newItem("desc", "YYYY-MM-DD"), more then 100 times
        for (int i = 0; i < 1000; i++) {
            testList.newItem("YYYY-MM-DD", "Desc");
        }

        //Assert ToDoList size is greater then 100
        assertTrue(100 < testList.ItemSize());
    }
}