package Examples.dto;

public class Phone implements IPhone{
    private final String brand;

    public Phone( ){ this.brand = "def"; }

    public Phone(String brand){ this.brand = brand; }

    public String getBrand(){ return brand; }

    public void call(String number){
        System.out.println("Calling " + number);
    }
}
