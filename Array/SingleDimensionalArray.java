package Array;

public class SingleDimensionalArray {
  public static void main(String[] args){
    //int[] j = {5, 8, 5, 9, 1};
    int[] j = new int[]{5, 8, 5, 9, 1};


    /*for(int i=0;i<j.length; i++){
      System.out.println(j[i]);

      System.out.println("size is "+j.length);
    }
    int sum = j[0] + j[2] + j[3] +j[4];
    System.out.println(sum);  */
    int i=0;
    while(i<j.length){
      System.out.println(j[i]);
      i++;
    }
  }
}
