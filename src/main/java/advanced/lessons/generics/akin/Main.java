package advanced.lessons.generics.akin;

public class Main {

    public static void main(String[] args) {
        Tool hammer = new Tool("hammer");
        Book book1 = new Book("Book name 1");
        Novel novel = new Novel("novel");
        Thing thing = new Thing();

        Box<Thing> myBox = new Box<>();
        myBox.putInto(hammer);

        myBox.whatIHaveInside();
        myBox.putInto(book1);
        myBox.whatIHaveInside();


/*


        Box<Tool> toolBox = new Box<>(hammer);
        toolBox.printScreen();
        toolBox.getThing();


        Box<Book> bookBox=new Box<>(book1);
        bookBox.carry();

        Box<Thing> commonBox = new Box<>();
        commonBox.putInto(hammer);
        commonBox.carry();

        commonBox.putInto(book1);
        commonBox.carry();

        commonBox.putInto(novel);
        commonBox.carry();

        //not acceptable
        // WaterBottle waterBottle=new WaterBottle();
        //commonBox.putInto(waterBottle);



*/
    }

}
