package advanced.lessons.innerclass;

public class OuterClass {

    void outerClassMethod() {
        System.out.println("I am outer class method");

    }


    class InnerClass {
        void useOuterClassfield() {
            //System.out.println(outerClassStaticField);
            //outerClassMethod();
            //System.out.println(outerClassField);
        }
    }

}
