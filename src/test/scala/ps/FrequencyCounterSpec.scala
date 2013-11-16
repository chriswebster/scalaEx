package ps

import org.specs2.mutable.Specification

class CachingKeyRetrievalTest extends Specification {
	"FrequencyImpl" should {
	  "return empty map for an empty token list" in {
	    FrequencyImpl.categorizeByFirstLetter(List.empty) === Map.empty
	  }
	  
	  "Categorize tokens accurately" in {
	    val tokens = List("This","that","and","the",",","other","7","times")
	    val expectedMap = Map (
	    	't' -> List("This","that","the","times"),
	    	'a' -> List("and"),
	    	'o' -> List("other")
	    )
	    FrequencyImpl.categorizeByFirstLetter(tokens) === expectedMap
	  }
	}
}