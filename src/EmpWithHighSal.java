// Given a List<Employee> where each employee has an id and a salary.
// Convert this list into a map<Integer, Employee> using the employee id as the key
// If multiple employees have the same id, keep only the employee with higher Salary in the map.


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpWithHighSal {

    public static void main(String [] args) {
        System.out.println("Practice3 to find top highest paid employee of depart and remove Duplicates:: ");

        List<Employee1> employee1List = Arrays.asList(
                new Employee1(1, "Arjun", "IT", 55000),
                new Employee1(2, "Ravi", "IT", 85000),
                new Employee1(1, "Keerthana", "IT", 55000),
                new Employee1(2, "Srikanth", "IT", 75000),
                new Employee1(2, "Shiny", "Finance", 55000),
                new Employee1(1, "Moksh", "Finance", 25000),
                new Employee1(3, "Arya", "HR", 45000),
                new Employee1(3, "Abhi", "HR", 45000)
        );
      Map<Integer, Employee1> empMap = employee1List.stream().
                collect(Collectors.toMap(
                        Employee1::getId, // key mapper
                        e -> e,
                        (e1,e2) -> //value mapper
                                e1.getSalary() >= e2.getSalary() ?e1 : e2
                ));

      empMap.forEach((id,emp) -> System.out.println(id + "-> "+emp));
    }
}
