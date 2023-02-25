public class dog {
	
String breed;
	int size;
	String colour;
	int age;
	
	void eat() {System.out.println("吃");
	}
	
	void run() {System.out.println("跑");
	}
	
	void sleep() {System.out.println("睡觉");
	}
	
	void name() {System.out.println("孟逸凡");
	}
public static void main(String[] args) { 
		dog d = new dog();
		d.eat();
		d.run();
		d.sleep();
  }
}