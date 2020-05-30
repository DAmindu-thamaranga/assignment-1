

object Q35 {
   def main(args:Array[String]){
     println("sum of even numbers="+addeven(10));
   }
   def addeven(n:Int):Int=n match{
     case n if n==0=>0;
     case n if n%2==0=> return (n-2)+addeven(n-2);
     case _ =>(n-1)+addeven(n-1);
   }
  
}