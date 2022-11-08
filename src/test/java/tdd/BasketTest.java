package tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import testing.tdd.Basket;
import testing.tdd.Book;

import java.util.ArrayList;

public class BasketTest {

    @Test
    void addBookToBasket() {
        // give
        Book book = new Book("Never ending story", "Some author", 10.00);
        Basket basket = new Basket(new ArrayList<>());
        // when
        basket.addBookToBasket(book);
        // then
        Assertions.assertThat(basket.getAllBooks()).contains(book);
        Assertions.assertThat(book).isNotNull();
        Assertions.assertThat(basket).isNotNull();
    }

    @Test
    void getAllBooksFromBasket() {
        // give
        Book book01 = new Book("Never ending story", "Some author", 10.00);
        Book book02 = new Book("Never ending story 2", "Some author", 15.00);
        Basket basket = new Basket(new ArrayList<>());
        // when
        basket.addBookToBasket(book01);
        basket.addBookToBasket(book02);
        // then
        Assertions.assertThat(basket.getAllBooks()).contains(book01);
        Assertions.assertThat(basket.getAllBooks()).contains(book02);
        Assertions.assertThat(basket.getAllBooks()).isNotEmpty();
        Assertions.assertThat(book01).isNotNull();
        Assertions.assertThat(book02).isNotNull();
        Assertions.assertThat(basket).isNotNull();
    }

    @Test
    void clearBasket() {
        // give
        Book book01 = new Book("Never ending story", "Some author", 10.00);
        Book book02 = new Book("Never ending story 2", "Some author", 15.00);
        Basket basket = new Basket(new ArrayList<>());
        // when
        basket.addBookToBasket(book01);
        basket.addBookToBasket(book02);
        basket.clearBasket();
        // then
        Assertions.assertThat(basket.getAllBooks()).isEmpty();
        Assertions.assertThat(book01).isNotNull();
        Assertions.assertThat(book02).isNotNull();
        Assertions.assertThat(basket).isNotNull();
    }

    @Test
    void checkTotalPrice() {
        // give
        Book book01 = new Book("Never ending story", "Some author", 10.00);
        Book book02 = new Book("Never ending story 2", "Some author", 15.00);
        Basket basket = new Basket(new ArrayList<>());
        // when
        basket.addBookToBasket(book01);
        basket.addBookToBasket(book02);
        double result = basket.getTotalPrice();
        // then
        Assertions.assertThat(result).isEqualTo(25.00);
        Assertions.assertThat(book01).isNotNull();
        Assertions.assertThat(book02).isNotNull();
        Assertions.assertThat(basket).isNotNull();
    }


}
