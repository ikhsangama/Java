package company;

import prak2_Enkapsulasi.Titik;

public abstract class Employee {
    private Titik t = null;
    private int ID;
    private String name;
    private String status;
    private double baseSalary;

    private Employee employee;

    /*
    Should construct a new employee object and take in two parameters,
    one for the name of the user and one for their base salary
    */
    public Employee(String name, double baseSalary){
        ID = ID+1;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    /*
    Should return the employee's current salary
    */
    public double getBaseSalary() {
        return baseSalary;
    }

    /*
    Should return the employee's current name
    */
    public String getName() {
        return name;
    }

    /*
    Should return the employee's ID. The ID should be issued on behalf of
    the employee at the time they are constructed. The first ever employee
    should have an ID of "1", the second "2" and so on
    */
    public int getEmployeeID(){
        return ID;
    }

    /*
    Should return a reference to the Employee object
    that represents this employee's manager
    */
    public Employee getManager(){
        return employee;
    }

    /*
    Should return true if the two employee IDs are the same,
    false otherwise
    */
    public boolean ekuals(Employee other){
        boolean result = this.employee.ID == other.ID? true : false;
        return result;
    }

    /*
    Should return a String representation of the employee that is a
    combination of their id followed by their name. Example: "1 Kasey"
    */
    @Override
    public String toString() {
        return getEmployeeID() +" "+ getName();
    }

    /*
    Should return a String representation of that Employee's current status. This will be different for every subclass of Employee
    */
    public String employeeStatus(){
        return status;
    }
}
