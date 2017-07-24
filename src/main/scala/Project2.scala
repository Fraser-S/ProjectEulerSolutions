class Project2 {
  def evenFibonacci(loopTo :Int):Int= {
    def iter(n: Int, nMinus1: Int, nMinus2 :Int): List[Int] = n match {
      case a if n > loopTo => List()
      case 0 => n::iter(n + 1, n, n)
      case 1 => n::iter(n + 1, n, nMinus1)
      case _ => val curVal = nMinus1 + nMinus2; curVal::iter(n + 1, curVal, nMinus1)
    }
    iter(0,0,0).filter(_ % 2 == 0).sum
  }

  def task(): Int ={
    def iter(n: Int, nMinus1: Int, nMinus2 :Int): List[Int] = n match {
      case exit if nMinus1 + nMinus2 > 4000000 => List()
      case 0 => n::iter(n + 1, n, n)
      case 1 => n::iter(n + 1, n, nMinus1)
      case _ => val curVal = nMinus1 + nMinus2;curVal::iter(n + 1, curVal, nMinus1)
    }
    iter(0,0,0).filter(_ % 2 == 0).filter(_ < 4000000).sum
  }
}
