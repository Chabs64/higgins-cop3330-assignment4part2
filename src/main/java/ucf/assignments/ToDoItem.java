/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Chad Higgins
 *
 */

package ucf.assignments;

public class ToDoItem {

    private String Done;
    private String Description;
    private String Date;

    public ToDoItem(String date, String desc){

        setDate(date);
        setDesc(desc);
        setDone();
    }

    public String getDate(){ return Date;}
    public void setDate(String date){

        Date = date;
    }

    public String getDesc(){return Description;}
    public void setDesc(String Desc){

        Description = Desc;
    }

    public String getDone(){ return Done;}
    public void setDone() {
        if (Done != "true") {
            Done = "true";
        }
        else
        {
            Done = "false";
        }
    }
}
