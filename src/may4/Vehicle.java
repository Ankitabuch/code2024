package may4;

public class Vehicle <T,R>{

    T name;
    R year;
    T model;

    public Vehicle(T name, R year, T model) {
        this.name = name;
        this.year = year;
        this.model = model;
    }

    public static void main(String[] args){
        Vehicle<String,Integer> vehicle = new Vehicle<String, Integer>("Bike",2015,"RC01");
        Vehicle<String,String> vehicle1 = new Vehicle<String,String>("Car","2302","XUV");
        Vehicle<Integer,Integer> Vehicle = new Vehicle<>(101,2023,6748);
    }
}
