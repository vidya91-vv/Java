package StaticAndNonstatic;

public class Test1 {
  static int number;
   static{
    System.out.println("static block");
   }
   {
    System.out.println("non-static block");
   }
   public Test1(){
      System.out.println("constructor");
      number = 10;
   }
  public static void main(String[] args){

    System.out.println("main method");
   /* 
    Test1 t1 = new Test1();
    Test1 t2 = new Test1();
    Test1 t3 = new Test1();
    Test1 t4 = new Test1();
    Test1 t5 = new Test1();
    */


    //System.out.println(t1.number);
  }
}
