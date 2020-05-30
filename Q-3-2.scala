package pro1

object Q32 {
  def main(args:Array[String]){
    
    primeseq(10);
    
  }
  def primeseq(n:Int):Any={
    if(n>1){
       
        primeseq(n-1);
        prime(n);
    }
  }
  def gcd(a:Int,b:Int):Int=b match{
    
    case 0=>a;
    case b if b>a =>gcd(b,a);
    case _ =>gcd(b,a%b);
  }
  def prime(p:Int,n:Int=2):Any=n match{
    
    case x if (x==p)=>println(p+" ,");
    case x if gcd(p,x)>1=>0;
  }
}