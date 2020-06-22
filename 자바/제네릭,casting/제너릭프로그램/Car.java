package 제너릭프로그램;


//Arraylist <T>
//객체 생성시 타입을 정해주면 그에 맞는 타입으로 arraylist의 타입을 정해주는 프로그램을 제너릭프로그램이라고한다.
public class Car<T> {
	T size;
	
	
	
	public Car(T size) {
		this.size = size;
	}



	public T getsize() {
		return size;
		
	}
}
