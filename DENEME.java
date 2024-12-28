package labo;

public class DENEME {

	public static void main(String[] args) {
		
		
        Cat c1 = new Cat();
        Fish f1 = new Fish();
        Spider s1 = new Spider();
        Animal a1 = new Animal(4);
        
        System.out.println("pour le cat \n-------------\n");
        c1.walk();
        c1.play();
        c1.eat();
        
        System.out.println("pour le spider\n-------------\n");
        s1.eat();
        s1.walk();
        s1.play();
        
        System.out.println("pour le animal \n-------------\n");
        a1.eat();
        a1.walk();
        a1.play();
       
       
        
        System.out.println("pour le fish \n-------------\n");
        
        f1.play();
        f1.eat();
        f1.walk();
    }


	}


