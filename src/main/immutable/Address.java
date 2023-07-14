package src.main.immutable;

public class Address {

    private String city;
    private String state;
    private String country;
    private int zip;

    public Address(String city,String state,String country,int zip){
        this.city = city;
        this.state = state;
        this.country = country;
        this.zip = zip;
    }
   public Address(Address address){
       this(address.getCity(), address.getState(), address.getCountry(), address.getZip());
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){

        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getZip() {
        return zip;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zip=" + zip +
                '}';
    }
}
