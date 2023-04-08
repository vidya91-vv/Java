package DecisionMakingStatement;

public class Four {
  public static void main(String[] args){
    int i = 1;   //switch is not a conditinal based statement. it is a value based statement
    switch(i){   
       case 1:
          System.out.println("this is the first statements");
          break;      //optinal
       case 2:
          System.out.println("this is the second statements");
          break;
       case 3:
          System.out.println("this is the third statements");
          break;
       default:
          System.out.println("this is the default statements");
          break;
    }
  }
}
