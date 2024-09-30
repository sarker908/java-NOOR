public class Car {
    private String brand;
    private String model;
    private int year;


    Car(){
        this.brand = "";
        this.model = "";
        this.year = 0;
    }

    Car(String brand,String model){
        this.brand = brand;
        this.model = model;
        this.year = 0;
    }

    void setYear(int r){
        if (r>2000){
            this.year = r;
        }
        else
            System.out.println("Invalid Year");
    }
    int getYear() {
        return year;
    }

    void setBrand(String brand){
        if (brand.isBlank()){
            System.out.println("Invalid Brand");

        }
        else
            this.brand = brand;
    }
    String getBrand() {
        return brand;
    }

    void setModel(String model){
        if (model.isEmpty()){
            System.out.println("Please Enter Model");
        }
        this.model = model;
    }
    String getModel(){
        return model;
    }

    void honkHorn(){
        System.out.println(brand+ " "+model+" "+"Beep BEEP");
    }
}