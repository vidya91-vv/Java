package ExceptionHandling;

public class Program3 {
  public static void main(String[] args){
    System.out.println("Program execution start");
    int fNumber = 9;
    int sNumber = 1;
    int result = 0;

    try{
       result = fNumber/sNumber;
    }
    catch(ArithmeticException ae){
       System.out.println(ae.toString());  //write a logic to enter this message into log files
       throw ae;
       //System.out.println(ae.toString());
    }
    finally{
      System.out.println("finally block");
    }

    result = fNumber/sNumber;

    System.out.println("output is: "+result);

    System.out.println("program execution end");
  }
}
