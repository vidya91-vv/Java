package TypeInference;

public class LVTypeInference {
  public static void main(String[] args){
    var i = 20000;
    var s1 = "vidya";
    var b1 = true;
    //String s1 = "vidya";
    //boolean b1 = true;
    System.out.println(i);
    System.out.println(s1);
    System.out.println(b1);

    //int var = 10;
    var var = 10;
    var = var + var;
    System.out.println(var);

  }
}
