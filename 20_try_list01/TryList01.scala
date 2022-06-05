#!scala

import Array._

object TryList01
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

    println ("---------- Try [Collections - List] here ----------");
    // List of Strings
    val fruit: List[String] = List("apples", "oranges", "pears")
    // List of Integers
    val nums: List[Int] = List(1, 2, 3, 4)
    // Empty List.
    val empty: List[Nothing] = List()
    // Two dimensional list
    val dim: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )
    println ("--------------------");
    
    // List of Strings
    val fruit01 = "apples" :: ("oranges" :: ("pears" :: Nil))
    // List of Integers
    val nums01 = 1 :: (2 :: (3 :: (4 :: Nil)))
    // Empty List.
    val empty01 = Nil
    // Two dimensional list
    val dim01 = (1 :: (0 :: (0 :: Nil))) ::
                (0 :: (1 :: (0 :: Nil))) ::
                (0 :: (0 :: (1 :: Nil))) :: Nil
    println ("--------------------");

    println ("---------- Try [Collections - List Basic operation] here ----------");
    val fruit02 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val nums02 = Nil
    println( "Head of fruit02           : " + fruit02.head )
    println( "Tail of fruit02           : " + fruit02.tail )
    println( "Check if fruit02 is empty : " + fruit02.isEmpty )
    println( "Check if nums02 is empty  : " + nums02.isEmpty )
    println ("--------------------");

    println ("---------- Try [Concatenating Lists] here ----------");
    val fruit03 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val fruit04 = "mangoes" :: ("banana" :: Nil)
    println( "Check the current stuatus here");
    println( "fruit03 is : " + fruit03 );
    println( "fruit04 is : " + fruit04 );
    println ("--------------------");

    // use two or more lists with ::: operator
    println ("Try use the ::: operater to add the list");
    var fruit05 = fruit03 ::: fruit04;
    println( "fruit03 ::: fruit04 : " + fruit05 );
    println ("--------------------");
    
    // use two lists with Set.:::() method
    println ("Try use the .:::() method to add the list");
    fruit05 = fruit03.:::(fruit04);
    println( "fruit03.:::(fruit04) : " + fruit05 );
    println ("--------------------");

    // pass two or more lists as arguments
    println ("Try use the List.concat() to add the list");
    fruit05 = List.concat(fruit03, fruit04);
    println( "List.concat(fruit03, fruit04) : " + fruit05 );
    println ("--------------------");

    println ("---------- Try [Collections - List.fill()] here ----------");
    val fruit06 = List.fill(3)("apples") // Repeats apples three times.
    println( "fruit06 : " + fruit06  )

    val num06 = List.fill(10)(2)         // Repeats 2, 10 times.
    println( "num06 : " + num06  )
    println ("--------------------");

    println ();
    printf ("----------End of %s----------\n" ,getClass.getName());
    println ();
    //println ("--------------------");
  }

  //Multi-Dimensional Array example

}
