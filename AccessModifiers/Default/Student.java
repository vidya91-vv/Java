package AccessModifiers.Default;

 class Student {
   int rollNo = 101;

   Student(){
    rollNo = 102;
  }

   void printRollNumber(){
    System.out.println(rollNo);
  }

  public static void main(String[] args){
    Student s = new Student();
  }

  public void abc(){
    printRollNumber();
  }
}
