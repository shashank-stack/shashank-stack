package com.test;

import java.util.ArrayList;
import java.util.List;

public class Array2D {
	
	public static void main(String args[]){
		
		ArrayList<Integer> innerList = new ArrayList<Integer>();
		innerList.add(1);
		innerList.add(2);
		innerList.add(3);
		innerList.add(4);
 
		ArrayList<ArrayList<Integer>> outerList = new ArrayList<ArrayList<Integer>>();
		outerList.add(innerList);
		outerList.add(innerList);
		outerList.add(innerList);
		outerList.add(innerList);
		outerList.add(innerList);
		outerList.add(innerList);
		
		int outerlistSize = outerList.size();
		ArrayList<Integer> innerList1 = outerList.get(0);
		int [][] array = new int [outerlistSize] [innerList1.size()];
		for (int i = 0 ; i < outerList.size(); i++ ){
			ArrayList<Integer> innerList2 = outerList.get(i);
			 for (int j =0 ;j <innerList2.size();j++){
				 array [i][j]= innerList2.get(j);
			 }
		}
		
		for (int i=0; i< array.length ; i++){
			for (int j =0 ; j< array[i].length; j++){
				System.out.println(array[i][j] + " ");
			}
			
		}
	}

}
