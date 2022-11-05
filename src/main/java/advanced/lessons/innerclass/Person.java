package advanced.lessons.innerclass;

public class Person {

    private final String name;
    private final String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        IdCard idCard = new IdCard();
        idCard.createIdCard(name, surname);
        idCard.printIdCard();
    }


    class IdCard {

        private String idCardNumber;

        void createIdCard(String name, String surname) {
            class Printer {
                String ip = "123.123.123.13";

                void printOnPlasticCard() {
                    System.out.println("this method connects to printer and send print command");
                }
            }
            this.idCardNumber = "123";
            Printer printer = new Printer();
            printer.printOnPlasticCard();
        }

        void printIdCard() {
            System.out.println("ID card is printed : " + idCardNumber);
        }

    }

}
