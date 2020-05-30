package pro1

object Q34 {
  def main(args:Array[String]){
    
      println(isEven(4));
      println(isOdd(5));
      println(isEven(9));
  }
  def isEven(n:Int):Boolean=n match{
    
    case 0=> true;
    case _ => isOdd(n-1);
  }
  
}