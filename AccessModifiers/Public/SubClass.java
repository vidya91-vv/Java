package AccessModifiers.Public;

public class SubClass extends Student {

  public static void main(String[] args){
    new SubClass().test();
  }

  public void test(){
    System.out.println(rollNo);
    printRollNumber();
  }
}

//public is access anywhere
