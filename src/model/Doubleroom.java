package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Doubleroom implements Serializable {
    public String name;
    public String contact;
    public String gender;
    public String name2;
    public String contact2;
    public String gender2;
    public ArrayList<Food> food = new ArrayList<>();

    public Doubleroom() {}

    public Doubleroom(String name, String contact, String gender,
               String name2, String contact2, String gender2) {
        this.name = name;
        this.contact = contact;
        this.gender = gender;
        this.name2 = name2;
        this.contact2 = contact2;
        this.gender2 = gender2;
    }
}
