class Project1 {
  def sumMultiplesOf3And5(maxNumber :Int): Int ={
    (1 to maxNumber).filter(x => x%3 == 0 || x%5 == 0).sum
  }
}