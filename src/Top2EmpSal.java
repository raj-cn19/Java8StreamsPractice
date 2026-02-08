// Given a list of employees, Each employee has a department and a salary
// Write a java 8 solution to group employees by department
// return the top 2 highest paid employees in each depart


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Top2EmpSal {
    public static void main(String [] args){
        System.out.println("Practice2 to find top 2 highest paid employee departments:: ");

        List<Employee1> employee1List = Arrays.asList(
              new Employee1(1,"Arjun","IT", 25000),
                new Employee1(1,"Ravi","IT", 85000),
                new Employee1(1,"Keerthana","IT", 55000),
                new Employee1(1,"Srikanth","IT", 75000),
                new Employee1(1,"Shiny","Finance", 25000),
                new Employee1(1,"Moksh","Finance", 15000),
                new Employee1(1,"Arya","Finance", 45000),
                new Employee1(1,"Abhi","HR", 15000),
                new Employee1(1,"Tinku","HR", 50000),
                new Employee1(1,"Chintu","HR", 35000)

        );

     Map<String,List<Employee1>> top2ByDept =  employee1List.stream().collect(Collectors.groupingBy(
                Employee1::getDepartment,
                Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.stream()
                                .sorted(Comparator.comparingDouble(Employee1::getSalary).reversed())
                                .limit(2)
                                .collect(Collectors.toList())
                )
        ));

     top2ByDept.forEach((dept, list) -> {
         System.out.println(dept+" -> "+list);
             }
     );
    }

}
