//  You are given a list<employee>, where each employee has a list of skills represented as list<String>
// Write a Java 8 solution to return a unique, sorted list of all skills accross all employees.


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueSortedEmployeeSkillsList {

    public static void main (String[] args){
        System.out.println("List of employees distinct skills using flatMap::");
        List<Employee3> employee3List = Arrays.asList(
                new Employee3(1,"Ajay", Arrays.asList("Java","Spring","Docker")),
                new Employee3(2,"Amar", Arrays.asList("Java","Spring","Mongo")),
                new Employee3(3,"Srini", Arrays.asList("Python","Scala","Docker")),
                new Employee3(4,"Kumar", Arrays.asList("AWS","Docker","Typescript"))
        );

        List<String> allSkills = employee3List.stream()
                .flatMap(e -> e.getSkills().stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(allSkills);

    }


}
 // o/p: [AWS, Docker, Java, Mongo, Python, Scala, Spring, Typescript]