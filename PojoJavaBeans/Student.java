package PojoJavaBeans;

import java.io.Serializable;

public class Student implements Serializable{
  private int id;
  private String name;
  private double marks;

  public Student(){

  }

  public Student(int id, String name){

  }

  public int getID(){
     return id;
  }
  public void setID(int id){
     this.id = id;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }

  public double getMarks(){
    return marks;
  }
  public void setMarks(double marks){
    this.marks = marks;
  }
}
