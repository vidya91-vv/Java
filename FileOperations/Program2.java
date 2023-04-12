package FileOperations;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {   //scanner
  public static void main(String[] args) throws IOException{
    
    File file = new File("./sample.txt");
    if(!file.exists())
    file.createNewFile();

    Scanner scanner = new Scanner(file);

    String text = new String();
    while(scanner.hasNextLine()){
      text += scanner.nextLine() +"\n";
   }
   System.out.println(text);
   scanner.close();

   /*while(scanner.hasNextLine()){
      System.out.println(scanner.nextLine());
   }*/
  }
}
