public class Car {private String name,brand;
    private int year,total_distance;
    public Car(String n, String b,int y,int td){
        this.name = n;
        this.brand = b;
        this.year = y;
        this.total_distance = td;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setBrand(String b){
        this.brand = b;
    }
    public void setYear(int y){
        this.year = y;
    }
    public void setTotal_distance(int td){
        this.total_distance = td;
    }
    public String getName(){
        return this.name;
    }
    public String getBrand(){
        return this.brand;
    }
    public int getYear(){
        return this.year;
    }
    public int getTotal_distance(){
        return this.total_distance;
    }
    public void trip(int a){
        this.total_distance += a;
    }
}
