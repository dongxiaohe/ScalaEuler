package simple

object Euler3 {
	
	def factor(num:Long):List[Long] = {
	  
	  val exists = (2L to math.sqrt(num).toLong).find(num % _ == 0)
	  exists match {
	    case Some(d) => d :: factor(num/d)
	    case None => List(num)
	    
	  }
	  
	}
	
    println(factor(600851475143L));
	
  
	def main(args:Array[String])
	{
	  
	  
	}
  
  
}