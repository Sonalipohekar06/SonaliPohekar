package JavaProg;
import JavaProg.CentralTrafficRule;

public class AustralianTraffic implements CentralTrafficRule{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTrafficRule  a =new AustralianTraffic();
		
		a.Yellowslow();
		a.greenGo();
		a.redStop();
		
		AustralianTraffic at=new AustralianTraffic();
		at.WalkOn();
	}

	public void WalkOn()
	{
		System.out.println("*****walk when it is GREEN****");
	
		
	}
	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("*****GREEN****");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("*****RED****");
	
	}

	@Override
	public void Yellowslow() {
		// TODO Auto-generated method stub
		System.out.println("*****YELLOW****");
		
	}

}
