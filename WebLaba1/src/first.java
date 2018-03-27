import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.*;
public class first {
	public static void main (String args[]) throws IOException
	{
		Scanner scn=new Scanner(System.in);
		HashMap<String, ArrayList<input>> hashMap = new HashMap<String, ArrayList<input>>();
		Distribution list = new Distribution();
		String path="Students.txt";
		int ch=0;
		if(new File(path).exists())
		{
			FromFile(list,path,hashMap);
		}
		int choose=0;
		do {
			choose =0;
			System.out.println("Input 1 to add student\nInput 2 to out all students\nInput 3 to rewrite info of the student\nInput 4 to delete student\nInput 5 to exit");
			choose=scn.nextInt();	
		switch(choose)
		{
		case 1:{
			do
			{
			list.dis();
			putInHashMap(hashMap,list);
			System.out.println("Input 1 to add one more student\nInput 2 for back to menu");
			ch=scn.nextInt();
			Filewrite(hashMap,path);
			}while(ch!=2);
			
			break;
		}
		case 2:{
			choose=0;
			//SortHash(hashMap,list);
			OutStudents(hashMap);
			
			break;
			}
		case 3:{
			choose=0;
			scn.nextLine();
		System.out.println("Input surname of this student");
		String surname=scn.nextLine();
		for (ArrayList<input> value : hashMap.values()) {
			input g = new input();
			for(int i = 0; i < value.size(); ++i)
				{
				   g = value.get(i);
				   if(surname.equals(g.name))
					{
						input t=new input();
						choose=999;
						g.StudentOut();
						value.remove(i);
						t.Scan();
						value.add(t);
						putInHashMap(hashMap,list);
						break;
					}
				}
		}
		if(choose!=999)
		{
			System.out.println("There is no one student in the system with this name");
			choose =0;
		}
		Filewrite(hashMap,path);
		break;
		}
		case 4:{
		choose=0;scn.nextLine();
		System.out.println("Input surname of this student");
		String surname=scn.nextLine();
		for (ArrayList<input> value : hashMap.values()) {
			input g = new input();
			for(int i = 0; i < value.size(); ++i)
				{
				   g = value.get(i);
				   if(surname.equals(g.name))
					{
						choose=999;
						g.StudentOut();
						System.out.println("You sure?(1-yes|2-no)");
						choose=scn.nextInt();
						if(choose==1)
						{
							choose=999;
							value.remove(i);
							putInHashMap(hashMap,list);
						}
						break;
					}
				}
		}
			if(choose!=999)
			{
				System.out.println("There is no one student in the system with this name");
				choose =0;
			}
			Filewrite(hashMap,path);
		break;
		}
		case 5:{choose=2;Filewrite(hashMap,path);break;}
		default:{System.out.println("Error");choose=0;continue;}
		}
		}
		while (choose!=2);
		
	}
	private static void OutStudents(HashMap<String,ArrayList<input>> hashMap)
	{
		//int i=0;
		
		for (ArrayList<input> value : hashMap.values()) {			
			//try{g = value.get(i);}
			//catch(Exception e)
			//{
				
			//}
			input g = new input();
			//System.out.println(g.fac);
			for(int i = 0; i < value.size(); i++)
				{				
				//if(i<20)
				//{
				   g = value.get(i);
				   
				   System.out.println(i+" "+g.name+"|"+g.sum+"|"+g.idfac);
				//}
				}
		}
	}
	private static void SortHash(HashMap<String,ArrayList<input>> hashMap,Distribution list)
	{

		// Now sort by address instead of name (default).
		Collections.sort(list.First, new Comparator<input>() {
		    public int compare(input one, input other) {
		    	if(one.sum>other.sum)
		    	{
		    		return 1;
		    	}
		    	else
		    	{
		    		return -1;
		    	}
		    }
		}); 
		Collections.sort(list.Second, new Comparator<input>() {
		    public int compare(input one, input other) {
		    	if(one.sum>other.sum)
		    	{
		    		return 1;
		    	}
		    	else
		    	{
		    		return -1;
		    	}
		    }
		}); 
		Collections.sort(list.Third, new Comparator<input>() {
		    public int compare(input one, input other) {
		    	if(one.sum>other.sum)
		    	{
		    		return 1;
		    	}
		    	else
		    	{
		    		return -1;
		    	}
		    }
		}); 
		Collections.sort(list.Fourth, new Comparator<input>() {
		    public int compare(input one, input other) {
		    	if(one.sum>other.sum)
		    	{
		    		return 1;
		    	}
		    	else
		    	{
		    		return -1;
		    	}
		    }
		}); 
		Collections.sort(list.Fifth, new Comparator<input>() {
		    public int compare(input one, input other) {
		    	if(one.sum>other.sum)
		    	{
		    		return 1;
		    	}
		    	else
		    	{
		    		return -1;
		    	}
		    }
		}); 
		Collections.reverse(list.First);
		Collections.reverse(list.Second);
		Collections.reverse(list.Third);
		Collections.reverse(list.Fourth);
		Collections.reverse(list.Fifth);
		putInHashMap(hashMap,list);
	}
	
