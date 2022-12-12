package bsu.rfe.course2.group9.Kachuk;

public class Eggs extends Food {

    private String number;
    public Eggs(String name, String number) {
        super(name);
        this.number = number;
    }

    public Eggs(String number) {

        super("Eggs");                                                  // конструктор предка, передав ему имя класса
        this.number = number;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Eggs)) return false;
            return number.equals(((Eggs) arg0).number);
        } else
            return false;
    }


    public String toString() {
        return  number.toUpperCase() + " " + super.toString();
    }

    @Override
    public int calculateCalories() {
        if(number.equalsIgnoreCase("One")){
            return 150;
        } else if (number.equalsIgnoreCase("Two")){
            return 300;
        } else if (number.equalsIgnoreCase("Three")){
            return 450;
        }
        return 0;
    }

    @Override
    public void consume() {
        System.out.println(this + " has been consumed");
    }

}