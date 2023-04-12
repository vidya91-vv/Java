package FileOperations;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class Program8 {
  public static void main(String[] args) throws IOException{
    
    File file = new File("./sample.txt");
    if(!file.exists())
    file.createNewFile();

    String s = "kalpana";

    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
    bw.write(s);
    bw.flush();
    bw.close();
  }
}
