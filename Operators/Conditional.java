package Operators;

public class Conditional {
  public static void main(String[] args){
    int i = 20;
    int j = 10;

    System.out.println(i<j || i==j);
    System.out.println(i<j && i==j);

    /*
     * &&
     * true - true -> true
     * true - false -> false
     * false - true -> false
     * false - false -> false
     */
  }
}
