package bsu.rfe.course2.group9.Kachuk;

public class Cheese extends Food {
    public Cheese() {
        super("Cheese");
    }

    @Override
    public void consume() {
        System.out.println(this + " has been eaten");
    }

    @Override
    public String GetSpecial() {
        return super.GetSpecial();
    }
    @Override
    public int calculateCalories() {
        return 300;
    }


}
