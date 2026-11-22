interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}

class Duck implements Flyable,Swimmable{
    @Override
    public void fly(){
        System.out.println("Cuck can fly");
    }
    @Override
    public void swim(){
        System.out.println("Cuck can swim");
    }
}

class Aeroplane implements Flyable{
    @Override
    public void fly(){
        System.out.println("Aeroplane can fly");
    }

}

class Fish implements Swimmable{
    @Override
    public void swim(){
        System.out.println("Fish can swim");
    }
}

public class InterfaceAbstractFlySwim{
    public static void main(String[] args){
        Flyable[] a1 = {new Duck(), new Aeroplane()};
        for(Flyable a : a1){
            a.fly();
        }
    }
}