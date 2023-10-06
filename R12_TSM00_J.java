class Base{
  private final Object lock = new Object();

  public void doSomething(){
     synchronized(lock){
       // ...
     }
  }
}

class Derived extends Base{
   Logger logger = //Initialize

   private final Object lock = new Object();

   @Overide public void doSomething(){
      synchronized(lock){
         try{
            super.doSomething();
         }finally {
            logger.log(Level.FINE, "Did Something");
         }
      }
   }
}
