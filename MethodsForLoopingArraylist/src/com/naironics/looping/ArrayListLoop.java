package com.naironics.looping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListLoop {
	
	public static void main(String[] args){
		
		List<String> myList = new ArrayList<String>();
		myList.add("Item 1");
		myList.add("Item 2");
		myList.add("Item 3");
		myList.add("Item 4");
		myList.add("Item 5");
		
		System.out.println("Method 1 : Simple For Loop");
		for (int i=0; i<myList.size(); i++){
			System.out.println(myList.get(i));
		}
		
		System.out.println("Methiod 2 : Advanced For Loop");
		for(String item:myList){
			System.out.println(item);
		}
		
		System.out.println("Method 3 : While loop");
		int j=0;
		while(myList.size() > j){
			System.out.println(myList.get(j));
			j++;
		}
		
		System.out.println("Method 4 : Iterator");
		Iterator<String> iterator = myList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
