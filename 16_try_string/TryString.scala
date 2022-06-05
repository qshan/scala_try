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
    var tempIntValue  : Int     = 0;
    var tempStrValue  : String  = "Init";
    val tempInt01     : Int     = 2;
    val tempInt02     : Int     = 3;
    val tempStr       : String  = "Try String Data";

    println( "greeting      is " + greeting );
    println( "tempStrValue  is " + tempStrValue );
    tempStrValue  = tempStr;
    println( "tempStrValue  is " + tempStrValue );
    tempStrValue  += " Part added";
    println( "tempStrValue  is " + tempStrValue );

    println ("--------------------");

    println ("---------- Try [StringBuilder] here ----------");
    //pay attention to val here
    val bufTryStringBuilder = new StringBuilder;
    println( "bufTryStringBuilder is : " + bufTryStringBuilder.toString );
    bufTryStringBuilder += 'a'
    println( "bufTryStringBuilder is : " + bufTryStringBuilder.toString );
    bufTryStringBuilder ++= "bcdef"
    println( "bufTryStringBuilder is : " + bufTryStringBuilder.toString );
    println ("--------------------");

    println ("");
    printf ("----------End of %s----------\n" ,getClass.getName());
    println ("");
    //println ("--------------------");
  }

  //String example
  val greeting: String = "Hello,World!"

}
