package String;

public class Test1 {
  public static void main(String[] args){
    String s1="Hello";
    String s2="hello";
    //String s3="HELLO";
    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s1.contains("He"));
    System.out.println(s1.contains("he"));
  }
}
