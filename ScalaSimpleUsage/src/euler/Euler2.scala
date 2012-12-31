package simple

object Euler2 {
	
	def fib(x:Int, y:Int):Stream[Int] = {
	  
	  x #:: fib(y, x+y)
	  
	}
	
	val sum = fib(1, 2).takeWhile(n => n <= 4000000).filter(n => n%2 ==0).sum
    println(sum);
	
  
	def main(args:Array[String])
	{
	  
	  
	}
  
  
}