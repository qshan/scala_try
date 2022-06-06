#!scala

import scala.util.matching.Regex

object TryRegularExpress
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

    println ("---------- Try [Regular Express - r() and findFirstIn] here ----------");
    val pattern01 = "Scala".r;
    val str01     = "Scala is Scalable and cool";

    println(pattern01 findFirstIn str01);
    println ("--------------------");

    println ("---------- Try [Regular Express - Regex and findAllIn( ) ] here ----------");
    val pattern02 = new Regex("(S|s)cala")
    val str02     = "Scala is scalable and cool"

    println((pattern02 findAllIn str02).mkString(","))
    println ("--------------------");

    println ("---------- Try [Regular Express - r() and replaceFirstIn] here ----------");
    val pattern03 = "Scala".r;
    val str03     = "Scala is Scalable and cool";

    println(pattern03 replaceFirstIn(str03, "Chisel"))
    println ("--------------------");

    println ();
    printf ("----------End of %s----------\n" ,getClass.getName());
    println ();
    //println ("--------------------");
  }

}
