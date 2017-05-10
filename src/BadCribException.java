package turingbombsimulator;

public class BadCribException extends Exception {
	private String msg;
	public BadCribException(String s){
		this.msg = s;
	}
	@Override
	public String toString(){
		return "BadCribException: " + msg;
	}
}
