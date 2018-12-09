package hw7;

public class Student_Average 
{
	String[] names = new String[5];
	String[] grade = new String[5];
	double[] stud_1 = new double[4];
	double[] stud_2 = new double[4];
	double[] stud_3 = new double[4];
	double[] stud_4 = new double[4];
	double[] stud_5 = new double[4];
	double[] avg = new double[5];
	
	public Student_Average()
	{
		for(int i=0;i<5;i++)
		{
			names[i]="";
			grade[i]="";
		}
		for(int i=0;i<4;i++)
		{
			stud_1[i]=0;
			stud_2[i]=0;
			stud_3[i]=0;
			stud_4[i]=0;
			stud_5[i]=0;
		}
		
	}
	
	public void get_Names()
	{
		int i=1;
		for(String name:names)
		{
			System.out.println("Student "+i+":"+name);
			i++;
		}
	}
	public String get_Score(int stud_no)
	{
		String s="";
		switch(stud_no)
		{
		case 1:
		{
			for(int i=0;i<4;i++)
			{
				int j=i+1;
				s+="Test"+j+" Score="+stud_1[i]+" ";
			}
			break;
		}
		case 2:
		{
			for(int i=0;i<4;i++)
			{
				int j=i+1;
				s+="Test"+j+" Score="+stud_2[i]+" ";
			}
			break;
		}
		case 3:
		{
			for(int i=0;i<4;i++)
			{
				int j=i+1;
				s+="Test"+j+" Score="+stud_3[i]+" ";
			}
			break;
		}
		case 4:
		{
			for(int i=0;i<4;i++)
			{
				int j=i+1;
				s+="Test"+j+" Score="+stud_4[i]+" ";
			}
			break;
		}
		case 5:
		{
			for(int i=0;i<4;i++)
			{
				int j=i+1;
				s+="Test"+j+" Score="+stud_5[i]+" ";
			}
			break;
		}
		default:
		{
			System.out.println("Invalid Student Number");
		}
		}
		return s;
	}
	
	public String get_Specific_Name(int i)
	{
		return names[i-1];
	}
	
	public void compute_Average()
	{
		double total=0;
		int j=0;
		for(int i=0;i<4;i++)
		{
			total+=stud_1[i];
		}
		avg[j]=(total/4);
		j++;
		total=0;
		for(int i=0;i<4;i++)
		{
			total+=stud_2[i];
		}
		avg[j]=(total/4);
		j++;
		total=0;
		for(int i=0;i<4;i++)
		{
			total+=stud_3[i];
		}
		avg[j]=(total/4);
		j++;
		total=0;
		for(int i=0;i<4;i++)
		{
			total+=stud_4[i];
		}
		avg[j]=(total/4);
		j++;
		total=0;
		for(int i=0;i<4;i++)
		{
			total+=stud_5[i];
		}
		avg[j]=(total/4);
	}
	
	public double get_Specific_Average(int i)
	{
		return avg[i-1];
	}
	
	public void compute_Grade()
	{
		for(int i=0;i<5;i++)
		{
			double x = avg[i];
			if(x>=90 && x<=100)
			{
				grade[i] = "A";
			}
			else if(x>=80 && x<90)
			{
				grade[i] = "B";
			}
			else if(x>=70 && x<80)
			{
				grade[i] = "C";
			}
			else if(x>=60 && x<70)
			{
				grade[i] = "D";
			}
			else
			{
				grade[i] = "F";
			}
		}
	}
	
	public String get_Specific_Grade(int i)
	{
		return grade[i-1];
	}
	
	public void set_Names(String s, int i)
	{
		names[i-1] = s;
	}
	
	public boolean set_Score(int i, double score,int test_no) 
	{
		boolean f=true;
		if(score<0 )
		{
			System.out.println("Error cant accept Negative Scores");
			f=false;
		}
		else if(score>100)
		{
			System.out.println("Score cant exceed value of 100");
			f=false;
		}
		if(f)
		{
			if(i==1)
			{
				stud_1[test_no-1] = score;
			}
			else if(i==2)
			{
				stud_2[test_no-1] = score;
			}
			else if(i==3)
			{
				stud_3[test_no-1] = score;
			}
			else if(i==4)
			{
				stud_4[test_no-1] = score;
			}
			else if(i==5)
			{
				stud_5[test_no-1] = score;
			}
		}
		return f;
	}
	public String toString()
	{
		String s="";
		for(int i=1;i<=5;i++)
		{
			s+= "Name= "+get_Specific_Name(i)+" ";
			s+= get_Score(i);
			s+= "Average is="+get_Specific_Average(i)+" ";
			s+= "Grade is="+get_Specific_Grade(i)+"\n";
		}
		return s;
	}
}
	

