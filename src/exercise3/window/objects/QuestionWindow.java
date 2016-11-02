package exercise3.window.objects;

public class QuestionWindow implements MessageWindow {

	private Integer code;

	public QuestionWindow(Integer code) {
		this.code = code;
	}
	
	@Override
	public void displayMessage() {
		System.out.println("??? " + code);
	}

}
