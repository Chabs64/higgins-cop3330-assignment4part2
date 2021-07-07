/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Chad Higgins
 *
 */

package ucf.assignments;

public class ToDoItem {

    //int item number

    private boolean Done;
    private String Description;
    private String Date;

    public ToDoItem(){

        //set date
        //set desc
        //set done to false
    }

    public String getDate(){ return Date;}
    public void setDate(String date){

        //Date = date;
    };

    public String getDesc(){return Description;}
    public void setDesc(String Desc){

        //Description = Desc;
    }

    public boolean getDone(){ return Done;}
    public void setDone(){Done = true;}
}
