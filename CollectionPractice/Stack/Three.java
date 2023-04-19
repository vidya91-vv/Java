package CollectionPractice.Stack;

public class Three {
  public static void main(String[] args){
    Stack<String> books =new Stack<>();
    books.add("Red");
    books.add("Block");
    books.add(0, "White");
    
    System.out.println(books.peek());
    System.out.println(books.pop());
    System.out.println(books.search("Red"));
    System.out.println(books);
  }
}
