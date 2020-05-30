

object Q33 {
   def main(args:Array[String]){
     println("sum is ="+sum(5));
     
   }
   def sum(n:Int):Int=n match{
     case n if n==0=>0;
     case n if n>=1 =>return n+sum(n-1);
     case _ => return 0;
   }
  
}