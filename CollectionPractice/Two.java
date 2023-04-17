package CollectionPractice;

import java.util.Vector;

public class Two {
  public static void main(String[] args){
    Vector v1 = new Vector();
    v1.add("vidya");
    v1.add("vinod");
    v1.add(0,"mouni");
    v1.add("Aarti");

    Vector v2 = new Vector();
    v2.add("Shree");
    v2.add("shree");
    v2.add("mounika");
    System.out.println(v1);

    v1.addAll(0, v2);

  }
}
