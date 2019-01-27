/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucariel
 */
public class Student {
    private String name;
    private String studentNumber;
    
    public Student(String name, String snumber){
        this.name = name;
        this.studentNumber=snumber;
    }
    
    public String toString(){
        return this.name+" ("+this.studentNumber+")";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }
    
    
}
