package CollectionPractice;
import java.util.Vector;
public class Four {
  public static void main(String[] args){
    Vector v1 = new Vector();
    v1.add("vidya");
    v1.add("vinod");
    v1.add(0,"mouni");
    v1.add("Aarti");

    Vector v2 = new Vector();
    v2.add("Shree");
    v2.add("devika");
    v2.add("mounika");
    System.out.println(v1);

    v1.clear();
    System.out.println(v1);

    System.out.println(v1.contains("vidya"));

    System.out.println(v1.containsAll(v2));
    
    v1.set(1, "Satish");
    System.out.println(v1);
    System.out.println(v1.get(1));


}
