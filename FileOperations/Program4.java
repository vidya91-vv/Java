package FileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program4 {
  public static void main(String[] args) throws IOException{
    
    File file = new File("./sample.txt");
    if(!file.exists())
    file.createNewFile();

    FileReader fr = new FileReader(file);

    BufferedReader br = new BufferedReader(fr);
    
    int asciiCode;
    String text = new String();
    while((asciiCode = br.read()) != -1){
      text += String.valueOf((char)asciiCode);
      //System.out.print((char)asciiCode);

    }
    //System.out.println();
    System.out.println(text);

    fr.close();
    br.close();
  

  }
}
