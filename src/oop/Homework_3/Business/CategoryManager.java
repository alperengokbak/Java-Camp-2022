package src.oop.Homework_3.Business;

import java.util.ArrayList;

import src.oop.Homework_3.Icategory;
import src.oop.Homework_3.Entities.Category;

public class CategoryManager implements Icategory{
    ArrayList<Category> listCategory = new ArrayList<>();

    @Override
    public <T> void add(T entity) {
        listCategory.add((Category) entity);
        System.out.println("Added category the " + ((Category) entity).getType());
    }

    @Override
    public <T> void remove(T entity) {
        listCategory.remove(entity);
        System.out.println("Removed category.");
    }
}
