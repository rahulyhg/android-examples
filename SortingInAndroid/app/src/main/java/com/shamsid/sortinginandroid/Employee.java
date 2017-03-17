package com.shamsid.sortinginandroid;

import android.support.annotation.NonNull;
import java.util.Comparator;

/**
 * Created by shamsheR on 17/03/17.
 */

public class Employee implements Comparable<Employee> {

  private int empId;
  private String empName;
  private int empAge;
  private int empSalary;

  public int getEmpId () {
    return empId;
  }

  public void setEmpId (int empId) {
    this.empId = empId;
  }

  public String getEmpName () {
    return empName;
  }

  public void setEmpName (String empName) {
    this.empName = empName;
  }

  public int getEmpAge () {
    return empAge;
  }

  public void setEmpAge (int empAge) {
    this.empAge = empAge;
  }

  public int getEmpSalary () {
    return empSalary;
  }

  public void setEmpSalary (int empSalary) {
    this.empSalary = empSalary;
  }

  @Override public int compareTo (@NonNull Employee o) {
    return this.empId - o.empId;
  }

  public static Comparator<Employee> age = new Comparator<Employee> () {
    @Override public int compare (Employee o1, Employee o2) {

      return o1.getEmpAge () - o2.getEmpAge ();
    }
  };

  public static Comparator<Employee> salary = new Comparator<Employee> () {
    @Override public int compare (Employee o1, Employee o2) {
      return o1.getEmpSalary () - o2.getEmpSalary ();
    }
  };


  public static Comparator<Employee> name = new Comparator<Employee> () {
    @Override public int compare (Employee o1, Employee o2) {
      return o1.getEmpName ().compareToIgnoreCase (o2.getEmpName ());
    }
  };

  public Employee (int empId, String empName, int empAge, int empSalary) {
    this.empId = empId;
    this.empName = empName;
    this.empAge = empAge;
    this.empSalary = empSalary;
  }
}
