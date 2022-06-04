
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
      //var tempCheckerBreakTryA : Int = 0;
      var a : Int = 0;
      val numList = List(1,2,3,4,5,6,7,8,9,10);

      val loop = new Breaks;
      loop.breakable {
         for( tempCheckerBreakTryA <- numList){
            println( "Get value of tempCheckerBreakTryA from numList: "
                    + tempCheckerBreakTryA );
            if( tempCheckerBreakTryA == 4 ){
               loop.break;
            }
         }
      }
      println( "After the loop" );




    tempCounter = 0;
    while (tempCounter < tempTimes)
    {
      printf ("current counter    is %d\n" ,tempCounter);
      tempCounter +=  1;
      tempValue =  tempCounter;
      printf ("current tempValue  is %d\n" ,tempCounter);
    }
    println ("--------------------");

    printf ("----------End of %s----------\n" ,getClass.getName());
    println ("--------------------");
  }
}
