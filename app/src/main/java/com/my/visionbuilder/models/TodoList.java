package com.my.visionbuilder.models;

public class TodoList {
    int todoList_Id;
    String todoList_Title, todoList_Date, todoList_Time, todoList_Status;

    public TodoList(int todoList_Id, String todoList_Title, String todoList_Date, String todoList_Time, String todoList_Status) {
        this.todoList_Id = todoList_Id;
        this.todoList_Title = todoList_Title;
        this.todoList_Date = todoList_Date;
        this.todoList_Time = todoList_Time;
        this.todoList_Status = todoList_Status;
    }

    public int getTodoList_Id() {
        return todoList_Id;
    }

    public void setTodoList_Id(int todoList_Id) {
        this.todoList_Id = todoList_Id;
    }

    public String getTodoList_Title() {
        return todoList_Title;
    }

    public void setTodoList_Title(String todoList_Title) {
        this.todoList_Title = todoList_Title;
    }

    public String getTodoList_Date() {
        return todoList_Date;
    }

    public void setTodoList_Date(String todoList_Date) {
        this.todoList_Date = todoList_Date;
    }

    public String getTodoList_Time() {
        return todoList_Time;
    }

    public void setTodoList_Time(String todoList_Time) {
        this.todoList_Time = todoList_Time;
    }

    public String getTodoList_Status() {
        return todoList_Status;
    }

    public void setTodoList_Status(String todoList_Status) {
        this.todoList_Status = todoList_Status;
    }
}
