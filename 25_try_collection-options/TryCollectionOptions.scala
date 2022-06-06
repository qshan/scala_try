#!scala

object TryCollectionOptions
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

    tempCaseName = "Collection - Options Basic Operation";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    val capitals01 = Map("France" -> "Paris", "Japan" -> "Tokyo");

    println("capitals.get( \"France\" ) : " +  capitals01.get( "France" ));
    println("capitals.get( \"India\" )  : " +  capitals01.get( "India" ));
    println ("--------------------");

    tempCaseName = "Collection - Matching";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    val capitals02 = Map("France" -> "Paris", "Japan" -> "Tokyo")

    println("show(capitals.get( \"Japan\")) : " + show02(capitals02.get( "Japan")) );
    println("show(capitals.get( \"India\")) : " + show02(capitals02.get( "India")) );
    println ("--------------------");

    tempCaseName = "Collection - Using getOrElse() Method";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    val a03:Option[Int] = Some(5);
    val b03:Option[Int] = None;

    println("a03.getOrElse(0):  " + a03.getOrElse(0) );
    println("b03.getOrElse(10): " + b03.getOrElse(10) );
    println ("--------------------");

    tempCaseName = "Collection - Using isEmpty() Method";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    val a04:Option[Int] = Some(5);
    val b04:Option[Int] = None;

    println("a04.isEmpty: " + a04.isEmpty );
    println("b04.isEmpty: " + b04.isEmpty );
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
