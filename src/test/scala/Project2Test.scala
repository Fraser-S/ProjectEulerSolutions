import org.scalatest._

class Project2Test extends FlatSpec with Matchers {
  val project2 = new Project2()




  "evenFibonacci" should "should add the even numbers of the first ten numbers in the fibonacci sequence" in {
    val input = 10
    val expected:Int = 2 + 8 + 34
    assert(project2.evenFibonacci(input) === expected)
  }

  it should "should add the even numbers of the first 15 numbers in the fibonacci sequence" in {
    val input = 15
    val expected:Int = 2 + 8 + 34 + 144 + 610
    assert(project2.evenFibonacci(input) === expected)
  }

  it should "should add the even numbers of the first 30 numbers in the fibonacci sequence" in {
    val input = 30
    val expected:Int = 2 + 8 + 34 + 144 + 610 + 2584 + 10946 + 46368 + 196418 + 832040
    assert(project2.evenFibonacci(input) === expected)
  }

  "task" should "should add the even numbers in the fibonacci sequence which are less than 4,000,000" in {
    val expected:Int = 4613732
    assert(project2.task() === expected)
  }
}