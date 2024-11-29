package week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SecondLargestList {
public static void main(String[] args) {
	int a[]={3, 2, 11, 4, 6, 7};
	List<Integer>List1=new ArrayList<Integer>();
	for (int i = 0; i < a.length; i++) {
		List1.add(a[i]);}//adding the int values to list
	Collections.sort(List1);//sorting list element
	int size = List1.size()-2;
	System.out.println(List1.get(size));
	//Arrays.sort(a);
//	for (int i = 0; i < a.length; i++) {
//		if (a[i]>a[i+1]) {
//			System.out.println(a[i]);
	}
		
}







//{2,3,4,6,7,11}
//a[i]>a[i+1] 2>3