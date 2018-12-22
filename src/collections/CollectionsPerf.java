package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class CollectionsPerf {
	public static void main(String[] args) {
		Set<Integer> integerSet = new HashSet<>();
		List<Integer> integerList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();

		for(int i=0;i<1000000;i++) {
			Random r= new Random();
			int num = r.nextInt(9999);
			integerList.add(num);
			integerSet.add(num);
			linkedList.add(num);
		}

	//	System.out.println(integerSet);
	//	System.out.println(integerList);

		long s1 = System.nanoTime();
		System.out.println(integerSet.contains(100));
		System.out.println("Time Taken Set: " + (System.nanoTime() - s1));

		long s2 = System.nanoTime();
		System.out.println(integerList.contains(9000));
		System.out.println("Time Taken List: " + (System.nanoTime() - s2));

		long s3 = System.nanoTime();
		System.out.println(linkedList.contains(9000));
		System.out.println("Time Taken LinkedList: " + (System.nanoTime() - s3));
	}
}
