/**
  * Created by riacomin on 04.10.2017.
  */
object ChapterTwo {
  def main(args: Array[String]): Unit = {


  }
  // define some functions

  def max(x:Int, y: Int): Int = {
    if (x>y) x else y
  }

  // while llop
  val args = List{"aaa" ; "bbb"}
  var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
  }

  // iterate foreach and for

  args.foreach(arg => println(arg))
  //aaaa

}
