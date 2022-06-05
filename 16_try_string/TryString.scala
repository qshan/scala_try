#!scala

object TryString
{
  def main(args: Array[String]): Unit =
  {
    println ("--------------------");
    //println("Hello, world!");
    //println("Here is the TryString!");
    //printf ("Here is %s!\n" ,"TryString");
    //printf ("Here is %s!\n" ,getClass.getName());
    println("Hello, world! from " + getClass.getName());
    println ("--------------------");
    println ("");
    //printf ("--------------------\n");

    println ("---------- Try [String] here ----------");
    var tempValue   : Int     = 0;
    val tempInt01   : Int     = 2;
    val tempInt02   : Int     = 3;
    val tempStr     : String  = "Try String Data";

    println( "greeting is " + greeting );
    println( "tempStr is  " + tempStr );

    println ("--------------------");

    println ("");
    printf ("----------End of %s----------\n" ,getClass.getName());
    println ("");
    //println ("--------------------");
  }

  //String example
  val greeting: String = "Hello,World!"

}
