package patterns.behavioral.template_method;

class Basketball extends Game {

   @Override
   void endPlay() {
       System.out.println("Basketball: Game Finished");
   }

   @Override
   void initialize() {
       System.out.println("Basketball: Game Initialized ");
   }

   @Override
   void startPlay() {
      System.out.println("Basketball: Game Started.");
   }
}
