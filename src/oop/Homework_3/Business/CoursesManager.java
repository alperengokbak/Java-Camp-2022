package src.oop.Homework_3.Business;

import src.oop.Homework_3.Icourses;
import src.oop.Homework_3.Entities.Courses;

public class CoursesManager implements Icourses{

    @Override
    public <T> void add(T entity) {
        ((Courses) entity).getListCourses().add((Courses) entity);
        System.out.println("Added course the " + ((Courses) entity).getType());
    }

    @Override
    public <T> void remove(T entity) {
        ((Courses) entity).getListCourses().remove(entity);
        System.out.println("Removed course.");
    }
}
