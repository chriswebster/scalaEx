package ps

trait FrequencyCounter {
    /**
     * Aggregates the given list by the lower case first letter of each token.
     */
	def categorizeByFirstLetter(tokens:List[String]) : Map[Char,List[String]]
}

trait DummyCounter extends FrequencyCounter {
    override def categorizeByFirstLetter(tokens:List[String]) : Map[Char,List[String]] = Map('a'->List("apple"))
}

// Dummy counter should be replaced by the appropriate implementation.

object FrequencyImpl extends FrequencyCounter with DummyCounter