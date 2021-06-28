import java.util.*;
class Average1
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int score,student_no=0,sum=0;
		double avg;
		while(true)
		{
			System.out.print("enter score and enter -1 to exit:");
			score=sc.nextInt();
			if(score==-1) 
			break;
			if(score<0 || score>100) continue;
			sum+=score;		
			student_no++;
		}
		avg=average(sum,student_no);
		System.out.println("no. of students:"+student_no);
		System.out.println("total score:"+sum);
		System.out.print("average of score:");
		fraction(avg,2);
	}
	static double average(int sum,int student_no)
	{
		if(student_no==0) return 0;
		return (double)sum/student_no;
	}
	static void fraction(double avg,int c)
	{
		int a=(int)avg;
		System.out.print(a+".");
		avg=avg-a;		
		while(c>0)
		{
			avg=avg*10;
			a=(int)avg;
			avg=avg-a;
			System.out.print(a);
			c--;
		}
	}
	}
