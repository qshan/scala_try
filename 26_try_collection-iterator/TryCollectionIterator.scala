#!scala

object TryCollectionIterator
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

    tempCaseName = "Collection - Iterator.next() and Iterator.hasNext";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    val it01 = Iterator("a", "number", "of", "words");

    while (it01.hasNext)
    {
      println(it01.next());
    }
    println ("--------------------");

    tempCaseName = "Collection - Iterator.min and Iterator.max";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    val ita02 = Iterator(20,40,2,50,69,90);
    val itb02 = Iterator(20,40,2,50,69,90);

    println("Maximum valued element " + ita02.max );
    println("Minimum valued element " + itb02.min );
    println ("--------------------");

    tempCaseName = "Collection - Find the Length of the Iterator";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    val ita03 = Iterator(20,40,2,50,69, 90);
    val itb03 = Iterator(20,40,2,50,69, 90);

    println("Value of ita03.size    : " + ita03.size );
    println("Value of itb03.length  : " + itb03.length );
    println ("--------------------");

    println ();
    printf ("----------End of %s----------\n" ,getClass.getName());
    println ();
    //println ("--------------------");
  }

  def show02(x: Option[String]) =
  x match
  {
    case Some(s) => s;
    case None => "?";
  }

}
