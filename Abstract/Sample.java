package Abstract;

public abstract class Sample implements Laptop{
  public void copy(){
    System.out.println("lenovo copy code");
  }

  public void paste(){
    System.out.println("lenovo paste code");
  }

  public abstract void cut();
  
  public abstract void keyboard();
     
}
