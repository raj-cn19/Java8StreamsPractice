// You are given a list of employees having employee name and salary
// write a java 8 solution to sort employees based on the following rules:
// sort by salary in descending order
// salaries are the same, sort by name in ascending order (case-insensitive)
// Return the sorted list.


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class sortedEmpSalDescOrder {

    public static void main(String[] args) {
        System.out.println("Sort and print Employee Salary in Descending order:: ");
        List<Employee4> empSal = Arrays.asList(
                new Employee4("Anil", 50000),
                new Employee4("Bunny", 50000),
                new Employee4("Raj", 105000),
                new Employee4("Kumar", 55000),
                new Employee4("Pavan", 80000),
                new Employee4("Santosh", 80000),
                new Employee4("John", 750000)
        );
        empSal.stream()
                .sorted(Comparator.comparingDouble(Employee4::getSalary)
                .reversed()
                .thenComparing(e -> e.geteName().toLowerCase())
                ).collect(Collectors.toList());
        for (Employee4 e : empSal) {
            System.out.println(empSal);
        }

    }

}
