#!scala

import java.util.Date

object TryFunc09
{
  def main(args: Array[String]): Unit =
  {
    println("Hello, world!");
    //println("Here is the TryFunc09!");
    //printf ("Here is %s!\n" ,"TryFunc09");
    printf ("Here is %s!\n" ,getClass.getName());
    println ("--------------------");
    //printf ("--------------------\n");

    println ("---------- Try [Currying Functions] here ----------");
    var tempValue   : Int  = 0;
    val tempData01  : Int  = 2;
    val tempData02  : Int  = 3;

    val str1:String = "Hello, ";
    val str2:String = "Scala!";

    println( "str1 + str2 = " +  strcat(str1)(str2) );
    println( "str1 + str2 = " +  strcat01(str1)(str2) );

    println ("--------------------");

    printf ("----------End of %s----------\n" ,getClass.getName());
    println ("--------------------");
  }

  //Currying Functions example
  //one format
  def strcat(s1: String)(s2: String) =
  {
    //s1 + s2
    (s1 + s2)
  }
  //another format
  def strcat01(s1: String) = (s2: String) =>
  {
    (s1 + s2);
  }

}
