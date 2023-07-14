package src.main.immutable;

public class EmployeeImmutable {

    private  final int empId;
    private final String empName;

    private final Address add;

    public EmployeeImmutable(int empId, String empName, Address add){
        this.empId = empId;
        this.empName = empName;
        // Note 1:
       //  this.add = add;

        //Note 2:
      //  this.add = add;

        // Note 3:
        //  this.add = new Address(add.getCity(),add.getState(),add.getCountry(),add.getZip());   //defensive copy of address

      /*
      now in the above approaches  if we will add new field in Address class then we will have to modify immutable class also to set the
      additional field in address object. which is not a good practice. so we will create a copy constructor in address class and call it here

       */

        //Note 4:
        this.add = new Address(add);


    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Address getAdd() {
      //  Note 1:
      //  return  add;

      // note 2 :
        // return new Address(add.getCity(), add.getState(),add.getCountry(), add.getZip()); //returning a copy of address

        // note 3 :
      //  return new Address(add.getCity(), add.getState(),add.getCountry(), add.getZip()); //returning a copy of address


  /*
      now in the above approach  if we will add new field in Address class then we will have to modify immutable class also to set the
      additional field in address object. which is not a good practice. so we will create a copy constructor in address class and call it here

       */

        //Note 4:
        return new Address(add);
    }

    @Override
    public String toString() {
        return "EmployeeImmutable{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", add=" + add +
                '}';
    }
}
