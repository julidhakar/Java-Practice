package src.main.immutable;

public class immutableTest {

    public static void main(String[] args){

        Address add = new Address("bang", "karnataka", "india", 1234);
        EmployeeImmutable employeeImmutable = new EmployeeImmutable(1,"abc" ,add);   //once value has been set it can not be change because of immutability functionality
        System.out.println(employeeImmutable);

/*
        //Note 1:
        // when getter is not returning copy of address we will be able to change the value of address fields which will
        //violate the rules of immutability

        employeeImmutable.getAdd().setCity("kerla");
        System.out.println(employeeImmutable);         //address field  will get change

*/

/*
        //Note 2:
        //if constructor won't return copy of address then any changes made in add will reflect in immutable object, like in below code
        //city will get change to gwalior which is violating the immutable rules.

        add.setCity("gwalior");
        System.out.println(employeeImmutable);    //value will get change

*/
        //Note 3:
        //since getter returning copy of address we will be able to changes value of address field though employeeImmutable address
        //will be same because we are changes value on address copy

     /*   Address addnew = employeeImmutable.getAdd();
        addnew.setCity("kerla");
        System.out.println(addnew);
        System.out.println(employeeImmutable);          //value will not get change

*/

        //Note 4:
        Address addnew = employeeImmutable.getAdd();
        addnew.setCity("kerla");
        System.out.println(addnew);
        System.out.println(employeeImmutable);          //value will not get change

    }
}
