#!scala

import Array._

object TryList02
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

    println ("---------- Try [Collections - List - Tabulating a Function] here ----------");
    // Creates 6 elements using the given function.
    val squares = List.tabulate(6)(n => n * n); //n = 0,1,2,3,4,5
    println( "squares : " + squares  );

    // Creates 2 devision list using the given function.
    val mul = List.tabulate( 4,5 )( _ * _ );
    println( "mul : " + mul  );
    println ("--------------------");

    println ();
    printf ("----------End of %s----------\n" ,getClass.getName());
    println ();
    //println ("--------------------");

    println ("---------- Try [Collections - List - List.reverse] here ----------");
    val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil));
    println( "before site.reverse : " + site );

    println( "after  site.reverse : " + site.reverse );
    println ("--------------------");
  }

  //Multi-Dimensional Array example

}
