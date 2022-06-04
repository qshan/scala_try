#!scala

object TryFunc01
{
  def main(args: Array[String]): Unit =
  {
    println("Hello, world!");
    //println("Here is the TryFunc01!");
    //printf ("Here is %s!\n" ,"TryFunc01");
    printf ("Here is %s!\n" ,getClass.getName());
    println ("--------------------");
    //printf ("--------------------\n");

    println ("---------- Try [Func01] here ----------");
    var tempValue : Int  = 0;
    val tempData  : Int  = 5;
    tempValue = addOneWithInputTryFunc01(tempData);
    println ("Get the data is " + tempValue);
    println ("--------------------");

    printf ("----------End of %s----------\n" ,getClass.getName());
    println ("--------------------");
  }

  //call by name example here
  def addOneWithInputTryFunc01(args : Int) : Int =
  {
    //printf ("Here is %s!\n" ,getClass.getName());
    println("Get args is :" + args);
    //printf ("----------End of %s----------\n" ,getClass.getName());

    //return data is here
    (args +1);
  }

}
