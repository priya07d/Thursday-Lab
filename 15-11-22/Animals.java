package oopsconcept;
class Animal {
     void eat()
    {
        System.out.println(" Animal eat the food");

    }
     void sleep()
    {
        System.out.println("Animal sleep");

    }

}
class Bird extends Animal
{
   
     
     void fly()
     
    {
    	 super.eat();
    	 super.sleep();
        System.out.println("Bird fly ");

    }
}
 public class Animals{
    public static void main(String[] args) {
    	System.out.println("***********This is instance of Animal***************");
        Animal a =new Animal();
        Bird b = new Bird();
        a.eat();
        a.sleep();
        
    	System.out.println("***********This is instance of Birds***************");
        
        
        b.fly();
    }
}


