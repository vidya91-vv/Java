package FileOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Program1 {
  public static void main(String[] args) throws IOException{
    
    File file = new File("./sample.txt");
    if(!file.exists())
    file.createNewFile();
    //file.delete();

    FileInputStream fis = new FileInputStream(file);
    
    int asciiCode;
    while((asciiCode = fis.read()) != -1){
      System.out.println((char)asciiCode);
    }
    fis.close();
    //System.out.println((char));

   // System.out.println((char)fis.read());

   
  }
  
}
