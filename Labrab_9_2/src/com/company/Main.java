package com.company;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Maxim", 19);
        Student student2 = new Student("Ira", 20);
        schoolBoy shket = new schoolBoy ("Ivan", 12);
        Conference conf = new Conference();
        conf.addLearner(student);
        conf.addLearner(student2);
        conf.addLearner(shket);
        conf.countingStudents();
        conf.countingShkets();
        conf.printConference();
    }
}
