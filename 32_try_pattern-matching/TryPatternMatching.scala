#!scala

object TryPatternMatching
{
  def main(args: Array[String]): Unit =
  {
    println ("--------------------");
    println("Hello, world! from " + getClass.getName());
    println ("--------------------");
    println ();
    //printf ("--------------------\n");

    var tempIntValue  : Int     = 0;
    var tempStrValue  : String  = "Init";
    val tempInt01     : Int     = 2;
    val tempInt02     : Int     = 3;
    val tempStr       : String  = "Try String Data";

    println ("---------- Try [Pattern Matching] here ----------");
    println(matchTest("two"));
    println(matchTest(2)); //2 is Int type
    println(matchTest("test"));
    println(matchTest(1));
    println(matchTest(1.5));
    println(matchTest(6));
    println ("--------------------");

    println ("---------- Try [Pattern Matching - using Case Class] here ----------");
    val alice   = new Person("Alice", 25);
    val bob     = new Person("Bob", 32);
    val charlie = new Person("Charlie", 32);
    for (person <- List(alice, bob, charlie))
    {
      person match
      {
        case Person("Alice", 25)  => println("Hi Alice!");
        case Person("Bob", 32)    => println("Hi Bob!");
        case Person(name, age)    => println(
           "Age: " + age + " year, name: " + name + "?");
      }
    }
    println ("--------------------");

    println ();
    printf ("----------End of %s----------\n" ,getClass.getName());
    println ();
    //println ("--------------------");
  }

  //pattern matching example
  def matchTest(x: Any): Any = x match
  {
    case 1 => "one";
    case "two"  => 2;
    case y: Int => "scala.Int";
    //error//case 6      => "scala6.Int"; //error, could not touched because of case y: Int
    case _      => "many";
  }

  //example of Matching using Case classes
  case class Person(name: String, age: Int);

}
