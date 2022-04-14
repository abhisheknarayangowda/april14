import java.util.Scanner;

public class arrayy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][][]a=new int[2][][];
a[0]=new int[2][];
a[1]=new int[3][];
a[0][0]=new int[3];
a[0][1]=new int[2];
a[1][0]=new int[2];
a[1][1]=new int[5];
a[1][2]=new int[3];
Scanner Scan=new Scanner(System.in);
int i;
int j;
int k;
for(i=0;i<=a.length-1;i++)
{
	for(j=0;j<=a[i].length-1;j++)
	{
		for(k=0;k<=a[i][j].length-1;k++)
		{
			System.out.println("enter marks "  +(i+1)+ " school " +(j+1)+ " class " +(k+1)+ " students");
		
		a[i][j][k]=Scan.nextInt();
		}
	}
}
for(i=0;i<=a.length-1;i++)
{
	for(j=0;j<=a[i].length-1;j++)
	{
		for(k=0;k<=a[i][j].length-1;k++)
		{
			System.out.println(a[i][j][k]);
		}

	}

}
}}