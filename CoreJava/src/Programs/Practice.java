package Programs;

public class Practice {

	public static void main(String[] args) {
		
	for(int i=0;i<=20;i++)
	{
		int count=0;
	for(int j=2;j<=i/2;j++)
	{
		
		if(i%j==0)
		{
			count+=count;
		}
	}
	if(count==0) {
		System.out.println(i);
		}
	}
	
//	if(count==0)
//		
//			System.out.println("prime");
//		else
//			System.out.println("not prime");
	}


}
