package org.example;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	int id ;
	String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if (this.id > o.id) {
			return -1;
		} else if (this.id < o.id) {
			return 1;
		} else {
			return 0;
		}
	}

}

class CompImpl implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}
	
}


