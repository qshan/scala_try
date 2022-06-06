#!scala

import java.io._

object TryFileIO
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

    tempCaseName = "File Write";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    val writer = new PrintWriter(new File("FileOperationTest.txt" ));

    writer.write("Hello Scala\n");
    writer.write("Hello from " + tempCaseName + " example\n");
    writer.close();
    println ("--------------------");

    tempCaseName = "File Read";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    println("Following is the content read:" )

    scala.io.Source.fromFile("FileOperationTest.txt" ).foreach{
         print;
      }
    println ("--------------------");

    tempCaseName = "Console Read";
    println ("---------- Try [" + tempCaseName + "] here ----------");
    print("Please enter your input : " )
    //val line = Console.readLine();
    val line = scala.io.StdIn.readLine();

    println("Thanks, you just typed: " + line)
    println ("--------------------");

    println ();
    printf ("----------End of %s----------\n" ,getClass.getName());
    println ();
    //println ("--------------------");
  }

}
