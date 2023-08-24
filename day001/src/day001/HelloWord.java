package day001;

public class HelloWord {//일시키는 놈 콜러
	
	//static String iname = "backy";//static 필드 변수(정적변수)
	public static void main(String[] args) {//args 지역변수
		//System.out.println( DataPrint.age );실행불가
		DataPrint.longData = 1290987387498379487L;//롱 정수야 L
			long ld = 1233464575684678L;
			long td = Long.MAX_VALUE;
		System.out.println(td);
			int id = (int)td;//롱형인데 인트형으로 형변환할게 이렇게 해도 괜찮아ㅎㅎ
		System.out.println(id);
		System.out.println(Integer.MAX_VALUE+1);//가장작은 수
		System.out.println( DataPrint.longData );
		/*
		DataPrint dataPrint;
		int kk;
		dataPrint = new DataPrint();//클래스 이름과 똑같은 메서드(대문자로 시작) -> 생성자 메서드
		System.out.println( dataPrint.age + 50 );
		System.out.println(kk = 123);
		String iname, aaa;
		iname = "hyeo ny";
		aaa = new String("hyeon ny");
		System.out.println(iname==aaa);*/
		//int kkk = 20;
		/*DataPrint obj = new DataPrint();//DataPrint타입의 obj
		obj.consolePrint("hello World");//호출 -> 자료줄게 출력해
		int k;
		double kk;
		String sk;
		char jj;
		boolean ll;
		int[] arrInt = {1,2,3};
		char cData = 'a';//문자형 지역변수 ->스택영역에 만들어진다. 메서드가 호출이 될 때(동작 할 때)
		cData = 65535;
		int sData = 20;
		sData = sData + 30;*/
	}
}
