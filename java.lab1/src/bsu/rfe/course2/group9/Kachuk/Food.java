package bsu.rfe.course2.group9.Kachuk;

public abstract class Food implements Consumable, Nutritious {
    String name = null;

    public Food(String name) {
        this.name = name;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) return false;                      // arg0 -> Food/roots
        if (name==null || ((Food)arg0).name==null) return false;           //full construction
        return name.equals(((Food)arg0).name);
    }




    public String toString() { return name; }
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String GetSpecial(){
        return "";
    }




/*    if i want to make the class non-abstract


@Override
    public void consume() {
       System.out.println(this + " is consumed");                                                      //строк предст об'екта
    }

    @Override
    public int calculateCalories() {
        return 0;
    }*/

}
