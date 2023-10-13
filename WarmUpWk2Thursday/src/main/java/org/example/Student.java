package org.example;

public class Student {
    public String firstName;
    public String lastName;
    public String studentId;
    public String yearInCollege;
    public boolean internationalStudent;
    public String address;

    public Student( String firstName, String lastName, String studentId, String yearInCollege, boolean internationalStudent, String address){
        this. firstName=firstName;
        this. lastName=lastName;
        this. studentId= studentId;
        this. yearInCollege= yearInCollege;
        this.internationalStudent=internationalStudent;
        this. address= address;
    }
    public Student(String firstName, String lastName, String studentId){
        this. firstName= firstName;
        this.lastName= lastName;
        this. studentId= studentId;
        this. yearInCollege= "";
        this. internationalStudent=false;
        this. address= "";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getYearInCollege() {
        return yearInCollege;
    }

    public void setYearInCollege(String yearInCollege) {
        this.yearInCollege = yearInCollege;
    }

    public boolean isInternationalStudent() {
        return internationalStudent;
    }

    public void setInternationalStudent(boolean internationalStudent) {
        this.internationalStudent = internationalStudent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String greeting(String firstName, String lastName){
        return "Hi my name is" + firstName + lastName;
    }
}
