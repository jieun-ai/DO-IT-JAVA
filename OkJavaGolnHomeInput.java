//<JAVA1-11.1 입력과 출력>
//남이 만든 코드를 부품으로 나의 어플리케이션을 만든다.

//org패키지 밑에 opentutorials 패키지 밑에 iot패키지 밑에 Elevator 라는 코드를 가져온다.
import javax.swing.JOptionPane;

import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.DimmingLights;

public class OkJavaGolnHomeInput {

	public static void main(String[] args) {
		//사용자가 입력한 값에 따라서 다른 동작을 한다.
		String id= args[0];
		String bright= args[1];
		
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
		
		DimmingLights moodLamp=new DimmingLights(id+" moodLamp");
		// string 형태의 bright가 bouble형으로 변경되는 코드:Double.parseDouble(bright)
		//왜냐하면 setBright라는 코드가 bouble형만 가능하기 때문이다.
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
	}

}
