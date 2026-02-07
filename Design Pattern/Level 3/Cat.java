 class Animal {
     void makeSound(){         //method overloadding
        System.out.println("Animal make Sound");
     }
}


 class Dog extends Animal {
      void makeSound(){        //method overloading
        System.out.println("Dog barks");
      }
    
}

class Cat extends Animal{
    void makeSound(){         //method overloading
        System.out.println("Cat meows");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a.makeSound();
        a1.makeSound(); 
        a2.makeSound();
    }
}
