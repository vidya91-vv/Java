package Array;

public class TwoDimensionalArray {
  public static void main(String[] args){
    int[][] arr = new int[3][2];
    arr[0][0] = 1;
    arr[0][1] = 2;

    arr[1][0] = 3;
    arr[1][1] = 4;

    arr[2][0] = 5;
    arr[2][1] = 6;
    int size =  0;
    

    //System.out.println(arr[0][0]);
    //System.out.println(arr[0][1]);

    for(int i=0; i<arr.length; i++){
      size += arr[i].length;
  
       for(int j=0; j<arr[i].length; j++){

        //System.out.println(arr[1].length);

        System.out.print(arr[i][j]+ " ");
       }
       System.out.println();
    }
    System.out.println(size);

  }
}
