import org.scalatest.funsuite.AnyFunSuite

class SetsTest extends AnyFunSuite {
  val s1 = Set(1, 2, 3, 4, 5, 6)
  val s2 = Set(4, 5, 6, 7, 8, 9)
  val s3: Set[Int] = Set()

  val op = new Sets()

  test("Test the union of given sets") {
    assert(op.union(s1,s2) == (s1 | s2) )
  }

  test("Test the union if one set is Empty") {
    assert(op.union(s1,s3) == (s1) )
  }

  test("Test the intersection of given sets") {
    assert(op.intersection(s1, s2) == (s1 & s2))
  }

  test("Test the intersection if one set is Empty") {
    assert(op.intersection(s1,s3) == (s3) )
  }

}