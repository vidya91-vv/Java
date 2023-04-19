package CollectionPractice.Stack;

public class Four {
  public static void main(String[] args){
      Stack<String> books =new Stack<>();
      books.push("Red");
      books.push("Block");
      books.push(0, "White");
      books.push(null);

      System.out.println(books);
    
      System.out.println(books.search("White"));

      System.out.println(books.indexOf("White"));

      System.out.println(books.isEmpty());

      System.out.println(books.peek());
    }
}
