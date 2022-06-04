class Outer
{
  class Iner
  {
    private def f() =
    {
      printf ("Here is %s!\n" ,getClass.getName());
    }

    def callF() =
    {
      printf ("Here is %s!\n" ,getClass.getName());
      //f(); //correct usage
    }

    class InerMost
    {
      f(); //correct usage
    }
  }
  //(new Iner).f(); //error usage
}

object TryClass
{
  def main(args: Array[String]): Unit =
  {
    println("Hello, world!");
    //println("Here is the TryBasic!");
    //printf ("Here is %s!\n" ,"TryBasic");
    printf ("Here is %s!\n" ,getClass.getName());
    printf ("--------------------\n");

    val pt = new Outer;
    //TODO//pt.callF();

    val myValString : String  = "the val of String Example 1 oringinal contents";
    var myVarString : String  = "the var of String Example 1 oringinal contents";
    printf ("myValString is %s here!\n" ,myValString);
    printf ("myVarString is %s here!\n" ,myVarString);
    printf ("--------------------\n");
    myVarString  = "the var of String Example 1 updated";
    printf ("myVarString is %s here!\n" ,myVarString);
    printf ("--------------------\n");

    var myVarInt : Int  = 10;
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
