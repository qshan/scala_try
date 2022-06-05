#!scala

object TryFunc07
{
  def main(args: Array[String]): Unit =
  {
    println("Hello, world!");
    //println("Here is the TryFunc07!");
    //printf ("Here is %s!\n" ,"TryFunc07");
    printf ("Here is %s!\n" ,getClass.getName());
    println ("--------------------");
    //printf ("--------------------\n");

    println ("---------- Try [Anonymous Functions] here ----------");
    var tempValue   : Int  = 0;
    val tempData01  : Int  = 2;
    val tempData02  : Int  = 3;

    println( "Current factor is   = " +  factor);
    println( "multiplier() value =    " +  multiplier(tempData01) );
    println( "multiplier01() value =  " +  multiplier01(tempData02) );
    println ("--------------------");
    println ("---------- Try [Closures] here ----------");
    factor  = 5;
    println( "Current factor is   = " +  factor);
    println( "multiplier() value =    " +  multiplier(tempData01) );
    println( "multiplier01() value =  " +  multiplier01(tempData02) );
    println ("--------------------");

    printf ("----------End of %s----------\n" ,getClass.getName());
    println ("--------------------");
  }

  //Anonymous Functions example
  var factor : Int = 3;
  val multiplier = (i:Int) => (i * factor);
  val multiplier01 = (i:Int) => ({println( "Get i " +  i ); i * factor});

}
