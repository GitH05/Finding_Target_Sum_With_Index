import java.util.*;
public class TwoSum
{
    public static void main(String[] args) {
        int i,j,size,target,index1,index2;

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        size=s.nextInt();
        System.out.println("The size of the array is: "+size);
        int a[]=new int[size];

        for(i=0;i<size;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("The elements are:");
        for(i=0;i<size;i++)
        {
            System.out.println(a[i]+" ");
        }
	System.out.println("Enter the target element");
	target=s.nextInt();
	for(i=0;i<size;i++)
	{
	for(j=i+1;j<size;j++)
	{
	if(target ==a[i]+a[j])
	{
	index1=i;
	index2=j;
	System.out.println("The numbers that make:"+target);
	System.out.println(a[i]+" and "+a[j]+" __Index:"+"["+index1+" "+index2+"]");
	}
	
	}
	}
	
    }
}