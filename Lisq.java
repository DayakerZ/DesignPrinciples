//This principle defines substitutablity of a Class by child class
//Bird class with fly method  has child as Crow and emu.Here emu cannot fly so this child class cannot replace its parent Thus violates
// the Lisq Principle
//So to make this possible we should define methods which can be created in all of the Parent classes

class Bird {

    public void getInfo(){

        System.out.println("I am a bird");
    }
}
class FlyingBird extends Bird{

    public void fly(){

        System.out.println("I can fly");
    }
}
class Crow extends FlyingBird{

}
class Emu extends Bird{

}

public class Lisq{
    public static void main(String[] args) {
        
        Emu e = new Emu();
        e.getInfo();
        Crow c = new Crow();
        c.getInfo();
        c.fly();
    }
}