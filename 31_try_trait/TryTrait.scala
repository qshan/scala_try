#!scala

trait Equal
{
  def isEqual(x: Any): Boolean;
  def isNotEqual(x: Any): Boolean = !isEqual(x);
}
class Point(xc: Int, yc: Int) extends Equal
{
  var x: Int = xc;
  var y: Int = yc;

  def isEqual(obj: Any) =
    obj.isInstanceOf[Point] &&
    obj.asInstanceOf[Point].x == y;
}

//Value class example
trait Printable extends Any
{
  def print(): Unit = println(this);
}
class Wrapper(val underlying: Int) extends AnyVal with Printable


object TryTrait
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

    println ("---------- Try [Trait - Basic] here ----------");

    val p1 = new Point(2, 3);
    val p2 = new Point(2, 4);
    val p3 = new Point(3, 3);

    println(p1.isNotEqual(p2));
    println(p1.isNotEqual(p3));
    println(p1.isNotEqual(2));
    println ("--------------------");

    println ("---------- Try [Trait - Value Class] here ----------");
    val w = new Wrapper(3);
    w.print(); // actually requires instantiating a Wrapper instance
    println ("--------------------");

    println ();
    printf ("----------End of %s----------\n" ,getClass.getName());
    println ();
    //println ("--------------------");
  }

}
