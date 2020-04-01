package model;

import model.Student;

import java.util.Iterator;
import java.util.LinkedList;

public class StudentList {



    LinkedList<Student> listStudent=new LinkedList<Student>();

    public void inputList(){
        Student student1=new Student(1,"Duc");
        listStudent.add(student1);
        Student student2=new Student(2,"Huy");
        listStudent.add(student2);

    }
    public void displayList(){
        for(int i=0;i<listStudent.size();i++){
            listStudent.get(i).display();
        }

        for(Student st:listStudent){
            st.display();
        }

        Iterator<Student> iterator=listStudent.iterator();
        while (iterator.hasNext()){
            iterator.next().display();
        }
    }
}
