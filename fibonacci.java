package sample1;

public class class1{
public static void main(String[] args) {
	System.out.print("first program in ide\n");
	int[] intarray =new int[100];
	for(int i=0;i<20;i++) {
	if(i==1||i==0)
	intarray[i]=1;
	else
	intarray[i]=intarray[i-1]+intarray[i-2];
	}
	for(int i=0;i<=20;i++)
	System.out.println(intarray[i]);
}
}
