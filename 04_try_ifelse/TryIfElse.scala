
object TryIfElse
{
  def main(args: Array[String]): Unit =
  {
    println("Hello, world!");
    //println("Here is the TryOpt!");
    //printf ("Here is %s!\n" ,"TryOpt");
    printf ("Here is %s!\n" ,getClass.getName());
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
    if ( myVarInt02 > myVarInt01 )
    {
      println("myVarInt02 > myVarInt01");
      printf ("%d         > %d\n" ,myVarInt02 ,myVarInt01);
    }
    else if ( myVarInt02 < myVarInt01 )
    {
      println("myVarInt02 < myVarInt01");
      printf ("%d         < %d\n" ,myVarInt02 ,myVarInt01);
    } else
    {
      println("myVarInt02 = myVarInt01");
      printf ("%d         = %d\n" ,myVarInt02 ,myVarInt01);
    }
    printf ("--------------------\n");
  }
}
