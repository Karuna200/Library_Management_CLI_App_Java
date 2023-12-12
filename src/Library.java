import java.util.ArrayList;

public class Library implements Stock{

    static ArrayList<Book> Book_List = new ArrayList<>();

    @Override
    public void findBook(String name) {
        for(int i=0;i<Book_List.size();i++){
            Book b = Book_List.get(i);
            if(b.getName().equalsIgnoreCase(name) || b.getauthorName().equalsIgnoreCase(name)){
                System.out.println("Your book is found!!!");
            }
        }

    }

    @Override
    public void addBook(Book b) {
        Book_List.add(b);
        System.out.println("Your Book is added!!!");
    }

    @Override
    public void removeBook(Book b) {
        Book_List.remove(b);
        System.out.println("Your Book is removed!!");
    }

    @Override
    public void findBook(float cost) {
        for(int i=0;i<Book_List.size();i++){
          Book book = Book_List.get(i);
          if(book.getPrice() == cost){
              System.out.println("Your Book is found for the price: " + cost +" And the book is " + book.getName());
          }
        }

    }

    @Override
    public void findBook(float l,float h){
        for(int i=0;i<Book_List.size();i++){
            Book book = Book_List.get(i);
            if(book.getPrice() >=l && book.getPrice()<=h){
                for(float j=l;j<=h;j++){
                    System.out.println("The books found for the given price range are "+ book.getName());
                }
            }
        }

    }

    @Override
    public void findCheapestBook(){
        float mini = Float.MAX_VALUE;
        int indx = -1;
        for(int i=0;i<Book_List.size();i++){
          Book b = Book_List.get(i);
          if(mini > b.getPrice()){
              mini = b.getPrice();
              indx = i;
          }
        }
        String name = Book_List.get(indx).getName();
        System.out.println("The Cheapest Book is "+ name);
    }

    @Override
    public void findCostlyBook(){
        float maxi = Float.MIN_VALUE;
        int indx = -1;
        for(int i=0;i<Book_List.size();i++){
            Book b = Book_List.get(i);
            if(maxi < b.getPrice()){
                maxi = b.getPrice();
                indx = i;
            }
        }
        String name = Book_List.get(indx).getName();
        System.out.println("The Cheapest Book is: "+ name);
    }
}
