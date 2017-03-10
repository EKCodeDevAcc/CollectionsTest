package coll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Collections {

	public static void main(String[] args) {		
		ArrayList<Integer> aList = new ArrayList<Integer>(10);
		
		aList.add(1);
		aList.add(3);
		aList.add(5);
		aList.add(7);
		aList.add(9);
		aList.add(2);
		aList.add(4);
		aList.add(6);
		aList.add(8);
		aList.add(10);
		
		ArrayList<Integer> bList = new ArrayList<Integer>(10);
		
		bList.add(15);
		bList.add(13);
		bList.add(11);
		bList.add(9);
		bList.add(7);
		bList.add(14);
		bList.add(12);
		bList.add(10);
		bList.add(8);
		bList.add(6);
		
		System.out.println("aList: " + aList);
		System.out.println("bList: " + bList);
		System.out.println("aList size: " + aList.size());
		System.out.println("bList size: " + bList.size() + "\n");

		List<Integer> cList = new ArrayList<Integer>(aList);

		cList.removeAll(bList);
		cList.addAll(bList);
		cList.sort(null);
		System.out.println("cList: " + cList);

		int cLength = cList.size();
		List<Integer> dList = new ArrayList<Integer>(cLength);
		for (int i=cLength-1; i>=0; i--){
			dList.add(cList.get(i));
		}
		System.out.println("dList: " + dList);
		System.out.println("dList size: " + dList.size() + "\n");
		
		//Used HashMap because it is easy to search value quickly with its key.
		Map<Integer, String> aMap = new HashMap<Integer, String>();
		aMap.put(0, "a");
		aMap.put(1, "b");
		aMap.put(2, "c");
		aMap.put(3, "d");
		aMap.put(4, "e");

		System.out.println(aMap.keySet());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your key: ");
		int n = scan.nextInt();
		
		if (aMap.containsKey(n)){
			System.out.println("aMap has key " + n + " already\n" + n + "/" + aMap.get(n));
		} else {
			System.out.println("Please enter your value: ");
			String s = scan.next();
			aMap.put(n, s);
		}
		
		System.out.println(aMap);
		System.out.println(aMap.size());
	}
}