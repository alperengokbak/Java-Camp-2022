package src.oop.Homework_3.Business;

import src.oop.Homework_3.Iinstructor;
import src.oop.Homework_3.Entities.Courses;
import src.oop.Homework_3.Entities.Instructor;

public class InstructorManager implements Iinstructor{
    Instructor instructor;
    @Override
    public void displayCourse(Courses courses){
        System.out.println("Teaching " + courses.getType() + " by " + instructor.getLastName() + " " + instructor.getFirstName());
    }
    
}
