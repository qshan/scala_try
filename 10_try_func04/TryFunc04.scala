#!scala

object TryFunc04
{
  def main(args: Array[String]): Unit =
  {
    println("Hello, world!");
    //println("Here is the TryFunc04!");
    //printf ("Here is %s!\n" ,"TryFunc04");
    printf ("Here is %s!\n" ,getClass.getName());
    println ("--------------------");
    //printf ("--------------------\n");

    println ("---------- Try [Function with default parameters values] here ----------");

    var tempValue   : Int  = 0;
    val tempData01  : Int  = 2;
    val tempData02  : Int  = 3;

    println ("Try default parameter setting");
    tempValue = addIntFuncWithDefaultParaValueTry();
    println ("Get return data is " + tempValue);
    println ("--------------------");

    println ("Try input parameter for function");
    tempValue = addIntFuncWithDefaultParaValueTry(tempData01 ,tempData02);
    println ("Get return data is " + tempValue);
    println ("--------------------");

    printf ("----------End of %s----------\n" ,getClass.getName());
    println ("--------------------");
  }

  //Function with default parameters values
  def addIntFuncWithDefaultParaValueTry( a:Int = 5, b:Int = 7 ) : Int =
  {
    var sum:Int = 0;
    println ("Get input a and b is " + a + ' ' + b);
    sum = a + b;

    //return value here
    return sum;
  }

}
