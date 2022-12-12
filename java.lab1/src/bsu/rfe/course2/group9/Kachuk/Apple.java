package bsu.rfe.course2.group9.Kachuk;

public class Apple extends Food {

    private String size;

    @Override
    public String GetSpecial() {
        return size;
    }

    public Apple(String name, String size) {
        super(name);
        this.size = size;
    }

    public Apple(String size) {

        super("Apple");                                                    // конструктор предка
        this.size = size;
    }

    public String getSize() { return size; }                                   // селектор для доступа к полю данных

    public void setSize(String number) {              // модификатор для изменения поля данных
        this.size = size;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Apple)) return false;
            return size.equals(((Apple)arg0).size);
        } else
            return false;
    }


    public String toString() {
        return  size.toUpperCase() + " " + super.toString();
    }

    @Override
    public int calculateCalories() {
        if(size.equalsIgnoreCase("Small")){
            return 50;
        } else if (size.equalsIgnoreCase("Medium")){
            return 100;
        } else if (size.equalsIgnoreCase("Big")){
            return 150;
        }
        return 0;
    }

    @Override
    public void consume() {
        System.out.println(this + " has been eaten");
    }
}