package level0;

public class Animal {
    String name;
    String sex;
    int age;
    float weight;
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}
class Dog extends Animal{
    String hobby;
    public void eat(){
        System.out.println("eat meat");
    }
    public void act(){
        System.out.println("bark");
    }
    public String toString(){
        return "dog:name"+name+"\n"+"dog:sex"+sex+"\n"+"dog:age"+age+"\n"+"dog:weight"+weight+"\n"+"dog:hobby"+hobby+"\n";
    }
    public Dog(String name,String sex,int age,float weight,String hobby){
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.weight=weight;
        this.hobby=hobby;
    }
}
class Cat extends Animal{
    String hobby;
    public void eat(){
        System.out.println("eat fish");
    }
    public void act(){
        System.out.println("meow");
    }
    public String toString(){
        return "cat:name"+name+"\n"+"cat:sex"+sex+"\n"+"cat:age"+age+"\n"+"cat:weight"+weight+"\n"+"cat:hobby"+hobby+"\n";
    }
    public Cat(String name,String sex,int age,float weight,String hobby){
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.weight=weight;
        this.hobby=hobby;
    }
}
class AnimalTest{
    public static void main(String args[]){
        Animal cat=new Cat("cat","male",1,10,"catch fish");
        Animal dog=new Dog("dog","female",2,20,"guard house");
        Animal a=(Cat) cat;
        a.eat();
        System.out.println(a.toString());
        a=(Dog) dog;
        a.eat();
        System.out.println(a.toString());
    }
}