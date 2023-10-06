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

   @Overide public void doSomething(){
      try{
         super.doSomething();
      }finally {
         logger.log(Level.FINE, "Did Something");
      }
   }
}
