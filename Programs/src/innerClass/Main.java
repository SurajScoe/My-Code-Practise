package innerClass;

public class Main {
	public static void main(String[] args) {
		outer.inner in = new outer().new inner();
		in.inner_display();
	}
}
