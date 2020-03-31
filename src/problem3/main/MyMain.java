/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem5.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String args[]) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("ram",14);
        obj.insert("Mohit",21);
        obj.insert("Muskan",20);
        obj.insert("Aishwarya",2);
        obj.insert("Uddeshya",53);
        System.out.println("Students according to their roll number are: ");
        obj.peep();
    }
}
