package String;

public class Two {
  public static void main(String[] args){
    String s1 = "hello";
    String s2 = new String("hello");
    String s4=new String("hello");
    String s3 = "hello";
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s1.equals(s4));
    System.out.println(s2.equals(s4));
  }
}
