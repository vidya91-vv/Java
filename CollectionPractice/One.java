package CollectionPractice;
import java.util.*;
public class One {
  public static void main(String[] args){
    Vector v1 = new Vector();
    v1.add("vidya");
    v1.add("shree");
    v1.add("mounika");
    System.out.println(v1);

    v1.add(0,v1);

    System.out.println(v1);

    v1.removeAll(v1);
    System.out.println(v1);
  }
}
