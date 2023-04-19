package CollectionPractice.Stack;

public class two {
  public static void main[String[] args]{
    Stack<String> books =new Stack<>();
    books.add("Red");
    books.add("Block");
    books.add(0, "White");

    books.set(0, "Yellow");
    //books.clear();

    System.out.println(books);
    System.out.println(books.contains("White"));
  }
}
