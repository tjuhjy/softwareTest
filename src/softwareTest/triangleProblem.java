package softwareTest;

public class triangleProblem {
	
		public boolean Triangle(int a, int b, int c) {
	       boolean isTriangle = false;
	       if(a+b>c&&b+c>a&&a+c>b&&a>0&&b>0&&c>0)
	       {
	    	   isTriangle = true;
	       }
	       return isTriangle;
	    }
		
		public String equilateral(int a , int b , int c) {
			String result = "notEquilateral";
			if(Triangle(a,b,c) == true) {
				if(a==b&&b==c)
				{
					result ="equilateral";
				}
			}
			return result;
		}
		
		public String isosceles(int a, int b, int c)
		{
			String result = "notIsosceles";
			if(Triangle(a,b,c) == true) {
				if(a==b||b==c)
				{
					result = "isosceles";
				}
			}
			return result;
		}
		
		public String scalene(int a , int b , int c)
		{
			String result = "notScalene";
			if(Triangle(a,b,c) == true) {
				if(a != b && a != c && b != c)
				{
					return result = "scalene";
				}
			}
			return result;
		}
}
