import java.lang.System._

/**
 * Added by Filip Kofron on 2/17/15.
 */
object Main {
  def sort(data : Array[Int]): Array[Int] = {
    if (data.length <= 1) data
    else {
      val min = data.min
      val mins = data.filter(_ <= min)
      mins ++ sort(data.filter(_ > min))
    }
  }

  def impsort(data : Array[Int]): Array[Int] = {
    if (data.length <= 1) data
    else {
      var sorted = new Array[Int](data.length)
      var max = data.max
      for(i <- 0 until data.length)
      {
        var min = data(i)
        for(j <- i until data.length)
        {
          if(data(j) < min)
            min = data(j)
          data(j) = max
        }
        sorted(i) = min
        min = max
      }
    }
  }

  def main(args: Array[String]): Unit =
  {
    println(sort(Array(2, 1, 3, 5, 0)).mkString)
    println(impsort(Array(2, 1, 3, 5, 0)).mkString)
  }
}
