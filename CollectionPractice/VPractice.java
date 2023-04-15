package CollectionPractice;

import java.util.*;

public class VPractice {
  public static void main(String[] args){
    Vector v1 = new Vector();
    v1.add("vidya");
    v1.add("vinod");
    v1.add(0,"mouni");
    v1.add("Aarti");

    System.out.println(v1);
    System.out.println("Size: "+v1.size());
    System.out.println("Capasity: "+v1.capasity());
  }
}
