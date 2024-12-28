package labo;

public class Cat extends Animal implements Pot {
	private String name;

    Cat() {
        super(4);
        name = "Stray Cat";
    }
    Cat(String _name) {
        super(4);
        name = _name;
    }
    
    public void eat() {
        System.out.println("Cat  fare yer .");
    }
    
    public void setName(String Name) { name = Name; }
    public String getName() { return name; }
    
    public void play() {
        System.out.println("Cat kosma yapar.");
        
        
    }

    public void walk() {
    	System.out.println("le spider ccourent.");	
    }
}
