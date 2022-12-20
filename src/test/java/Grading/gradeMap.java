package Grading;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class gradeMap {
	


	//Students st=new Students();
	static Map<String,Integer> originalmap=new HashMap<String,Integer>();
	static Map<String,Integer> retestmap=new HashMap<String,Integer>();
	 
	
	
	public static void setOriginalScore() throws InterruptedException {
		
			originalmap.put("Harshini",67);
			originalmap.put("Shiva",97);
			originalmap.put("Naveen",47);

			originalmap.put("Vinothini",67);
			originalmap.put("Raju",67);
		
		
	}
	public static void setmakeupScore() {
		retestmap.put("Harshini",97);
		retestmap.put("Shiva",57);
		retestmap.put("Naveen",87);

		retestmap.put("Vinothini",27);
		retestmap.put("Raju",37);
	
		
		
	}
	public static Map<String, Integer> getOrignalScore()
	{
		return originalmap;
	}
	
	public static Map<String, Integer> getRetestScore()
	{
		return retestmap;
	}
	

}
