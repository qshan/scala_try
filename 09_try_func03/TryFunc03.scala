#!scala

object TryFunc03
{
  def main(args: Array[String]): Unit =
  {
    println("Hello, world!");
    //println("Here is the TryFunc03!");
    //printf ("Here is %s!\n" ,"TryFunc03");
    printf ("Here is %s!\n" ,getClass.getName());
    println ("--------------------");
    //printf ("--------------------\n");

    println ("---------- Try [Recursion Functions] here ----------");

    for (i <- 1 to 10)
    {
      println( "Factorial of " + i + ": = " + factorialRecurFuncTry(i) )
    }

    println ("--------------------");

    printf ("----------End of %s----------\n" ,getClass.getName());
    println ("--------------------");
  }

  //Recursion Functions
  def factorialRecurFuncTry(n: BigInt): BigInt =
  {
    if (n <= 1)
      1;
    else
      n * factorialRecurFuncTry(n - 1);
  }

}
