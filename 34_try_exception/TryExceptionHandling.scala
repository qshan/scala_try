#!scala

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object TryExceptionHandling
{
  def main(args: Array[String]): Unit =
  {
    println ("--------------------");
    println("Hello, world! from " + getClass.getName());
    println ("--------------------");
    println ();
    //printf ("--------------------\n");

    var tempIntValue  : Int     = 0;
    var tempStrValue  : String  = "Init";
    val tempInt01     : Int     = 2;
    val tempInt02     : Int     = 3;
    val tempStr       : String  = "Try String Data";

    println ("---------- Try [Exception Handling] here ----------");
    try
    {
      val f = new FileReader("input.txt");
    }
    catch
    {
      case ex: FileNotFoundException =>
      {
        println("Missing file exception");
      }

      case ex: IOException =>
      {
        println("IO Exception");
      }
    }
    //finally is optional,
    // will run no matter how the expression terminates
    finally
    {
      println("anyway, Exiting finally here...[optional]");
    }
    println ("--------------------");

    println ();
    printf ("----------End of %s----------\n" ,getClass.getName());
    println ();
    //println ("--------------------");
  }

}
