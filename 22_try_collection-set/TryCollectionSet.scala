#!scala

import Array._

object TryCollectionSet
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

    tempCaseName = "Basic Operations on set";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    //val fruit           = Set("apples", "oranges", "pears");
    val fruit           = scala.collection.immutable.Set("apples", "oranges", "pears");
    //default//scala.collection.immutable.Set
    //scala.collection.mutable.Set
    val nums: Set[Int]  = Set();

    println( "Head of fruit           : " + fruit.head );
    println( "Tail of fruit           : " + fruit.tail );
    println( "Check if fruit is empty : " + fruit.isEmpty );
    println( "Check if nums is empty  : " + nums.isEmpty );
    println ("--------------------");

    tempCaseName = "Concatenating Sets";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    val fruit01 = Set("apples", "oranges", "pears");
    val fruit02 = Set("mangoes", "banana");

    // use two or more sets with ++ as operator
    var fruit03 = fruit01 ++ fruit02;
    println( "fruit01 ++ fruit02 : " + fruit03 );

    // use two sets with Set.++ as method
    fruit03 = fruit01.++(fruit02);
    println( "fruit01.++(fruit02) : " + fruit03 );
    println ("--------------------");

    tempCaseName = "Set.min and Set.max";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    val num04 = Set(5,6,9,20,30,45);

    // find min and max of the elements
    println( "Min element in Set(5,6,9,20,30,45) : " + num04.min );
    println( "Max element in Set(5,6,9,20,30,45) : " + num04.max );
    println ("--------------------");

    tempCaseName = "Find Common Values Insets between 2 sets";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    val num05 = Set(5,6,9,20,30,45);
    val num06 = Set(50,60,9,20,35,55);

    // find common elements between two sets
    println( "num5.&(num6)          : " + num05.&(num06) );
    println( "num5.intersect(num6)  : " + num05.intersect(num06) );
    println ("--------------------");

    tempCaseName = "Set Basic Operation";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    val set07 = Set(1,2,3);
    println("Current Set is " + set07.getClass.getName);

    println(set07.exists(_ % 2 == 0)); //true
    println(set07.drop(1)); //Set(2,3)
    println ("--------------------");

    tempCaseName = "Try mutable Set Operation";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    val mutableSet08 = scala.collection.mutable.Set(1,2,3);
    println("mutableSet08 is " + mutableSet08.getClass.getName); // scala.collection.mutable.HashSet

    mutableSet08.add(4);
    mutableSet08.remove(1);
    mutableSet08 += 5;
    mutableSet08 -= 2;

    println(mutableSet08); // Set(5, 3, 4)

    val another08 = mutableSet08.toSet;
    println("another08 is " + another08.getClass.getName); // scala.collection.immutable.Set

    println ("--------------------");

    println ();
    printf ("----------End of %s----------\n" ,getClass.getName());
    println ();
    //println ("--------------------");
  }

}
