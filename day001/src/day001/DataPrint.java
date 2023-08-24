package day001;

public class DataPrint {//일할놈 워커 나는 출력만 책임져!
	static long longData = 123456789;//정적 롱형 필드
	int age = 200;//클래스 안이면서 함수 바깥에 있는 변수, 인스턴스 멤버변수, 정수형 인스턴스 필드변수 선언 - 용도가 결정됨 - 힙영역에 만들어 진다=>객체 생성자가(new에 의해서) 호출 될때
	//public void consolePrint(String data) {
	//	System.out.println(data);//받아서 콘솔에 출력! 나는 콘솔에 출력하는것만 책임져!
		public void back(){//메서드 만들기public void로 시작
		char cData = 'a';//문자형 지역변수 ->스택영역에 만들어진다. 메서드가 호출이 될 때(동작 할 때)
		cData = 65535;
		int sData = 20;
		sData = sData + 30;
		}
	}
//}