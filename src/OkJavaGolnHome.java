//남이 만든 코드를 부품으로 나의 어플리케이션을 만든다.

//org패키지 밑에 opentutorials 패키지 밑에 iot패키지 밑에 Elevator 라는 코드를 가져온다.
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGolnHome {

	public static void main(String[] args) {
		
		String id= "JAVA APT 507";
		
		// Elevator call
		Elevator myElevator = new Elevator(id); //myElevator: 변수 Elevator:데이터타입
		myElevator.callForUp(1); //1층으로 엘리베이터 호출
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp= new Lighting(id+" /Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp= new Lighting(id+"/ floor Lamp");
		floorLamp.on();
		

	}

}
