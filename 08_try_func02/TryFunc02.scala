#!scala

object TryFunc02
{
  def main(args: Array[String]): Unit =
  {
    println("Hello, world!");
    //println("Here is the TryFunc02!");
    //printf ("Here is %s!\n" ,"TryFunc02");
    printf ("Here is %s!\n" ,getClass.getName());
    println ("--------------------");
    //printf ("--------------------\n");

    println ("---------- Try [Function with variable arguments] here ----------");

    var tempValue : Int  = 0;
    //val tempData  : Int  = 5;
    tempValue = printStringsFuncVarArgTry("Runoob", "Scala", "Python");
    println ("Get return data is " + tempValue);
    println ("--------------------");

    printf ("----------End of %s----------\n" ,getClass.getName());
    println ("--------------------");
  }

  //Function with variable arguments
  def printStringsFuncVarArgTry( args:String* ) = {
    var i : Int = 0;
    for( arg <- args ){
       println("Arg value[" + i + "] = " + arg );
       i = i + 1;
    }
    println ("The total number of args got is " + i);

    //return value here
    i;
  }

}
