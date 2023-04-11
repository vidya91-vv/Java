package Inheritance_OOPS;

public class Admin extends Developer{

  //Adding or deleting the products/application

  public void manage(){
    
   super.read();
    write();

    System.out.println("manage code");
  }
    public void read(){
      System.out.println("Admin read code");
    }
}
