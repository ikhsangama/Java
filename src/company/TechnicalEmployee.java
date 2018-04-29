package company;

public abstract class TechnicalEmployee extends Employee {

    /*
    Has a default base salary of 75000
    */
    public TechnicalEmployee(String name){
        super(name, 75000);
    }

    public String EmloyeeStatus(){
        String result = super.toString() + super.employeeStatus();
        return result;
    }
}
