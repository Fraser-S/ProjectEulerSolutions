import org.scalatest._

class Project1test extends FlatSpec with Matchers {
  val project1 = new Project1()
  "The notation function with short" should "follow the correct notation for less than 10^3" in {
    assert(project1.sumMultiplesOf3And5(10) === 23)
  }
}