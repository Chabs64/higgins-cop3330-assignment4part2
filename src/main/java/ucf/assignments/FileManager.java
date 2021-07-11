/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Chad Higgins
 *
 */

package ucf.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileManager {

    public static void ListToFile(File file, ToDoList List)
    {
        //create or edit a file with the user FileName
        //loop threw elements and add the done\n desc\n date\n
        if(file != null) {

            try {
                PrintWriter printWriter = new PrintWriter(file);

                for (int i = 0; i < List.ItemSize(); i++) {
                    printWriter.write(List.getItem(i));
                }

                printWriter.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public static ToDoList FileToList(File file) {

        ToDoList LoadedList = new ToDoList();
        String Date = "";
        String Desc = "";
        String Done = "";
        //check for File using user path, crash if bad path
        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine())
            {
                for (int i = 0; i <= 3; i++) {
                    if (i == 0)
                    {
                        Done = scanner.nextLine();
                    }
                    else if(i == 1)
                    {
                        Desc = scanner.nextLine();
                    }
                    else if(i == 2)
                    {
                        Date = scanner.nextLine();
                    }
                    else
                    {
                        LoadedList.newItem(Date, Desc, Done);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //if good, add item to ToDoList
        return LoadedList;
    }

}
