package PojoJavaBeans;

public class Program2 {
  public static void main(String[] args){
    Employee e1 = new Employee();
    e1.setID(101);
    e1.name = "vidya";
    e1.salary = 658789;


    Employee e2 = new Employee();
    e2.setID(102);
    e2.name = "vinod";
    e2.salary = 658789;

    Employee e3 = new Employee();
    e3.setID(103);
    e3.name = "mounika";
    e3.salary = 658789;

    Employee[] employees = new Employee[] {e1, e2, e3};
  }
}
