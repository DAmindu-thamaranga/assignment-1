package pro1

object Q3 {
   def main(args:Array[String]){
           
           price(60);    
     }
     
   
   def price(m:Int)={
     
     val e:Double= 24.95*0.6;
     
     if(m>50){
       val a1:Int=m-50;
       val a2:Double=a1*0.75;
       val a3:Double=e*m+3.00+a2;
       println("Total cost="+a3);
       
     }
     else{
       val b1:Double=e*m+3.00;
       println("Total cost="+b1);
     }
     
 }

}