package controller;

import model.StudentList;

public class Main {
    public static void main(String[] args) {
        StudentList studentList=new StudentList();
        studentList.inputList();
        studentList.displayList();
    }
}
