package src.oop.Homework_3;

import src.oop.Homework_3.Business.CoursesManager;
import src.oop.Homework_3.Entities.Courses;

public class Main {
    public static void main(String[] args) {
        Courses course1 = new Courses("Programming", null);
        CoursesManager coursesManager = new CoursesManager();
        coursesManager.add(course1);
        
        for (Object course : course1.getListCourses()) {
            System.out.println(course);
        }
    }
}
