package ExceptionHandling;

public class Program2 {
  
    public static void main(String[] args){
     method2();


    }
      public static void method2(){
        method1();
      }

      // stacktrace

      /*
       * Exception name - java.lang.ArithameticException
       * Exception message - 
       * Which line number
       * Methods info
       */
     

    public static void method1(){
        System.out.println("Program execution start");
           int fNumber = 8;
           int sNumber =0;
           int result;

           result = fNumber/sNumber;

           System.out.println("output is: "+result);

            System.out.println("program execution end");


    }
  }

