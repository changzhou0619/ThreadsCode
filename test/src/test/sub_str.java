package test;
import java.util.Scanner;
public class sub_str
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String line=null;
		int end=-1;
		char ch='z'+1;
		System.out.println("请输入一个全由英文小写字母构成的字符串：");
		line=sc.nextLine();
		if(null!=line)
		{
				for(int i=line.length()-1;i>=0;i--)
				{
					ch=(char)(line.charAt(i)+1);
					if(ch<='z')
					{			
						end=i;
						break;
					}
				}
				if(end>=0)
				{
					System.out.print("字符串"+line+"的最小后继是："+line.substring(0,end));
					System.out.println(ch+"。");
				}
				else
				{
					System.out.println("字符串"+line+"没有最小后继（为空）。");
				}
		}
		else
		{
			System.out.println("你没有输入任何东西。");
		}
	}
}