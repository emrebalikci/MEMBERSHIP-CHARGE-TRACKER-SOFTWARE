/*
 * This is a simple IllegalOperatorException type.
 * 
 * Author : EMRE BALIKCI
 * Date : May 23,2016
 */
public class IllegalOperatorException extends Exception {

	String msg;

	public IllegalOperatorException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	
	
	
}
