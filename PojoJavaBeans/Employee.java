package PojoJavaBeans;

public class Employee {
  private int id;
  public String name;
  protected double salary;
  
  public Employee(){
    System.out.println("No arg constractor is called");
  }
  public Employee(int id){
    this.id = id;
  }

  public void setID(int id){
    this.id = id;
  }
  public int getID(){
    return id;
  }
}
