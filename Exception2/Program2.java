package Exception2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program2 {
  public static void main(String[] args) throws Exception{
    
    //AutoClosable
    
    File file = new File("./sample.txt");
    if(!file.exists())
    file.createNewFile();

    FileReader fr = new FileReader(file);

    FileInputStream fis = new FileInputStream(file);
    InputStreamReader isr = new TnputStreamReader(fis);

    BufferedReader br = new BufferedReader(isr);
    

    String text = new String();
    String line = new String();
    while((line = br.readLine()) != null){
      text += line +"\n";
    }
    System.out.println(text);
   

    fis.close();
    isr.close();
    fr.close();
    br.close();
  
  }
}
