#!scala

object TryFunc05
{
  def main(args: Array[String]): Unit =
  {
    println("Hello, world!");
    //println("Here is the TryFunc05!");
    //printf ("Here is %s!\n" ,"TryFunc05");
    printf ("Here is %s!\n" ,getClass.getName());
    println ("--------------------");
    //printf ("--------------------\n");

    println ("---------- Try [High order Function] here ----------");

    var tempValue   : Int  = 0;
    val tempData01  : Int  = 2;
    val tempData02  : Int  = 3;

    //println( applyHighOrderFuncTry( layoutHighOrderFuncTry, 10) );
    println("Get the output is "
            + applyHighOrderFuncTry( layoutHighOrderFuncTry, tempData01) );
    println ("--------------------");
    tempValue = applyHighOrderFuncTryReturnInt( layoutHighOrderFuncTryReturnInt, tempData01);
    println("Get the output is " + tempValue);

    printf ("----------End of %s----------\n" ,getClass.getName());
    println ("--------------------");
  }

  //High order function example
  def applyHighOrderFuncTry(f: Int => String, v: Int) =
  {
    println ("Get arg is " + f);
    println ("Get arg is " + v);
    f(v);
  }
  def layoutHighOrderFuncTry[A](x: A) =
  {
    "[" + x.toString() + "]";
  }

  def applyHighOrderFuncTryReturnInt(f: Int => Int, v: Int) =
  {
    println ("Get arg is " + f);
    println ("Get arg is " + v);
    //return f(v);
    f(v);
  }
  def layoutHighOrderFuncTryReturnInt[A](x: A) =
  {
    //"[" + x.toString() + "]";
    println ("Get arg is " + x);
    //return (x + 1);
    x;
  }

}
