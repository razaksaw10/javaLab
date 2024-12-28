package labo;

public  class Animal {
	
protected int legs;
    
    protected Animal(int _legs) {
        legs = _legs;
    }
    
    public void walk() {
        System.out.println(legs+" Foot .");
    }
    public void eat() {
        System.out.println("ne yiyor .");
    }
    public void play() {
    	System.out.println("Ne oynuyor.");	
    }
 
}
