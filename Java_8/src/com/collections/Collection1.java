package com.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pratheeg
 *
 */
public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
//	    numbers.add(5);
//	    numbers.add(9);
//	    numbers.add(8);
//	    numbers.add(1);
	    //print all number
	    numbers.forEach(n->System.out.println(n));
	    //print smallest number
	    int a=numbers.stream().mapToInt(v->v).min().orElseThrow(NoSuchFieldError::new);
	    int b=numbers.stream()
					      .mapToInt(v -> v)
					      .max().orElseThrow(NoSuchFieldError::new);
	    System.out.println("Max :"+ a);
	    System.out.println("MIN :"+ b);
	}

}
