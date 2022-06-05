#!scala

object TryArray01
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

    println ("---------- Try [Array] here ----------");
    var myList = Array(1.9, 2.9, 3.4, 3.5)

    // Print all the array elements
    println ("Go through the element of Array");
    for ( x <- myList )
    {
      println( x )
    }
    println ("--------------------");

    // Summing all elements
    println ("Get the sum of Array");
    var total = 0.0;
    for ( i <- 0 to (myList.length - 1))
    {
      total += myList(i);
    }
    println("The Sum of Array is " + total);
    println ("--------------------");

    // Finding the largest element
    println ("Find the max element of Array");
    var max = myList(0);
    for ( i <- 1 to (myList.length - 1) )
    {
      if (myList(i) > max) max = myList(i);
    }
    println("Max is " + max);
    println ("--------------------");

    println ();
    printf ("----------End of %s----------\n" ,getClass.getName());
    println ();
    //println ("--------------------");
  }

  //Array example

}
