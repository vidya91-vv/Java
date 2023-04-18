package CollectionPractice;

import java.util.*;
public class Eight {
  public static void main(String[] args){

    //Size - no of elements present in list
    //Capacity = Array capacity - 10
    //generics
    //Vector java 1.0
    //collections 1.2
    Objects[] arr = new Object[]{1, 5, 8, 9, 2};

    Vector v1 = new Vector();
    v1.add("vidya");
    
    int sum = 0;

    for(int i=0; i<v1.size(); i++){
      sum += (Integer) v1.get(i);
    }
     
    System.out.println(v1);
    System.out.println(v1.size());
    System.out.println(v1.capacity());
  }
}
