package CollectionPractice;
import java.util.*;
public class Nine {
  public static void main(String[] args){
    Objects[] arr = new Objects[] {1, 5, 8, 9, 2};
    Vector<Integer> v1 = new Vector<>();
    v1.add(5);
    v1.add(null);
    v1.add(null);
    v1.add(null);

    System.out.println(v1);
    System.out.println(v1.size());
    System.out.println(v1.capacity());
  }
}
