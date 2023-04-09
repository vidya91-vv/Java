package Loops.ForEach;

public class Test {
   public static void main(String[] args){
    /*int[] arr = {1, 2, 3, 4, 1};
    for(int i=0; i<arr.length; i=i+2){
      System.out.println(arr[i]);
    }*/
    int[][] arr = {
      {1, 2, 3},
      {4, 8, 9},
      {7, 9, 8}
    };
    int sum = 0;
    int noOfElements=0;
    for(int[] singleDimArray:arr){
      for(int value:singleDimArray){
        sum += value;
        noOfElements++;
      }
    }
      System.out.println(sum);
     System.out.println(sum/noOfElements);
   }
}