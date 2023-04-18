package CollectionPractice.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
public class two {
  
  public static void main(String[] args){
    Integer[] arr = new Integer[] {1, 5, 8, 9, 2};
    ArrayList<integer> all = new ArrayList<>(Arrays.asList(arr));
    all.add(5);
    
    System.out.println(all);
    System.out.println(all.size());
    System.out.println(all.get());
    
    all.set(0, 25);
    System.out.println(all);
  }
}
