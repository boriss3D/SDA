package testing.tdd;

import java.util.ArrayList;

public class Basket {
    private final ArrayList<Book> arrayList;

    public Basket(ArrayList<Book> arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList<Book> getAllBooks() {
        return arrayList;
    }

    public void addBookToBasket(Book book) {
        this.arrayList.add(book);
        System.out.println(book.title() + " of author " + book.author() + " added to shopping cart");
    }

    public void clearBasket() {
        this.arrayList.clear();
        System.out.println("Shopping cart is empty");
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Book book : arrayList) {
            totalPrice += book.price();
        }
        return totalPrice;
    }
}
