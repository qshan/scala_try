#!scala

// create private contructor methods
class TryClass05 private(val color:String)
{
  println("Init the Instance here");
  println("Create" + this);
  override def toString(): String = ("Color Tag："+ color);
}

//伴生对象，与类名字相同，可以访问类的私有属性和方法
//Companion Objects, the name is same as the one of class.
//Companion objext could access private methods and data directly
object TryClass05
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

    println ("---------- Try [Classes - Singleton Objects with private contructor] here ----------");

    println(TryClass05("red"));
    // Calling Singleton function here 单例函数调用，省略了.(点)符号
    println(TryClass05 getMarker "blue");

    println ("--------------------");

    println ();
    printf ("----------End of %s----------\n" ,getClass.getName());
    println ();
    //println ("--------------------");
  }

  private val markers: Map[String, TryClass05] =
  Map(
    "red"   -> new TryClass05("red"),
    "blue"  -> new TryClass05("blue"),
    "green" -> new TryClass05("green")
  )

  def apply(color:String) =
  {
    if(markers.contains(color))
      markers(color);
    else
      null;
  }

  def getMarker(color:String) =
  {
    if(markers.contains(color))
      markers(color);
    else
      null;
  }

}
