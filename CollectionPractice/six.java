package CollectionPractice;

import java.util.Vector;
public class six {
  public static void main(String[] args){
    Vector<E> v1 = new Vector();
    v1.add("vidya");
    v1.add("vinod");
    v1.add(0,"mouni");
    v1.add("Aarti");

    Vector v2 = new Vector();
    v2.add("Shree");
    v2.add("devika");
    v2.add("mounika");
    System.out.println(v1);
    
    Object[] arr = v1.toArray();
    System.out.println(Arrays.toString(arr));
}
