

object Q23 {
   def main(args:Array[String])
   { 
     println("profit is="+profit(5));
      println("profit is="+profit(10));
       println("profit is="+profit(15));
        println("profit is="+profit(20));
         println("profit is="+profit(25));
          println("profit is="+profit(30));
           println("profit is="+profit(35));
   }
   def attend(p:Int):Int={
     val a:Int=120+((15-p)/5)*20;
     return a;
   }
   def revenue(p:Int):Int={
     val b:Int=p*attend(p);
     return b;
   }
   def cost(p:Int):Int={
     val c:Int=500+3*attend(p);
     return c;
   }
   def profit(p:Int):Int={
     val e:Int=revenue(p)-cost(p);
     return e;
   }
  
}