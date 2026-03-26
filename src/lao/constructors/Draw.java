package lao.constructors;

public class Draw {    //constructoroverloading

	String draw;
	
	 Draw() {
	System.out.println("Draw object created");	
	}
	
	Draw(String toDraw){
		draw=toDraw;
		System.out.println("Drawing"+toDraw);
	}
	public static void main(String[] args) {
Draw draw = new Draw();
Draw draw1= new Draw("Circle");

	}

}
