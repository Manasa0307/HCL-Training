package com.src;
import java.util.*;
public class DetailsIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of customers");
n=s.nextInt();
s.nextLine();
String str[]=new String[n];
LinkedList emp=new LinkedList<>();
for(int i=0;i<n;i++)
{
	System.out.println("enter the stall"+(i+1));
	s1=s.nextLine();
	str[i]=s1;
}
for(String a:str)
{
	StallIterator e=new StallIterator();
	String b[]=a.split(",");
	if(b[0].startsWith("test"))
	{
	}
	else
	{
		e.setName(b[0]);
		e.setDetail(b[1]);
		e.setType(b[2]);
		e.setOwnername(b[3]);
		emp.add(e);
		}
}
System.out.println("name"+"\t"+"details"+"\t"+"type"+"\t"+"ownername");
Iterator itr=emp.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}
