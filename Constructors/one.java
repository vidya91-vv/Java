package Constructors;

public class one {
  public int i;
  public static void main(String[] args){
    one cp = new one();
    System.out.println(cp.i);
  }
  public one(){
    i = 20;
    System.out.println("Constructor is called");
  }
  public one(int a){
    i = a;
  }
}
