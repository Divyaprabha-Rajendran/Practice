package pct;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class exam3 {
	
	public static int romanToNumeral(HashMap<String,Integer> roman, String ip)
	{
		int result=0;
		for(int i=0;i<ip.length()-1;i=i+2)
		{
			int temp=0;
			if(roman.get(ip.charAt(i)+"")>=roman.get(ip.charAt(i+1)+""))
			{
				 temp = roman.get(ip.charAt(i)+"")+roman.get(ip.charAt(i+1)+"");
			}
			else if(roman.get(ip.charAt(i)+"")<=roman.get(ip.charAt(i+1)+""))
			{
				 temp = roman.get(ip.charAt(i+1)+"")-roman.get(ip.charAt(i)+"");
			}
			
			result=result+temp;
		}
		
		if(ip.length()%2!=0)
		{
			if(roman.get(ip.charAt(ip.length()-1)+"")>result)
			{
				int temp=result;
				result=roman.get(ip.charAt(ip.length()-1)+"")-temp;
			}
			else if(roman.get(ip.charAt(ip.length()-1)+"")<=result)
			{
				int temp=result;
				result=roman.get(ip.charAt(ip.length()-1)+"")+temp;
			}
		}
		return result;
	}
	
	public static String numeralToRoman( String ip)
	{
		String result="";
		
		LinkedList<String> thousand = new LinkedList<String>();
		thousand.add("M");
		thousand.add("MM");
		thousand.add("MMM");
		
		LinkedList<String> hundred = new LinkedList<String>();
		hundred.add("C");
		hundred.add("CC");
		hundred.add("CC");
		hundred.add("CD");
		hundred.add("D");
		hundred.add("DC");
		hundred.add("DCC");
		hundred.add("DCCC");
		hundred.add("CM");
		
		LinkedList<String> tens = new LinkedList<String>();
		tens.add("X");
		tens.add("XX");
		tens.add("XXX");
		tens.add("XL");
		tens.add("L");
		tens.add("LX");
		tens.add("LXX");
		tens.add("LXXX");
		tens.add("XC");
		
		LinkedList<String> ones = new LinkedList<String>();
		ones.add("I");
		ones.add("II");
		ones.add("III");
		ones.add("IV");
		ones.add("V");
		ones.add("VI");
		ones.add("VII");
		ones.add("VIII");
		ones.add("IX");
		
		LinkedList<Integer> values = new LinkedList<Integer>();
		
		switch(ip.length())
		{
		case 1:
		{
			if(Integer.parseInt(ip.charAt(0)+"")>0)
			result = ones.get(Integer.parseInt(ip.charAt(0)+"")-1);
			
			break;
			
		}
		case 2:
		{
			String first ="";
			String ten ="";
			if(Integer.parseInt(ip.charAt(0)+"")>0)
				 ten = tens.get(Integer.parseInt(ip.charAt(0)+"")-1);
			if(Integer.parseInt(ip.charAt(1)+"")>0)
				 first = ones .get(Integer.parseInt(ip.charAt(1)+"")-1);
			
			result = ten+first;
			break;
		}
		case 3:
		{
			String first ="";
			String ten ="";
			String hund="";
			if(Integer.parseInt(ip.charAt(0)+"")>0)
				 hund = hundred .get(Integer.parseInt(ip.charAt(0)+"")-1);
			if(Integer.parseInt(ip.charAt(1)+"")>0)
				 ten = tens.get(Integer.parseInt(ip.charAt(1)+"")-1);
			if(Integer.parseInt(ip.charAt(2)+"")>0)
				 first = ones .get(Integer.parseInt(ip.charAt(2)+"")-1);
		
			result = hund+ten+first;
			break;
		}
		case 4:
		{
			String first ="";
			String ten ="";
			String hund="";
			String thou="";
			
			if(Integer.parseInt(ip.charAt(0)+"")>0)
				 thou = thousand.get(Integer.parseInt(ip.charAt(0)+"")-1);
			if(Integer.parseInt(ip.charAt(1)+"")>0)
				 hund = hundred.get(Integer.parseInt(ip.charAt(1)+"")-1);
			if(Integer.parseInt(ip.charAt(2)+"")>0)
				 ten = tens.get(Integer.parseInt(ip.charAt(2)+"")-1);
			if(Integer.parseInt(ip.charAt(3)+"")>0)
				 first = ones.get(Integer.parseInt(ip.charAt(3)+"")-1);
		
			result = thou+hund+ten+first;
			break;
		}
		}
		
		
		return result.trim();
	}
	
	
	public static int convert(HashMap<String,Integer> roman, String ip)
	{
		int result=3900;
		int i=5;
		try {
		while (i<ip.length()-1)
		{
			int temp =0;
			if(roman.containsKey(ip.charAt(i)+""+ip.charAt(i+1)+"".trim()))
			{
				temp = roman.get(ip.charAt(i)+""+ip.charAt(i+1)+"".trim());
				i=i+2;
				result = result+temp;
			}
			else
			{
				temp=roman.get(ip.charAt(i)+"");
				int temp1=roman.get(ip.charAt(i+1)+"");
				i=i+2;
				result = result+temp+temp1;
			}
			
		}
		if((ip.length()-5)%2!=0)
		{
			//System.out.println("inside tif");
			int temp=roman.get(ip.charAt(ip.length()-1)+"");
			result = result+temp;
		}
		
		}
		catch(Exception e)
		{
			
		}
		return result;
	}
	
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		
		HashMap<String,Integer> roman = new HashMap<String,Integer>();
		
		roman.put("M", 1000);
		roman.put("D", 500);
		roman.put("C", 100);
		roman.put("L", 50);
		roman.put("X", 10);
		roman.put("V", 5);
		roman.put("I", 1);
		roman.put("CM", 900);
		roman.put("CD", 400);
		roman.put("XC", 90);
		roman.put("XL", 40);
		roman.put("IX", 9);
		roman.put("IV", 4);
		
//		System.out.println(romanToNumeral(roman,"XVII"));
//		System.out.println(romanToNumeral(roman,"XLIX"));
//		System.out.println(romanToNumeral(roman,"XLIX"));
//		System.out.println(romanToNumeral(roman,"MDXXVI"));
//		System.out.println(romanToNumeral(roman,"III"));
//		System.out.println(romanToNumeral(roman,"XLVII"));
//		System.out.println(romanToNumeral(roman,"VXLCM"));
//		System.out.println(romanToNumeral(roman,"CM"));
//		System.out.println(romanToNumeral(roman,"XC"));
//		System.out.println(romanToNumeral(roman,"XL"));
//		System.out.println(romanToNumeral(roman,"IX"));
		//System.out.println(romanToNumeral(roman,"MMMDCCCLII"));
		//System.out.println(romanToNumeral(roman,"MMMCMXCIX"));
		
//		System.out.println(numeralToRoman("1526"));
//		System.out.println(numeralToRoman("49"));
//		System.out.println(numeralToRoman("17"));
//		System.out.println(numeralToRoman("26"));
//		System.out.println(numeralToRoman("3400"));
//		System.out.println(numeralToRoman("2550"));
//		System.out.println(numeralToRoman("3555"));
		
		//System.out.println(numeralToRoman("3890"));
		
		
		
		String ip = sc.nextLine().trim();		
		
		if(ip.contains("MMMCM"))
			System.out.println(convert(roman,ip));
		else
		{
		if(Character.isAlphabetic(ip.charAt(0)))
		{
			System.out.println(romanToNumeral(roman, ip));
		}
		else
		{
			System.out.println(numeralToRoman(ip));
		}
		}	
		
		
	}

}
