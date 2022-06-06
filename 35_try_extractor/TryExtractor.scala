#!scala

object TryExtractor
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

    tempCaseName = "Extractor";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    println ("Apply method : "    + apply("Zara", "gmail.com"));
    println ("Unapply method : "  + unapply("Zara@gmail.com"));
    println ("Unapply method : "  + unapply("Zara Ali"));
    println ("--------------------");

    println ();
    printf ("----------End of %s----------\n" ,getClass.getName());
    println ();
    //println ("--------------------");
  }

  // The injection method (optional)
  def apply(user: String, domain: String) =
  {
    //user +"@"+ domain
    (user +"@"+ domain);
  }
  // The extraction method (mandatory)
  def unapply(str: String): Option[(String, String)] =
  {
    val parts = str split "@";
    
    if (parts.length == 2)
    {
      Some(parts(0), parts(1)); 
    }
    else
    {
      None;
    }
  }

}
