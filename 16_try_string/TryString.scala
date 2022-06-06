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
    println( "length  is " + tempStrValue.length() );
    tempStrValue  = tempStr;
    println( "tempStrValue  is " + tempStrValue );
    println( "length  is " + tempStrValue.length() );
    tempStrValue  += " Part added";
    println( "tempStrValue  is " + tempStrValue );
    println( "length  is " + tempStrValue.length() );

    var tempStrValue1  = printf("Try String operation"
                          + "tempStrValue is %s and tempInt02 is %d"
                          , tempStr ,tempInt02);
    println (tempStrValue1);
    //TODO//why ??
    println( "tempStrValue1  is " + tempStrValue1 );

    println ("--------------------");

    println ("---------- Try [StringBuilder] here ----------");
    //pay attention to val here
    val bufTryStringBuilder = new StringBuilder;
    println( "bufTryStringBuilder is : " + bufTryStringBuilder.toString );
    println( "length  is " + bufTryStringBuilder.length() );
    bufTryStringBuilder += 'a'
    println( "bufTryStringBuilder is : " + bufTryStringBuilder.toString );
    println( "length  is " + bufTryStringBuilder.length() );
    bufTryStringBuilder ++= "bcdef"
    println( "bufTryStringBuilder is : " + bufTryStringBuilder.toString );
    println( "bufTryStringBuilder is : " + bufTryStringBuilder );
    println( "length  is " + bufTryStringBuilder.length() );
    println ("--------------------");

    println ("");
    printf ("----------End of %s----------\n" ,getClass.getName());
    println ("");
    //println ("--------------------");
  }

  //String example
  val greeting: String = "Hello,World!"

}
