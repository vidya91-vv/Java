package Array;

public class jaggedArray {
  public static void main(String[] args){
    int[][] arr = new int[3][];
    arr[0] = new int[2];
    arr[1] = new int[5];
    arr[2] = new int[3];

    arr[0][0] = 1;
    arr[0][1] = 2;

    arr[1][0] = 25;
    arr[1][1] = 48;
    arr[1][2] = 85;
    arr[1][3] = 81;
    arr[1][4] = 96;

    arr[2][0] = 1;
    arr[2][1] = 2;
    arr[2][2] = 1;

    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[i].length; j++){
        System.out.println(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