	private static void FromFile(Distribution list,String path,HashMap<String,ArrayList<input>> hashMap) throws IOException
	{
		String str="";
		input r=new input();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	        {
	            while((str = reader.readLine()) != null)
	            {
	            	String [] s=divide(str);
	            	System.out.println("!!!!"+str);
	            	r.name=s[0];
	            	r.fac=s[1];
	            	r.sum=Integer.parseInt(s[2]);
	            	r.idfac=s[3];
	            	switch(r.idfac)
	        		{
	        		case "1":{
	        			System.out.println("case 1"+r.name+" "+r.idfac);
	        			list.First.add(r);
	        			break;
	        			}
	        		case "2":{
	        			list.Second.add(r);
	        			System.out.println("case 5"+r.name+" "+r.idfac);
	        			break;
	        			}
	        		case "3":
	        		{
	        			list.Third.add(r);
	        			System.out.println("case 5"+r.name+" "+r.idfac);
	        			break;
	        		}
	        		case "4":
	        		{
	        			list.Fourth.add(r);
	        			//System.out.println("case 4");
	        			break;
	        		}
	        		case "5":
	        		{
	        			list.Fifth.add(r);
	        			System.out.println("case 5"+r.name+" "+r.idfac);
	        			break;
	        		}
	        		default:{System.out.println("Error");break;}
	        	}
	            	putInHashMap(hashMap,list);
	            }
	           
	        }
	        reader.close();
	        
	}

	private static String[] divide(String s) {
    ArrayList<String> tmp = new ArrayList<String>();
    int i = 0;

    for (int j = 0; j < s.length(); j++) {
        if (s.charAt(j) == '|') {
            if (j > i) {
                tmp.add(s.substring(i, j));
            }
            i = j + 1;
        }
    }
    if (i < s.length()) {
        tmp.add(s.substring(i));
    }
    return tmp.toArray(new String[tmp.size()]);
}
	private static void Filewrite(HashMap<String,ArrayList<input>> hashMap, String path) throws FileNotFoundException
	{
		PrintWriter writer = new PrintWriter(path);
		for (ArrayList<input> value : hashMap.values()) {
	    input g = new input();
		
		for(int i = 0; i < value.size(); ++i)
			{
			   g = value.get(i);
			   writer.println(g.name+"|"+g.fac+"|"+g.sum+"|"+g.idfac+"|");
			}
		
		
	}
		writer.flush();
		writer.close();
	}

	
	private static void putInHashMap(HashMap<String,ArrayList<input>> hash,Distribution list)
{
		hash.put("1",list.First);
		hash.put("2",list.Second);
		hash.put("3",list.Third);
		hash.put("4",list.Fourth);
		hash.put("5",list.Fifth);
    
}
}