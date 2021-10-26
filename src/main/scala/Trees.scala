class Trees {

  abstract class IntTree
  case object EmptyTree extends IntTree
  case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree

  def contains(t: IntTree, v: Int): Boolean = t match {

      case EmptyTree => false

      case Node(el, left, _) if el < v  => contains(left, v)

      case Node(el, _, right) if el > v => contains(right, v)

      case _ => true
  }

  def insert(t: IntTree, v: Int): IntTree = t match {

      case EmptyTree => Node(v, EmptyTree, EmptyTree)

      case Node(el, left, right) if el < v =>
        Node(el, insert(left, v), right)

      case Node(el, left, right) if el > v =>
        Node(el, left, insert(right, v))

      case _ => t
  }

}
