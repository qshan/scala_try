#!scala

object TryFunc06
{
  def main(args: Array[String]): Unit =
  {
    println("Hello, world!");
    //println("Here is the TryFunc06!");
    //printf ("Here is %s!\n" ,"TryFunc06");
    printf ("Here is %s!\n" ,getClass.getName());
    println ("--------------------");
    //printf ("--------------------\n");

    println ("---------- Try [Nested Functions] here ----------");
    var tempValue   : Int  = 0;
    val tempData01  : Int  = 2;
    val tempData02  : Int  = 3;

    println( factorial(0) );
    println( factorial(1) );
    println( factorial(2) );
    println( factorial(3) );

    printf ("----------End of %s----------\n" ,getClass.getName());
    println ("--------------------");
  }

  //Nested Functions example
  def factorial(i: Int): Int =
  {
    def fact(i: Int, accumulator: Int): Int =
    {
      if (i <= 1)
      {
        accumulator;
      }
      else
      {
        fact(i - 1, i * accumulator);
      }
    }

    return fact(i, 1);
  }

}