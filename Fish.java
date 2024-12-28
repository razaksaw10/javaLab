package labo;

public class Fish extends Animal implements Pot{

    private String name;

    Fish() {
        super(0);
        name = "Random Fish";
    }
    
    public void setName(String Name) { name = Name; }
    public String getName() { return name; }
    
    public void play() {
        System.out.println(" fish Playing football.");
    }
    
    public void walk() {
        System.out.println("Fishes yuruyemiyor yüzüyor.");
    }
    public void eat() {
        System.out.println(" fish kücük fish yer.");
    }
}
