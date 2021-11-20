interface FillFuel{

    public void fillFuel();
}

class FillPetrole implements FillFuel{

    @Override
    public void fillFuel() {
        System.out.println("Petrole is being filled in to the engine");
        
    }
    
}
// this Engine classis depending on interface FillFuel so it can exist with out FillPetrole
class Engine{

    FillFuel f;
    public Engine(FillFuel f){
        this.f = f;
    }
    public void fillEngineFuelTank(){

        f.fillFuel();
    }

}

public class Dip{
    public static void main(String[] args) {
        Engine e = new Engine(new FillPetrole());
        e.fillEngineFuelTank();
    }
}