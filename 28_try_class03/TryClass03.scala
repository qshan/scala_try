#!scala

// contents of Demo.scala file
//import Run._
//
//object Demo
//{
//  def main(args: Array[String]) =
//  {
//    4 times println("hello")
//  }
//}

import Run._

object TryClass03
{
  def main(args: Array[String]): Unit =
  {
    println ("--------------------");
    println("Hello, world! from " + getClass.getName());
    println ("--------------------");
    println ("");
    //printf ("--------------------\n");

    var tempIntValue  : Int     = 0;
    var tempStrValue  : String  = "Init";
    val tempInt01     : Int     = 2;
    val tempInt02     : Int     = 3;
    val tempStr       : String  = "Try String Data";

    println ("---------- Try [Implicit Classes] here ----------");

    //4 timesImplicitClassTry println("hello");
    tempInt02 timesImplicitClassTry println("hello");

    println ("--------------------");

    println ();
    printf ("----------End of %s----------\n" ,getClass.getName());
    println ();
    //println ("--------------------");
  }

}