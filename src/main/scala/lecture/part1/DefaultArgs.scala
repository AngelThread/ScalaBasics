package lecture.part1

object DefaultArgs extends App {

  def trFact(n: Int, acc: Int = 1): Int = { // default values

    if (n <= 1) acc
    else trFact(n - 1, n * acc)
  }

  println(trFact(10, 5))

  def savePicture(format: String = "jpeg", width: Int = 1920, height: Int = 1080): Unit = println("saving")

  savePicture("jpeg", 1, 2);
  savePicture()
  savePicture(height = 800);

  /** *
    * 1. pass in every leading argument
    * 2. name the arguments
    *
    */

  savePicture(height = 800, format = "bitmap")

}