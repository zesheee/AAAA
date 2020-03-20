package com.company;

import java.util.ArrayList;

public class Learner
{
    private String name;
    private int age;
    public void setName(String nazv) {
        name = nazv;
    }
    public void setAge(int vozr) {
        age = vozr;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public Learner(String nazv, int vozr)
    {
        name = nazv;
        age = vozr;
    }

}

class schoolBoy extends Learner{
    public schoolBoy(String nazv, int vozr) {
        super(nazv, vozr);
    }
    public String toString()
    {
        return getName() + " " + getAge();
    }
}

class Student extends Learner{
    public Student(String nazv, int vozr) {
        super(nazv, vozr);
    }
    public String toString()
    {
        return getName() + " " + getAge();
    }

}

class Conference
{
private ArrayList<Learner> visiters = new ArrayList<Learner>();
public void addLearner(Learner x)
{
    visiters.add(x);
}
public void CLearner(ArrayList<Learner> n)
{
    visiters = n;
}
public void printConference()
{
    System.out.println("В конференции: ");
    for(Learner a:visiters)
    {
        System.out.println("\t"+a.toString());
    }
}
public void countingStudents() {
    int n = 0;
    for (Learner a : visiters) {
        if (a instanceof Student) {
            n++;
        }
    }
    System.out.println(n + " студента(ов)");
}
public void countingShkets() {
        int k = 0;
        for (Learner a : visiters) {
            if (a instanceof schoolBoy) {
                k++;
            }
        }
        System.out.println(k + " шкетов(ов)");
}
}
