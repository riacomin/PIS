import scala.actors.Actor

/**
  * Created by riacomin on 04.10.2017.
  */
object Chapter1 {
  def main(args: Array[String]): Unit = {

//    1.1
    var capital = Map("US" -> "Washington", "France" -> "Paris")

    capital += ("Japan" -> "Tokyo")

    println(capital("France"))

    println(factorial(30))


  }

  def factorial(x: BigInt): BigInt =
    {
      if (x==0) 1 else x * factorial(x-1)
    }
  import java.math.BigInteger

  def jfactorial(x: BigInteger): BigInteger =
    if (x == BigInteger.ZERO)
      BigInteger.ONE
    else
      x.multiply(jfactorial(x.subtract(BigInteger.ONE)))
  // Actors used by Erlang programming
// Actors can do 2 basi ops message send and recieve
//  recipient ! msg

  val xs = 1 to 3
  val it = xs.iterator
//  eventually




}

// example of Akka actor Scala

//class ChecksumActor extends Actor{
//  var sum = 0
//  def receive = {
//    case Data(byte) => sum += byte
//    case GetChecksum(requester) =>
//      val checksum = ~(sum & 0xFF) + 1
//      requester ! checksum
//
//  }
//}



