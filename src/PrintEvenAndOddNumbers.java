// You are given a list of integers.
// Write a program to partition the numbers into even and odd values


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintEvenAndOddNumbers {

    public static void main(String[] args){
        System.out.println("To partition and print Even and Odd numbers:: ");
        List<Integer> numbers = Arrays.asList(10,3,2,15,25,12,8,9,5,21);
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n%2 == 0)); // partitioningBy will store in 2 buckets true and false

        partitioned.forEach((key, value) -> {
            if(key){ // when value is true
                System.out.println("Even Numbers  -->"+ value);
            }else {
                // when value is false
                System.out.println("Odd Numbers -->"+ value);
            }
        });

    }


}
