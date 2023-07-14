package src.main.Colleations.CustomKey;

class Employee {

    private Integer id;
    private String name;

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @Override
    public  boolean equals(Object obj){
        if(obj == null){
            return false;
        }if(this.getClass() != obj.getClass()){
            return false;
        }
        Employee emp = (Employee)obj;
        return(emp.id ==this.id || emp.id.equals(this.id) && emp.name == this.name || emp.name.equals(this.name));
    }

    @Override
    public int hashCode(){
        return id.hashCode()^name.hashCode();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
