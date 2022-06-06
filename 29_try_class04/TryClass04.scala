#!scala

import java.io._

class Point(val xc: Int, val yc: Int)
{
  var x: Int = xc;
  var y: Int = yc;
  
  def move(dx: Int, dy: Int) =
  {
    x = x + dx;
    y = y + dy;
  }
}

object TryClass04
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

    println ("---------- Try [Classes - Singleton Objects] here ----------");

    val point = new Point(10, 20);
    printPoint;

    def printPoint  =
    {
      println ("Point x location : " + point.x);
      println ("Point y location : " + point.y);
    }
    println ("--------------------");

    println ();
    printf ("----------End of %s----------\n" ,getClass.getName());
    println ();
    //println ("--------------------");
  }

}
