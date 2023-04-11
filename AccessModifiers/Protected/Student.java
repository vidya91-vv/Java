package AccessModifiers.Protected;

public class Student {
  protected int rollNo = 101;

  protected Student(){
    rollNo = 102;
  }

  protected void printRollNumber(){
    System.out.println(rollNo);
  }

  public static void main(String[] args){
    Student s = new Student();
  }

  public void abc(){
    printRollNumber();
  }
}


