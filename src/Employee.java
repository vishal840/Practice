import java.io.*;
public class Employee {
 int age;
 String name;
 String designation;
 double salary;
 
 public Employee(String name)
 {
	 this.name=name;
 }
 public void empSalaryn(double empSalary)
 {
	 salary = empSalary;
	 
 }
 public void empAgen(int empAge)
 {
	 age = empAge;
 }
 public void empDesignationn(String empDesignation)
 {
	 designation = empDesignation;
 }
 
 public void printEmp (){
	 System.out.println("Name: "+name);
	 System.out.println("salary: "+salary);
	 System.out.println("designation:" +designation);
	 System.out.println("age: "+age);
	 
 }
 }
 
