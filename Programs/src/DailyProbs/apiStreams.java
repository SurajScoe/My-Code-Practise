package DailyProbs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class apiStreams {
	public static void main(String[] args) {
//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        // Find the list of elements which are multiples of 5 and greater than 5
//        List<Integer> multiplesOf5 = numbers.stream()
//                .filter(n -> n % 5 == 0 && n > 5)
//                .collect(Collectors.toList());
//
//        // Print the list of multiples of 5
//        System.out.println(multiplesOf5);
		
		
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8);
		
		List<Integer> newNum = num.stream().filter(n->n%5==0 && n>=5)
		.collect(Collectors.toList());
		
		newNum.forEach(System.out::println);
		
		
		
		
		
		
	}
}
