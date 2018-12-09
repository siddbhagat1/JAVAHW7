package hw7;
import java.util.*;
public class Student_Average_Test {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Student_Average teacher_a = new Student_Average();
		System.out.println("Enter the Details for 5 Students here: ");
		String name;
		double test1,test2,test3,test4;
		boolean f=true;
		for(int i=0;i<5;i++)
		{
			int j=i+1;
			System.out.println("Enter Student "+ j + " Name");
			name = in.next();
			teacher_a.set_Names(name,i+1);
			System.out.println("Enter Student "+j+" Test1 Score");
			test1 = in.nextDouble();
			f=teacher_a.set_Score(i+1,test1,1);
			if(!f)
				break;
			System.out.println("Enter Student "+j+" Test2 Score");
			test2 = in.nextDouble();
			f=teacher_a.set_Score(i+1,test2,2);
			if(!f)
				break;
			System.out.println("Enter Student "+j+" Test3 Score");
			test3 = in.nextDouble();
			f=teacher_a.set_Score(i+1,test3,3);
			if(!f)
				break;
			System.out.println("Enter Student "+j+" Test4 Score");
			test4 = in.nextDouble();
			f=teacher_a.set_Score(i+1,test4,4);
			if(!f)
				break;
		}
		if(f)
		{teacher_a.compute_Average();
		teacher_a.compute_Grade();
		System.out.printf("%s\n",teacher_a);}
		in.close();
	}
}




