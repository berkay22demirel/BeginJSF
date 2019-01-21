package ajax;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Calculator {

	int first;
	int second;

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public String getAddition() {

		return String.valueOf(first + second);
	}

	public String getMultiplication() {
		
		return String.valueOf(first * second);
	}

}
