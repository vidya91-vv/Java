package Interface;

public class User {
  public static void main(String[] args){
    Lenovo lenovo = new Lenovo();
    lenovo.copy();
    lenovo.paste();
    lenovo.capture();
    lenovo.security();

    lenovo.audio();

    HP hp = new HP();
    hp.printing();

    //untill java7
  }
}
