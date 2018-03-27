import java.util.ArrayList;

public class Distribution extends input {
	ArrayList<input> First = new ArrayList<input>();
	ArrayList<input> Second = new ArrayList<input>();
	ArrayList<input> Third = new ArrayList<input>();
	ArrayList<input> Fourth = new ArrayList<input>();
	ArrayList<input> Fifth = new ArrayList<input>();
	public void dis()
	{		
		input r=new input();
		//System.out.println("3423432432542");
		r.Scan();
		//System.out.println("cdfgfgddgdgsGSDFGSGF");
		switch(r.idfac)
		{
		case "1":{
			//System.out.println("case 1");
			First.add(r);
			break;
			}
		case "2":{
			Second.add(r);
			//System.out.println("case 2");
			break;
			}
		case "3":
		{
			Third.add(r);
			//System.out.println("case 3");
			break;
		}
		case "4":
		{
			Fourth.add(r);
			//System.out.println("case 4");
			break;
		}
		case "5":
		{
			Fifth.add(r);
			//System.out.println("case 5");
			break;
		}
		default:{System.out.println("Error");break;}
	}
	}
	public void disOut()
	{	
			for(input g : First)
			{
				//System.out.println("case 1");
	            g.StudentOut();
			}
			for(input g : Second)
			{
				//System.out.println("case 1");
	            g.StudentOut();
			}
			for(input g : Third)
			{
				//System.out.println("case 1");
	            g.StudentOut();
			}
			for(input g : Fourth)
			{
				//System.out.println("case 1");
	            g.StudentOut();
			}
			for(input g : Fifth)
			{
				//System.out.println("case 1");
	            g.StudentOut();
			}
	}

}
