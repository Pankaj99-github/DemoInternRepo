package com.SpringToDatabase.SpringData.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Data           //from lombok getting getters,setters
@Entity         // shows this class representing the table
@Table(name="Student_DB")
public class Student {

    @Id
    @Column(name="ID")
    @GeneratedValue         //autogenerate id
    private int id;

    @Column(name="Student_marks")
    private int marks;

    @Column(name="NAME")

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, int marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}
