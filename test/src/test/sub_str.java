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
		System.out.println("������һ��ȫ��Ӣ��Сд��ĸ���ɵ��ַ�����");
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
					System.out.print("�ַ���"+line+"����С����ǣ�"+line.substring(0,end));
					System.out.println(ch+"��");
				}
				else
				{
					System.out.println("�ַ���"+line+"û����С��̣�Ϊ�գ���");
				}
		}
		else
		{
			System.out.println("��û�������κζ�����");
		}
	}
}