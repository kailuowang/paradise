import org.scalatest.FunSuite

class Argumentative extends FunSuite {
  test("combo") {
    @argumentative(1, 2) object X
    assert(X.toString === "1 2")
  }
}