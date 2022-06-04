
import scala.util.control._

object TryBreak
{
  def main(args: Array[String]): Unit =
  {
    println("Hello, world!");
    //println("Here is the TryBreak!");
    //printf ("Here is %s!\n" ,"TryBreak");
    printf ("Here is %s!\n" ,getClass.getName());
    println ("--------------------");
    //printf ("--------------------\n");

    var tempCounter ,tempValue : Int  = 0;
    val tempTimes : Int  = 5;

    println ("---------- Try [break] here ----------");
    var tempCheckerBreakTryA : Int = 0;
    val numListBreakTry : List[Int] = List(1,2,3,4,5,6,7,8,9,10);

    val loop = new Breaks;
    loop.breakable{
      for( tempCheckerBreakTryA <- numListBreakTry)
      {
        println( "Get value of tempCheckerBreakTryA from numListBreakTry: "
                + tempCheckerBreakTryA );
        if( tempCheckerBreakTryA == 4 )
        {
          println( "Found value 4 in numListBreakTry: "
                + tempCheckerBreakTryA );
          loop.break;
        }
      }
    }
    println( "After the loop.breakable" );

    printf ("----------End of %s----------\n" ,getClass.getName());
    println ("--------------------");
  }
}
