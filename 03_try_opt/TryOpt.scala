
object TryOpt
{
  def main(args: Array[String]): Unit =
  {
    println("Hello, world!");
    //println("Here is the TryOpt!");
    //printf ("Here is %s!\n" ,"TryOpt");
    printf ("Here is %s!\n" ,getClass.getName());
    printf ("--------------------\n");

    var a = 3;
    var b = 20;
    var c = 25;
    var d = 25;
    println("a + b = " + (a + b) );
    println("a - b = " + (a - b) );
    println("a * b = " + (a * b) );
    println("b / a = " + (b / a) );
    println("b % a = " + (b % a) );
    println("c % a = " + (c % a) );
    printf ("--------------------\n");

    var myVarInt : Int  = 2;
    var myVarInt01 ,myVarInt02 : Int  = 11;
    printf ("myVarInt   is %d here!\n" ,myVarInt);
    printf ("myVarInt01 is %d here!\n" ,myVarInt01);
    printf ("myVarInt02 is %d here!\n" ,myVarInt02);
    printf ("--------------------\n");
    myVarInt    = 20;
    myVarInt01  = 21;
    myVarInt02  = 22;
    printf ("myVarInt   is %d here!\n" ,myVarInt);
    printf ("myVarInt01 is %d here!\n" ,myVarInt01);
    printf ("myVarInt02 is %d here!\n" ,myVarInt02);
    printf ("--------------------\n");
  }
}
