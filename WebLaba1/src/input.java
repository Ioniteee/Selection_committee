import java.util.Scanner;
public class input {
	public int sum=0;
	String name="",fac="",idfac="";
	
	public void Scan()
	{
		int ch=0;
		Scanner scn=new Scanner(System.in);
		
		do {
		System.out.println("Input 1 to select the first faculty\r\n" + 
				   "Input 2 to select the second faculty\r\n" + 
				   "Input 3 to select the third faculty\r\n" + 
				   "Input 4 to select the fourth faculty\r\n" + 
				   "Input 5 to select the fifth faculty");
ch=scn.nextInt();
		switch(ch)
		{
		case 1:{
			this.fac="First faculty";
            ch=999;
            this.idfac="1";
			break;
			}
		case 2:{
			ch=999;this.fac="Second faculty";
			this.idfac="2";
			break;
			}
		case 3:
		{ch=999;
		this.fac="Third faculty";
			this.idfac="3";
			break;
		}
		case 4:
		{ch=999;
		this.fac="Fourth faculty";
			this.idfac="4";
			break;
		}
		case 5:
		{
			fac="Fifth faculty";ch=999;
			idfac="5";
			break;
		}
		default:{System.out.println("Error");ch=0;break;}
		}
	}
		while(ch!=999);
		scn.nextLine();
		System.out.println("Input your full name:");	
		name=scn.nextLine();
		System.out.println("Input a score for the subjects\nFirst subject:");	
		sum+=scn.nextInt();
		System.out.println("Second subject:");
		sum+=scn.nextInt();
		System.out.println("Third subject:");
		sum+=scn.nextInt();
		System.out.println("Input the assessment score");
		sum+=scn.nextInt();
		
		
	}
	
	public void StudentOut()
	{
		System.out.println(fac+" - "+name+" : "+sum+" score");
	}
}
