#!scala

import java.io._

class Point(val xc: Int, val yc: Int)
{
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int)  =
  {
    x = x + dx;
    y = y + dy;
    println ("Point x location : " + x);
    println ("Point y location : " + y);
  }
}

//The example of Class extend
class Location(override val xc: Int, override val yc: Int,
                val zc :Int) extends Point(xc, yc)
{
  var z: Int = zc;

  def move(dx: Int, dy: Int, dz: Int) =
  {
    x = x + dx;
    y = y + dy;
    z = z + dz;
    println ("Point x location : " + x);
    println ("Point y location : " + y);
    println ("Point z location : " + z);
  }

}

object TryClass02
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

    println ("---------- Try [Class - Basic] here ----------");

    //create an class instance of example
    val pt  = new Point(10, 20);
    //create an extend class instance of example
    val loc = new Location(10 ,20 ,15);

    //call methods of class example
    println ("Call the methods of basic class");
    // Move to a new location
    pt.move(10, 10);
    println ("get Class name :" + pt.getClass.getName());
    println ("--------------------");

    //call methods of extend class example
    println ("Call the methods of extended class");
    loc.move(10 ,10 ,10);
    println ("get Class name :" + loc.getClass.getName());
    println ("--------------------");

    println ();
    printf ("----------End of %s----------\n" ,getClass.getName());
    println ();
    //println ("--------------------");
  }

}
