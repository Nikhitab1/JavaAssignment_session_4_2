
public class Parent {
	
	private void method1()
	{
		 System.out.println ("Parent's method1()");
		}
		public void method2() 
		{
		 System.out.println ("Parent's method2()");
		method1();//This actually invokes the  class parent's  method1(),If the child's 
		             // method need to referenced then create refernce to that class.
		
		
		}
		}
class Child extends Parent {
public void method1() {
System.out.println ("Child's method1()");
    
}
 public static void main(String[] args) {
	Parent p =new Child();//Only the parent methods will be invoked
	

	p.method2();
	
}
 
 
 //Output:
  //Parent's method2()
 //Parent's method1()

}


