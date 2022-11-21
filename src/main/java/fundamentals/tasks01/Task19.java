package fundamentals.tasks01;

/*
Write an application that consists of few classes:
a. Author class, representing an author – poem writer, which consists of fields surname
and nationality (both of type String)
b. Poem class, representing poem, which consists of fields creator (type Author) and
stropheNumbers (type int – numbers of strophes in poem)
c. Task01 class, with main method, inside which you will:

i. Create three instances of Poem class, fill them with data (using constructor and/or setters) and store them in array
ii. Write a surname of an author, that wrote the longest poem (let your application calculate it!)
 */
public class Task19 {
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setNationality("russian");
        author1.setSurname("Lermontov");

        Author author2 = new Author();
        author2.setNationality("estonian");
        author2.setSurname("Suits");

        Author author3 = new Author();
        author3.setNationality("japan");
        author3.setSurname("Basho");

        Poem poem1 = new Poem();
        poem1.setCreator(author1);
        poem1.setStropheNumbers(10);

        Poem poem2 = new Poem();
        poem2.setCreator(author2);
        poem2.setStropheNumbers(30);

        Poem poem3 = new Poem();
        poem3.setCreator(author3);
        poem3.setStropheNumbers(20);

        Poem[] poems = {poem1, poem2, poem3};

        int maxStrophes = 0;
        int index = -1;

        for (int i = 0; i < poems.length; i++) {
            if (maxStrophes < poems[i].getStropheNumbers()) {
                maxStrophes = poems[i].getStropheNumbers();
                index = i;
            }
        }
        System.out.println("The author of the longest poem is " + poems[index].getCreator().getNationality() +
                " poet " + poems[index].getCreator().getSurname());
    }
}
