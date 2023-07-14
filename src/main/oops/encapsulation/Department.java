package src.main.oops.encapsulation;

public class Department {
    public void employeeInfo(){
        Employee emp = new Employee();
        emp.setEmpid(1);
        System.out.println("employee id is: " + emp.getEmpid());
    }
}
