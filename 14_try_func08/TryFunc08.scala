#!scala

import java.util.Date

object TryFunc08
{
  def main(args: Array[String]): Unit =
  {
    println("Hello, world!");
    //println("Here is the TryFunc08!");
    //printf ("Here is %s!\n" ,"TryFunc08");
    printf ("Here is %s!\n" ,getClass.getName());
    println ("--------------------");
    //printf ("--------------------\n");

    println ("---------- Try [Partially Applied Functions] here ----------");
    var tempValue   : Int  = 0;
    val tempData01  : Int  = 2;
    val tempData02  : Int  = 3;

    val date = new Date;
    val logWithDateBound = log(date, _ : String);

    logWithDateBound("message1" );
    Thread.sleep(10000);

    logWithDateBound("message2" );
    Thread.sleep(10000);

    logWithDateBound("message3" );

    println ("--------------------");

    printf ("----------End of %s----------\n" ,getClass.getName());
    println ("--------------------");
  }

  //Partially Applied Functions example
  def log(date: Date, message: String) =
  {
    //TODO//this time info do not updated. how to update it
    println(date.getTime() + "----" + message);
  }

}
