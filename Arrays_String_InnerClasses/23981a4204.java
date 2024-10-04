import java.util*;
class bubble
{
	public static void main(string[args]
	{
		scanner s=new scanner (system.in);
		int a[],i;
		a=new int[20];
		system.out.println("enter array size");
		int n=s.next int();
		system.out.println("enter elements into array");
		for(i=0;i<n;i++)
			a[i]=s.nextint();
		system.out.println("array before sorting");
		for (i=0;i<n;i++)
			system.out.println(a[i]);
		for(i=0;i<n;i++)
		{
			for (intj=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
		system.out.println("array after sorting");
		for(i=0;i<n;i++)
			system.out.println(a[i]);
	}
}

				
				
		