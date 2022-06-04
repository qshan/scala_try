
object TryLoop
{
  def main(args: Array[String]): Unit =
  {
    println("Hello, world!");
    //println("Here is the TryLoop!");
    //printf ("Here is %s!\n" ,"TryLoop");
    printf ("Here is %s!\n" ,getClass.getName());
    println ("--------------------");
    //printf ("--------------------\n");

    var tempCounter ,tempValue : Int  = 0;
    val tempTimes : Int  = 5;

    println ("---------- Try [while] here ----------");
    tempCounter = 0;
    while (tempCounter < tempTimes)
    {
      printf ("current counter    is %d\n" ,tempCounter);
      tempCounter +=  1;
      tempValue =  tempCounter;
      printf ("current tempValue  is %d\n" ,tempCounter);
    }
    println ("--------------------");

    //TODO//println ("---------- Try [do-while] here ----------");
    //TODO//tempCounter = 0;
    //TODO//do {
    //TODO//  printf ("current counter    is %d\n" ,tempCounter);
    //TODO//  tempCounter +=  1;
    //TODO//  tempValue =  tempCounter;
    //TODO//  printf ("current tempValue  is %d\n" ,tempCounter);
    //TODO//} while(tempCounter < tempTimes);
    //TODO//println ("--------------------");

    println ("---------- Try [for] here ----------");
    tempCounter = 0;
    tempValue   = 0;
    for (tempCounter <- 0 to tempTimes)
    {
      printf ("current counter    is %d\n" ,tempCounter);
      //tempCounter +=  1;
      tempValue   +=  1;
      printf ("current tempValue  is %d\n" ,tempCounter);
    }
    println ("--------------------");

    println ("---------- Try [for-condition] here ----------");
    var tempCheckerA : Int  = 0;
    val numListTry = List(1,2,3,4,5,6,7,8,9,10);
    for( tempCheckerA <- numListTry
         if tempCheckerA != 3; if tempCheckerA < 8 ){
       println( "Get value of tempCheckerA from numListTry: " + tempCheckerA );
    }
    println ("--------------------");

    println ("---------- Try [for-yield] here ----------");
    var tempCheckerAForYieldTry : Int  = 0;
    //var a = 0;
    val numListForYieldTry = List(1,2,3,4,5,6,7,8,9,10);

    //get the data
    var retValForYieldTry = for{ tempCheckerAForYieldTry <- numListForYieldTry
                      if tempCheckerAForYieldTry != 3; if tempCheckerAForYieldTry < 8
                    }yield tempCheckerAForYieldTry

    // output
    for( tempCheckerAForYieldTry <- retValForYieldTry){
       println( "Get value of tempCheckerAForYieldTry from numListForYieldTry: " + tempCheckerAForYieldTry );
    }
    println ("--------------------");

    printf ("----------End of %s----------\n" ,getClass.getName());
    println ("--------------------");
  }
}
