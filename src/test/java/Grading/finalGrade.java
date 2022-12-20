package Grading;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class finalGrade extends gradeMap
{
	static Map<String,Integer> hmap=new HashMap<String,Integer>();
	 static Map<String,Integer> rmap=new HashMap<String,Integer>();
	
	static Map<String,Integer> finalmap=new HashMap<String,Integer>();
	
	public static void main(String[] args) throws InterruptedException
	{
		
		setOriginalScore();
		
		setmakeupScore();
		
	hmap=gradeMap.getOrignalScore();
	
	rmap=gradeMap.getRetestScore();
	System.out.println("ORIGINAL SCORE::");	
	System.out.println(hmap);
	System.out.println("MAKEUP SCORE::");
	System.out.println(rmap);
	for(String s:hmap.keySet())
	{
		if(hmap.get(s)>=rmap.get(s))
		{
			finalmap.put(s, hmap.get(s));
		}
		else
			finalmap.put(s, rmap.get(s));
	}
	System.out.println("Final Grades are:");
	System.out.println(finalmap);
	
	}
}
