import org.scalatest._

class Project1test extends FlatSpec with Matchers {
  val project1 = new Project1()
  "sumMultiplesOf3And5" should "should add the numbers between 1-9 that are multiples of 3 and 5" in {
    assert(project1.sumMultiplesOf3And5(9) === 23)
  }

  "it" should "should add the numbers between 1-20 that are multiples of 3 and 5" in {
    assert(project1.sumMultiplesOf3And5(20) === 3+5+6+9+10+12+15+18+20)
  }

  "it" should "should add the numbers between 1-50 that are multiples of 3 and 5" in {
    assert(project1.sumMultiplesOf3And5(50) === 3+5+6+9+10+12+15+18+20+21+24+25+27+30+33+35+36+39+40+42+45+48+50)
  }
}