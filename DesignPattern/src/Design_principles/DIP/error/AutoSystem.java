package Design_principles.DIP.error;

public class AutoSystem {
	public enum CarType{
        Ford,Honda
    };
    private HondaCar hcar=new HondaCar();
    private FordCar fcar=new FordCar();
    private CarType type;
    public AutoSystem(CarType type){
        this.type=type;
    }
    private void RunCar(){
        if(type==CarType.Ford){
            fcar.Run();
        } else {
            hcar.Run();
        }
    }
    private void TurnCar(){
        if(type==CarType.Ford){
            fcar.Turn();
        } else { 
            hcar.Turn();
        }
    }
    private void StopCar(){
        if(type==CarType.Ford){
            fcar.Stop();
            } else {
                hcar.Stop();
            }
    }
    
    public void test(){
    	RunCar();
    	TurnCar();
    	StopCar();
    }
}
