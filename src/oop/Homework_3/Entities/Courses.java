package src.oop.Homework_3.Entities;

import java.util.ArrayList;

public class Courses {
    private ArrayList<Courses> listCourses = new ArrayList<>();

    public ArrayList<Courses> getListCourses() {
        return listCourses;
    }

    public void setListCourses(ArrayList<Courses> listCourses) {
        this.listCourses = listCourses;
    }

    private String type;
    Category category;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Courses(String type, Category category) {
        this.type = type;
        this.category = category;
    }
}
