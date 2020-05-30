

object Q36 {
   def main(args:Array[String]){
     fibseq(10);
   }
   def fib(n:Int):Int=n match{
     case n if n==0=>0;
     case n if n==1=>1;
     case _ =>return fib(n-1)+fib(n-2);
   }
   def fibseq(x:Int):Any={
     if(x>0)
       fibseq(x-1);
       println(","+fib(x));
   }
  
}