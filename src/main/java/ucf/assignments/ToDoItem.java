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

    public ToDoItem(String date, String desc, String Done){

        setDate(date);
        setDesc(desc);
        if (Done.equals("Completed"))
        setTrue();

        setDone();
    }

    public String getDate(){ return Date;}
    public void setDate(String date){

        this.Date = date;
    }

    public String getDesc(){return Description;}
    public void setDesc(String Desc){

        this.Description = Desc;
    }

    public String getDone(){ return Done;}
    public void setDone() {
        if (Done != "Completed") {
            this.Done = "Completed";
        }
        else
        {
            this.Done = "Incomplete";
        }
    }

    public void setTrue() {
        this.Done = "Completed";
    }
}
