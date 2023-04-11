package AccessModifiers.Private;

public class Student {
  private int rollNo = 101;

  public Student(){
    rollNo = 102;
  }

  private void printRollNumber(){
    System.out.println(rollNo);
  }

  public static void main(String[] args){
    Student s = new Student();
  }

  public void abc(){
    printRollNumber();
  }
}
