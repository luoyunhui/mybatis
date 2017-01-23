package me.gacl.domain;

/**
 * Created by luoyunhui on 17/1/23.
 */
public class Teacher {
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
       return "Teacher [id=" + id + ", name=" + name + "]";

    }
}
