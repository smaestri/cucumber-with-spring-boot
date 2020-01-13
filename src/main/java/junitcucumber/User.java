package junitcucumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

	private String name;
	private String certification;
	private int marks;

	@Autowired
	private MyService myService;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public boolean getResult() {
		if (this.marks < 60) {
			return false;
		} else {
			return true;
		}
	}


	public String testsma() {

		return myService.testsma();

	}

}
