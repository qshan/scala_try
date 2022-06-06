#!scala

import Array._

object TryCollectionMap
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

    tempCaseName = "Collection Map Basic Operation";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    val colors01 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F");

    val nums01: Map[Int, Int] = Map();

    println( "Keys in colors01            : " + colors01.keys );
    println( "Values in colors01          : " + colors01.values );
    println( "Check if colors01 is empty  : " + colors01.isEmpty );
    println( "Check if nums01 is empty    : " + nums01.isEmpty );
    println ("--------------------");

    tempCaseName = "Collection Concatenating Maps";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    val colors02 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F");
    val colors03 = Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "#FF0000");

    // use two or more Maps with ++ as operator
    var colors04 = colors02 ++ colors03;
    println( "colors02 ++ colors03 : " + colors04 );

    // use two maps with Set.++() as method
    colors04 = colors02.++(colors03);
    println( "colors02.++(colors03)) : " + colors04 );
    println ("--------------------");

    tempCaseName = "Print Keys and Values from a Map";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    val colors05 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF","peru" -> "#CD853F");

    colors05.keys.foreach{ i =>  
         print( "Key = " + i );
         println(" Value = " + colors05(i) );}
    println ("--------------------");

    tempCaseName = "Check for a key in Map With Map.contains()";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    val colors06 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F");

    if( colors06.contains( "red" ))
    {
      println("Red key exists with value :"  + colors06("red"));
    }
    else
    {
      println("Red key does not exist");
    }
    
    if( colors06.contains( "maroon" ))
    {
      println("Maroon key exists with value :"  + colors06("maroon"));
    }
    else
    {
      println("Maroon key does not exist");
    }
    println ("--------------------");

    println ();
    printf ("----------End of %s----------\n" ,getClass.getName());
    println ();
    //println ("--------------------");
  }

}
