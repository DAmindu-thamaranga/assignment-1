package pro1

object Q2 {
   def main(args:Array[String]){
     volumesphere(5);
     
   }
   def volumesphere(r:Double)={
     
     val x:Double= (4*22*r*r*r)/21 ;
     println("volume of a sphere is =", +x);
   }
}