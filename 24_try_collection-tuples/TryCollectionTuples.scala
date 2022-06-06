#!scala

import Array._

object TryCollectionTuples
{
  def main(args: Array[String]): Unit =
  {
    println ("--------------------");
    println("Hello, world! from " + getClass.getName());
    println ("--------------------");
    println ("");
    //printf ("--------------------\n");

    var tempIntValue  : Int     = 0;
    var tempStrValue  : String  = "InitNeeded";
    val tempInt01     : Int     = 2;
    val tempInt02     : Int     = 3;
    val tempStr       : String  = "Try String Data";
    var tempCaseName  : String  = "InitNeeded";

    tempCaseName = "Collection Tuples Basic Operation";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    val t01   = (4,3,2,1);
    val sum01 = t01._1 + t01._2 + t01._3 + t01._4;

    println( "Sum01 of elements: "  + sum01 );
    println ("--------------------");

    tempCaseName = "Collection - Iterate over the Tuple";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    val t02 = (4,3,2,1);

    t02.productIterator.foreach{ i =>println("Value = " + i )}
    println ("--------------------");

    tempCaseName = "Collection - Converting to String";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    val t03 = new Tuple3(1, "hello", Console)

    println("Concatenated String: " + t03.toString() );
    println ("--------------------");

    tempCaseName = "Collection - Swap the Elements";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    val t04 = new Tuple2("Scala", "hello");

    println("Original Tuple : " + t04 );
    println("Swapped Tuple  : " + t04.swap );
    println ("--------------------");

    println ();
    printf ("----------End of %s----------\n" ,getClass.getName());
    println ();
    //println ("--------------------");
  }

}
