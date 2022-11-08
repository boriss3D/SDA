package patterns.behavioral.iterator;

public class IteratorPatternDemo {
	
   public static void main(String[] args) {
      NameRepository namesRepository = new NameRepository();

      NumberRepository numberRepository = new NumberRepository();

      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
         String name = (String)iter.next();
         System.out.println("Name : " + name);
      }


      for(Iterator iter = numberRepository.getIterator(); iter.hasNext();){
         Integer number = (Integer)iter.next();
         System.out.println("Number : " + number);
      }


   }
}
