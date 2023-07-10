package Examples.InnerClass;
//access inner class from outside class

class AnotherClass
{
	
public static void main(String[] args) {
	OuterClass outer=new OuterClass();
			OuterClass.InnerClass innerobj=outer.new InnerClass();
			innerobj.innerMethod();
}

}
