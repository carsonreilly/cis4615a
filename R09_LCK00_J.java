public class someObject{
   //changeValue locks on this class object's monitor
   public static synchronized void changeValue(){
      // ...
   }
}

//Untrusted code
synchronized (someObject.class){
   while(true){
     Thread.sleep(Integer.MAX_VALUE); //Indefinitely delay someObject
   }
}
