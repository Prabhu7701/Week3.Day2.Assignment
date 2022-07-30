package assignmentWeek3Day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindIntersectionUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ArrayA1 = {3,2,11,4,6,7};
		int [] ArrayA2 =  {1,2,8,4,7,9};
		int Lenght1 = ArrayA1.length;
		int Lenght2 = ArrayA2.length;
		Map <Integer,Integer> map= new LinkedHashMap<Integer,Integer>();
		//To Print Array A1
		System.out.print ("Array A1:" );
		for(int x=0;x<Lenght1;x++) 	{
			System.out.print (" " + ArrayA1[x]);
		}
		System.out.println("");

		//To Print Array A2
		System.out.print ("Array A2:" );
		for(int y=0;y<Lenght2;y++) {
			System.out.print (" " + ArrayA2[y]);
		}
		System.out.println("");

		//To Find and print Intersection Array
		

		for(int i=0;i<Lenght1;i++)
		{
			for(int j=0;j<Lenght2;j++) {
				if (ArrayA1[i] == ArrayA2[j])
				{
					map.put(i+1, ArrayA1[i]);
					//System.out.print (" " + ArrayA1[i]);
					System.out.println(map);
				}
			}
			
		}
		System.out.print("Intersection Array:");
		System.out.println(map);
	}
	

	}


