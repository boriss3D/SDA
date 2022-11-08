package patterns.behavioral.template_method;

class Football extends Game {

   @Override
   void endPlay() {
      System.out.println("Football: Game Finished");
   }

   @Override
   void initialize() {
      System.out.println("Football: Game Initialized");
   }

   @Override
   void startPlay() {
      System.out.println("Football Game Started");
   }
}
