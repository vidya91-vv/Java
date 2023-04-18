package CollectionPractice;
import java.util.Vector;
public class seven {
  public static void main(String[] args){
    Objects[] arr = new Object[]{1, 5, 8, 9, 2};
    Vector v1 = new Vector(Arrays.asList(arr));
     
    System.out.println(v1);
    System.out.println(v1.size());
    System.out.println(v1.capacity());
  }
}
