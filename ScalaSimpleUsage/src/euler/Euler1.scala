package simple

object Euler1 {
	
  
	def main(args:Array[String])
	{
	  
	  var number = (1 until 1000).filter(n => n%3==0 || n%5==0).sum.toString();
	  printf((1 until 10).filter(n => n%3==0 || n%5==0).sum.toString());
	  
	}
  
  
}