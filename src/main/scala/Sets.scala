class Sets {

  def union(s1: Set[Int], s2: Set[Int]): Set[Int] = {
    s1 ++ s2
  }

  def intersection(s1: Set[Int], s2: Set[Int]): Set[Int] = {

    val temp: Set[Int] = Set()

    if(s1.isEmpty || s2.isEmpty) temp

    val temp1 = s1--s2
    s1--temp1

  }
}
