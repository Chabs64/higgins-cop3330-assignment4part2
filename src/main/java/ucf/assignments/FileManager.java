/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Chad Higgins
 *
 */

package ucf.assignments;

import java.util.List;

public class FileManager {

    public void ListToFile(ToDoList currentList)
    {

        //create or edit a file with the ToDoList Title
        //add the title to the first line
        //loop threw elements and add the desc first and then add date on separate line

    }

    public ToDoList FileToList(String Title)
    {
        //check if the title exist by calling getToDoList, if not re prompt the user for a new title
        //then load the file with that title
        //add the title to the ToDoList
        //then loop threw the rest of the file add each element to the ToDoItems
        //return the ToDoList
        return null;
    }


    public ToDoList AllFilesToList()
    {
        //loop threw the masterSaveFile and
        //call FileToList for each title
        //return the ToDoList
        return null;
    }

    public void AllListsToFile(List<ToDoList> currentList)
    {
        //loop threw the list
        //call ListToFile

    }


    public List<String> LoadMasterSave()
    {
        //make a list of strings
        //loop threw the file and add the titles to the string list
        //return the List<String>
        return null;
    }

    public void SaveMasterSave()
    {
        //List<string> = getMasterSave
        //create or overwrite 'MasterSave' file
        //write each element of the master save to the file separated by newLines
    }



}
