package File;

import java.io.File;
import java.io.IOException;
//import java.util.Date;


public class FileHandling {
  public static void main(String[] args) throws IOException{
    File f = new File("D:\\resume.txt");
      
      //System.out.println(f.getParent());

    /* 
    // folders
    System.out.println(f.mkdir());
    System.out.println(f.mkdirs());
   
    */
 
    
    if(f.exists())
       f.delete();

      // System.out.println(f.createNewFile());
       

       //System.out.println(f.isHidden());

       /* 
       System.out.println(f.canWrite());
       f.setWritable(true);
       System.out.println(f.canWrite());
       */

     //System.out.println(f.exists());

    //System.out.println(f.createNewFile());

    System.out.println(f.delete());

    //System.out.println(new Date(f.lastModified()));
  }

}
