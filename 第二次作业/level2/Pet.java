package level2;

public abstract class Pet{
    public abstract void sound();
    public abstract void eat();
    public void asApet(){
        this.sound();
        this.eat();
    }
}
class dog extends Pet{
    public void sound(){
        System.out.println("bark");
    }
    public void eat(){
        System.out.println("eat meat");
    }
    public void kind(){
        System.out.println("As a dog");
    }

}
class cat extends Pet{
    public void sound(){
        System.out.println("meow");
    }
    public void eat(){
        System.out.println("eat fish");
    }
}
class rabbit extends Pet{
    public void sound(){
        System.out.println("rabbits can't do this");
    }
    public void eat(){
        System.out.println("eat carrot");
    }
}
