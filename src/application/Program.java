package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import entities.Employee;


public class Program {

	public static void main(String[] args) {

    List<Employee> list = new ArrayList<>();
    String path = "c:\\temp\\in.txt";
    
    try(BufferedReader br = new BufferedReader(new FileReader(path))){
    	
    	
    	String employeeCvs = br.readLine();
		while (employeeCvs != null) {
    		String[]fields = employeeCvs.split(" , ");
    		list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
    		employeeCvs = br.readLine();
    	}
    	Collection.sort(list);
    	for(Employee emp:list) {
    		System.out.println(emp.getName() + " , " + emp.getSalary());
    	}
    }catch(IOException e ) {
    	System.out.println("Erro: " + e.getMessage());
    	
	
       }
	
	}

}
