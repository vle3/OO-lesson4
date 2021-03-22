package model.idemo;

public class Car extends Vehicle 
{
    public String type;

    public Car(int x, int y, String make, double price, String type) {
        super(x, y, make, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString()
    {
        return "[Car] " + super.toString() +", type = " + type;
    }

    @Override
    public String getSound() {
        return "[Car] Vrrrrrr ~~~~~~~ oooooooooooo m";
    }
    
}
