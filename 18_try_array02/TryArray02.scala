#!scala

import Array._

object TryArray02
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

    println ("---------- Try [Multi-Dimensional Array] here ----------");
    var myMatrix = ofDim[Int](3,3)
    
    // build a matrix
    for (i <- 0 to 2)
    {
      for ( j <- 0 to 2)
      {
        myMatrix(i)(j) = j;
      }
    }
    
    // Print two dimensional array
    println ("Go through the element of Array");
    for (i <- 0 to 2)
    {
      for ( j <- 0 to 2)
      {
        print(" " + myMatrix(i)(j));
      }
      println();
    }
    println ("--------------------");

    println ("---------- Try [Concatenate Array] here ----------");
    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)

    println ("Try to concatenate the Arrays");
    var myList3 =  concat( myList1, myList2)
    
    // Print all the elements of array merged
    println ("Go through the element of Array merged");
    for ( x <- myList3 ) {
       println( x )
    }
    println ("--------------------");

    println ();
    printf ("----------End of %s----------\n" ,getClass.getName());
    println ();
    //println ("--------------------");
  }

  //Multi-Dimensional Array example

}
