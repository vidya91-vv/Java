package FileOperations;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class Program7 {
  public static void main(String[] args) throws IOException{
    
    File file = new File("./sample.txt");
    if(!file.exists())
    file.createNewFile();


    String s = "hello";

    FileWriter fw = new FileWriter(file);
    
    fw.write(s.toCharArray());

    fw.flush();

    fw.close();
  }
}
