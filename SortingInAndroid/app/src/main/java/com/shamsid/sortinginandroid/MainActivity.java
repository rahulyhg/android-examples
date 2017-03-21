package com.shamsid.sortinginandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate (Bundle savedInstanceState) {
    super.onCreate (savedInstanceState);
    setContentView (R.layout.activity_main);

    List<Employee> employeeList =  new ArrayList<> ();

    Employee employee1 = new Employee (1,"Shamsher Ahmed",23,2300);
    Employee employee2 = new Employee (2,"Danish",21,2300);
    Employee employee3 = new Employee (3,"Sana",22,2400);
    Employee employee4 = new Employee (4,"Ross",25,2600);
    Employee employee5 = new Employee (5,"Rachel",26,2200);

    employeeList.add (employee1);
    employeeList.add (employee2);
    employeeList.add (employee3);
    employeeList.add (employee4);
    employeeList.add (employee5);

    Collections.sort (employeeList,Employee.name);
    for(Employee employee:
        employeeList){
      Log.v ("AGE",employee.getEmpName () + "-->" + employee.getEmpAge ());
    }

  }
}
