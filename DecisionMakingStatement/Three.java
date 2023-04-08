package DecisionMakingStatement;

//import java.util.Scanner;

public class Three {
  public static void main(String[] args){

   //Scanner scanner = new Scanner(System.in);
   //System.out.println("What is your online assessement status");
   //String examStatus = scanner.nextLine();



    String examStatus = "Pass";
    if(examStatus == "Pass"){
      System.out.println(" Please wait for the further round");

      String round1Status = "Pass";
      if(round1Status == "Pass"){
        System.out.println("you have cleared pleace wait for, HR round");
      }else{
        System.out.println("you can goto home");
      }
      
    }
    else{
      System.out.println("You can goto home");
    }
    
  }
}
