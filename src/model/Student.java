package model;

public class Student {
    private int age;
    private String gender;
    private long idNum;

    public Student(int age, String gender, long idNum) {
        this.age = age;
        this.gender = gender;
        this.idNum = idNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getIdNum() {
        return idNum;
    }

    public void setIdNum(long idNum) {
        this.idNum = idNum;
    }

    @Override
    public String toString() {
        return String.format("Student:{\nage: %d,\ngender: %s,\nidNumber: %d\n}", getAge(),getGender(),getIdNum());
    }
}
