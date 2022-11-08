package patterns.behavioral.template_method;

abstract class Game {
   abstract void initialize();
   abstract void startPlay();
   abstract void endPlay();

   //template method
    final void play(){
      //initialize the game
      initialize();
      //start game
      startPlay();
      //end game
      endPlay();
   }

}
