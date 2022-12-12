package bsu.rfe.course2.group9.Kachuk;

import java.util.*;

public class Main {

    public static int Calories = 0;
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        final int size = args.length;
        Vector<Food> breakfast = new Vector<Food>();

        try {
            for (int i = 0; i < size; ++i) {
                switch (args[i]) {
                    case "Eggs": {
                        Eggs eggs = new Eggs("Eggs", args[++i]);
                        eggs.consume();
                        breakfast.add(eggs);

                        break;
                    }
                    case "Cheese": {
                        Cheese cheese = new Cheese();
                        cheese.consume();
                        breakfast.add(cheese);
                        break;
                    }
                    case "Apple": {
                        Apple apl = new Apple("Apple", args[++i]);
                        apl.consume();
                        breakfast.add(apl);
                        break;
                    }
                    default: {
                        if (args[i].charAt(0) == '-') {
                            break;
                        }
                        throw new RuntimeException("Class " + args[i] + " not Found");
                    }
                }
            }
        } catch (RuntimeException error) {
            System.out.println(error.toString());
        }

        System.out.println("Enter -calories, if u want to calculate calories:");
        String seeCalories = console.nextLine();
        if (seeCalories.equals("-calories")) {
            calculateCalories(breakfast);
        }


        System.out.println("Enter -sort, if u want to sort: ");
        String ifSorted;
        ifSorted = console.nextLine();
        boolean b = false;
        if (ifSorted.equals("-sort")) {
            b = true;
        }
        if (b) {

            Comparator<Food> comparator = new Comparator<Food>() {
                @Override
                public int compare(Food o1, Food o2) {
                    return -1 * o1.GetSpecial().compareTo(o2.GetSpecial());
                }

            };

            ArrayList<Food> arl = new ArrayList<Food>();
            for (int i = 0; i < breakfast.size(); i++) {
                arl.add(breakfast.elementAt(i));
            }

            arl.sort(comparator);

            for (int i = 0; i < arl.size(); i++) {
                System.out.println(arl.get(i));
            }

            System.out.println("Good luck!");
        }
    }


    public static void CalNumbers(Vector<Food> f) {
        int numOfApples = 0;
        int numOfCheese = 0;
        int numOfEggs = 0;
        for (int i = 0; i < f.size(); i++) {
            if (f.elementAt(i).getName().equals("Apple")) {
                numOfApples++;
            } else if (f.elementAt(i).getName().equals("Cheese")) {
                numOfCheese++;
            } else if (f.elementAt(i).getName().equals("Eggs")) {
                Eggs egg = (Eggs) f.elementAt(i);
                if (egg.getNumber().equals("One")) {
                    numOfEggs++;
                } else if (egg.getNumber().equals("Two")) {
                    numOfEggs += 2;
                } else if (egg.getNumber().equals("Three")) {
                    numOfEggs += 3;
                }
            }
        }
        System.out.println("The number of apples: " + String.valueOf(numOfApples));
        System.out.println("The amount of cheese: " + String.valueOf(numOfCheese));
        System.out.println("The number of eggs: " + String.valueOf(numOfEggs));
    }

    public static void calculateCalories(Vector<Food> f) {
        int calories = 0;
        for (int i = 0; i < f.size(); i++) {
            calories += f.elementAt(i).calculateCalories();
        }
        System.out.println("Total calories are: " + String.valueOf(calories));
    }
}












 /* on 49
 for (Food item : breakfast)
            if (item != null)
                item.consume();
            else
                break;*/