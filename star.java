package sample1;

public class star {
public static void main(String[] args) {
	int n=10;
	for(int i=1;i<10;i++)
	{
		for(int k=n;k>0;k--)
		{
			System.out.print(" ");
		}
		for(int j=0;j<i;j++)
		System.out.print("*");
		for(int j=0;j<i;j++)
		System.out.print("*");
		System.out.print("\n");
		n--;
	}
}
}
