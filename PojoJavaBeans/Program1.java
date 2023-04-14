package PojoJavaBeans;

public class Program1 {
  public static void main(String[] args){
    Employee e = new Employee();
    e.setID(101);
    e.name = "vidya";
    e.salary = 658789;

    System.out.println(e.getID());
    System.out.println(e.name);
    System.out.println(e.salary);
  }
}
