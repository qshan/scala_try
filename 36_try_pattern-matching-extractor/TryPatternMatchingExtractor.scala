#!scala

object TryPatternMatchingExtractor
{
  def main(args: Array[String]): Unit =
  {
    println ("--------------------");
    println("Hello, world! from " + getClass.getName());
    println ("--------------------");
    println ();
    //printf ("--------------------\n");

    var tempIntValue  : Int     = 0;
    var tempStrValue  : String  = "InitNeeded";
    val tempInt01     : Int     = 2;
    val tempInt02     : Int     = 3;
    val tempStr       : String  = "Try String Data";
    var tempCaseName  : String  = "InitNeeded";

    tempCaseName = "Try Pattern Matching With Extractor";
    println ("---------- Try [" + tempCaseName + "] here ----------");

    //The compiler will invoke the apply function on this instance
    val x = TryPatternMatchingExtractor(5);
    println(x);

    x match
    {
      case TryPatternMatchingExtractor(num) =>
        println(x + " is bigger two times than " + num);
      //unapply is invoked, //TODO//Why is unapply function?
      case _ => println("i cannot calculate");
    }
    println ("--------------------");

    println ();
    printf ("----------End of %s----------\n" ,getClass.getName());
    println ();
    //println ("--------------------");
  }

  def apply(x: Int) = x*2;
  def unapply(z: Int): Option[Int] = if (z%2==0) Some(z/2) else None;

}
