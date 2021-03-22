package model.idemo;

public class Bird extends Animal
{
    private int wingSpan;
    
    public Bird(int x , int y , String name, int age , int wingSpan)
    {
        super(x, y, name, age);
        this.wingSpan = wingSpan;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    @Override
    public String toString()
    {
        return "[Bird]" + super.toString() + ", wingSpan = " + wingSpan;
    }

    @Override
    public String getSound() {
        return "[Bird] chirrrrrrrrrr r ~~~~~ ing";
    }
}
