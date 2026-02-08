// Given a list of employees, group them by department and return a Map<String, Long>
// where the key is the department name and value is the number of employees in the department


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice1 {

    public static void main(String[] args){
        System.out.println("Practice1 program execution");

        List<Employee> employees = Arrays.asList(
                new Employee(1,"Francis","IT"),
                new Employee(2,"John","IT"),
                new Employee(3,"Mike","HR"),
                new Employee(4,"Raju","HR"),
                new Employee(5,"Kiran","Finance"),
                new Employee(6,"Srini","Finance"),
                new Employee(7,"Raj","Admin")
        );

      Map<String, Long> deptCount = employees.stream()
              .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

      deptCount.forEach((dept, count) -> System.out.println(dept+"->"+count));
    }
}
