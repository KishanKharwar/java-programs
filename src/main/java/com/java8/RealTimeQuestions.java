package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class RealTimeQuestions {

  private static List<Employee> employeeList = new ArrayList<Employee>();

  public static void main(String[] args) {
    //creating employees
    createEmployee();
    //Query 3.1 : How many male and female employees are there in the organization?
    //findMaleAndFemaleEmps();
    //Query 3.2 : Print the name of all departments in the organization?
    //printNameOfDepartments();
    //Query 3.3 : What is the average age of male and female employees?
    //avgAgeofMaleAndFemaleEmps();
    //Query 3.4 : Get the details of highest paid employee in the organization?
    //highestPaidEmp();
    //Query 3.5 : Get the names of all employees who have joined after 2015?
    //empsJoinedAfter2015();
    //Query 3.6 : Count the number of employees in each department?
    //countNoOfEmpsInEachDept();
    //Query 3.7 : What is the average salary of each department?
    //avrSalOfEachDept();
    //Query 3.8 : Get the details of youngest male employee in the product development department?
    //getYoungestMaleInProductDept();
    //Query 3.9 : Who has the most working experience in the organization?
    //mostWorkingExp();
    //Query 3.10 : How many male and female employees are there in the sales and marketing team?
    //maleAndFemaleEmpsInSalesTeam();
    //Query 3.11 : What is the average salary of male and female employees?
    //avgSalOfMaleFemaleEmp();
    //Query 3.12 : List down the names of all employees in each department?
    //nameOfEmpsInEachDept();
    //Query 3.13 : What is the average salary and total salary of the whole organization?
    //avgAndTotalSal();
    //Query 3.14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
    //separateByAge25();
    //Query 3.15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
    //findOldestEmp();

  }

  private static void findOldestEmp() {
    Optional<Employee> oldestEmployeeWrapper = employeeList.stream()
        .max(Comparator.comparingInt(Employee::getAge));
    Employee oldestEmployee = oldestEmployeeWrapper.get();
    System.out.println("Name : " + oldestEmployee.getName());
    System.out.println("Age : " + oldestEmployee.getAge());
    System.out.println("Department : " + oldestEmployee.getDepartment());

  }

  private static void separateByAge25() {
    Map<Boolean, List<Employee>> partition = employeeList.stream()
        .collect(Collectors.partitioningBy(e -> e.getAge() > 25));
    Set<Map.Entry<Boolean, List<Employee>>> set = partition.entrySet();
    for (Map.Entry<Boolean, List<Employee>> entry : set) {
      System.out.println("----------------------------");
      if (entry.getKey()) {
        System.out.println("Employees older than 25 years :");
      } else {
        System.out.println("Employees younger than or equal to 25 years :");
      }
      System.out.println("----------------------------");
      List<Employee> list = entry.getValue();
      for (Employee e : list) {
        System.out.println(e.getName());
      }
    }
  }

  private static void avgAndTotalSal() {
    //Double dAvg = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
    DoubleSummaryStatistics d = employeeList.stream()
        .collect(Collectors.summarizingDouble(Employee::getSalary));
    System.out.println("Average : " + d.getAverage());
    System.out.println("Total : " + d.getSum());
  }

  private static void nameOfEmpsInEachDept() {
    Map<String, List<Employee>> names = employeeList.stream()
        .collect(Collectors.groupingBy(Employee::getDepartment));
    Set<Map.Entry<String, List<Employee>>> set = names.entrySet();
    for (Map.Entry<String, List<Employee>> entry : set) {
      System.out.println(entry.getKey());
      //List<Employee> list = entry.getValue();
      for (Employee e : entry.getValue()) {
        System.out.println(e.getName());
      }
    }
  }

  private static void avgSalOfMaleFemaleEmp() {
    Map<String, Double> map = employeeList.stream().collect(Collectors
        .groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
    System.out.println(map);
  }

  private static void maleAndFemaleEmpsInSalesTeam() {
    Map<String, Long> map = employeeList.stream()
        .filter(e -> e.getDepartment() == "Sales And Marketing")
        .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
    System.out.println(map);
  }

  private static void mostWorkingExp() {
    Employee e = employeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining))
        .findFirst().get();
    System.out.println(e);
  }

  private static void getYoungestMaleInProductDept() {
    Optional<Employee> emp = employeeList.stream()
        .filter(e -> e.getDepartment() == "Product Development" && e.getGender() == "Male")
        .min(Comparator.comparingInt(Employee::getAge));
    System.out.println(emp);
  }

  private static void avrSalOfEachDept() {
    Map<String, Double> map = employeeList.stream().collect(Collectors
        .groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
    System.out.println(map);
  }

  private static void countNoOfEmpsInEachDept() {
    Map<String, Long> map = employeeList.stream()
        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
//        for(Map.Entry entry:map.entrySet()){
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }

    System.out.println(map);
  }

  private static void empsJoinedAfter2015() {
    employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName)
        .forEach(System.out::println);
  }

  private static void highestPaidEmp() {
    Optional<Employee> emp = employeeList.stream()
        .max(Comparator.comparingDouble(Employee::getSalary));
    System.out.println(emp);
  }

  private static void avgAgeofMaleAndFemaleEmps() {
    Map<String, Double> avgAge = employeeList.stream().collect(
        Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
    System.out.println(avgAge);
  }

  private static void printNameOfDepartments() {
    employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
  }

  private static void findMaleAndFemaleEmps() {
    Map<String, Long> empMap = employeeList.stream()
        .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
    System.out.println(empMap);
  }


  public static void createEmployee() {
    employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
    employeeList
        .add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
    employeeList
        .add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
    employeeList
        .add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
    employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
    employeeList.add(
        new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
    employeeList
        .add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
    employeeList
        .add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
    employeeList
        .add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
    employeeList
        .add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
    employeeList
        .add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
    employeeList
        .add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
    employeeList
        .add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
    employeeList
        .add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
    employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
    employeeList
        .add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
    employeeList
        .add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
  }
}
