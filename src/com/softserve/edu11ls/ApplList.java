package com.softserve.edu11ls;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ApplList {
	public static void main(String[] args) {
		/*-
		String[] arrStr = { "222", "1", "1111", "10" };
		//System.out.println("arrStr = " + arrStr);
		System.out.println("arrStr = " + Arrays.toString(arrStr));
		//
		List<String> lstStr = Arrays.asList(arrStr);
		System.out.println("lstStr = " + lstStr); // .toString()
		arrStr[1] = "001";
		// lstStr.clear();// Error
		System.out.println("Changed lstStr = " + lstStr);
		//Arrays.sort(arrStr);
		Collections.sort(lstStr);
		//lstStr.sort((a,b)->a.compareTo(b));
		System.out.println("Sorted lstStr = " + lstStr);
		*/
		/*-
		//String[] arrStr = { "222", "1", "1111", "10" };
		//List<String> lstStr = new ArrayList<>(Arrays.asList(arrStr));
		List<String> lstStr = new ArrayList<>();
		lstStr.add("222");
		lstStr.add("001");
		lstStr.add("1111");
		lstStr.add("010");
		System.out.println("Original: lstStr = " + lstStr);
		Collections.sort(lstStr);
		System.out.println("Sorted: lstStr = " + lstStr);
		lstStr.clear();
		System.out.println("stStr.clear() = " + lstStr);
		*/
		/*-
		List<Student> lstStr = new ArrayList<>();
		lstStr.add(new Student(232, "Petro"));
		lstStr.add(new Student(143, "Stepan"));
		lstStr.add(new Student(234, "Petro"));
		lstStr.add(new Student(567, "Ira"));
		lstStr.add(new Student(123, "Ivan"));
		lstStr.add(new Student(233, "Petro"));
		System.out.println("Original: lstStr = " + lstStr);
		//Collections.sort(lstStr);
		lstStr.sort(new Student.ByNameComparator());
		//Collections.sort(lstStr, new Student.ByNameComparator());
		//Collections.sort(lstStr, new Student.ByNameAndId());
		System.out.println("\nSorted: lstStr = " + lstStr);
		//
		Student st1 = new Student(145, "Stepan");
		lstStr.add(1, st1);
		System.out.println("\nUpdated: lstStr = " + lstStr);
		System.out.println("Element from 1 position: " + lstStr.get(1));
		*/
	    /*-
	    String[] arrStr = { "222", "001", "1111", "010" };
        List<String> lstStr1 = new ArrayList<>(Arrays.asList(arrStr));
        List<String> lstStr2 = new ArrayList<>();
        lstStr2.add("222");
        lstStr2.add("001");
        //lstStr2.add("010");
        lstStr2.add("1111");
        lstStr2.add("010");
        System.out.println("lstStr1.equals(lstStr2) = " + lstStr1.equals(lstStr2));
		*/
	    /*-
	    List<Student> lstStr1 = new ArrayList<>();
        lstStr1.add(new Student(232, "Petro"));
        List<Student> lstStr2 = new ArrayList<>();
        lstStr2.add(new Student(232, "Petro"));
        System.out.println("lstStr1.equals(lstStr2) = " + lstStr1.equals(lstStr2));
	    */
	    //
		// Iterator
		/*-
		List<String> list = new ArrayList<>();
		list.add("First element");
		list.add("Second element");
		list.add(0, "One more first element");
		list.add("Second element");
//		//
//		String element2 = list.get(1);
//		System.out.println("element2 = " + element2);
		//
		// Print Elements
//		System.out.println("elements: " + list);
		//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println("list.get(" + i + ")= " + list.get(i));
//		}
		//
//		for (String current : list) { // implicit inner iterator
//			System.out.println("current = " + current);
//		}
		//
		Iterator<String> iterator = list.iterator(); // get iterator
		while (iterator.hasNext()) {
			String current = iterator.next();
			System.out.println("current: " + current);
		}
		*/
		/*-
		List<String> list = new ArrayList<>();
		list.add("First element");
		list.add("Second element");
		list.add(0, "One more first element");
		list.add("Second element");
		//
		// Print
		System.out.println("elements: " + list);
		//
		//int n = list.size();
		for (int i = 0; i < list.size(); i++) {
		//for (int i = 0; i < n; i++) {
            System.out.println("Current Element = " + list.get(i));
            if (list.get(i).contains("Second")) {
                list.remove(i);
                // i--; // Invalid Solution
            }
        }
		//
//        for (String current : list) {
//            System.out.println(current);
//            if (current.contains("Second")) {
//                list.remove(current);
//            }
//        }
		System.out.println("after delete, elements: " + list);
        */
		// /*-
		List<String> list = new ArrayList<>();
		list.add("First element");
		list.add("Second element");
		list.add(0, "One more first element");
		list.add("Second element");
		//
		// Print
		System.out.println("elements: " + list);
		//
//		boolean isFound = false;
//		do {
//			isFound = false;
//			int i = 0;
//			for (i = 0; i < list.size(); i++) {
//				if (list.get(i).contains("Second")) {
//					isFound = true;
//					break;
//	            }
//			}
//			if (isFound) {
//				list.remove(i);
//			}
//		} while(isFound);
		//
		//
		Iterator<String> iterator = list.iterator();
		//ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext()) {
		    String current = iterator.next();
		    System.out.println("element = " + current);
		    if (current.contains("Second")) {
		        iterator.remove();
		    }
		}
		System.out.println("after delete, elements: " + list);
		// */
		/*- 
		System.out.println("\nFinal List:");
		for (String current : list) {
		    System.out.println(current);
		}
		*/
	}
}
