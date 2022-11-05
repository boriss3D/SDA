package advanced.lessons.collections.maps;

public class Main3 {

    public static void main(String[] args) {

       /* int x=5;
        int y=5;

        if(x==y){
            System.out.println("x equals y");
        }*/


        //Person person1 = new Person("Akin", "Garagon", "1234");
        Person person2 = new Person("Akin", "Garagon", "1234");

        //System.out.println(person1.toString());
        System.out.println(person2.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person2.hashCode());

        person2.setName("John");
        System.out.println(person2.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person2.hashCode());
/*

//399993907
//

        if(person1==person2){
            System.out.println("person1 equals person2");
        }else{
            System.out.println("person1 is NOT equals person2");
        }
*/

    }

}
