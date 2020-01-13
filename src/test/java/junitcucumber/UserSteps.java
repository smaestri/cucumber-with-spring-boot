package junitcucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class UserSteps extends SpringTest {

	@Autowired
	private User user;

	@Autowired
	@MockBean
	private MyService service;

	@Given("^that the user (.*) is given a task to clear (.*) certification exam$")
	public void certificationName(String name, String certication) throws Throwable {
		user.setName(name);
		user.setCertification(certication);
	}

	@When("^(.*) got (\\d+) marks in exam$")
	public void gotMarks(String name, int marks) throws Throwable {
		user.setName(name);
		user.setMarks(marks);
	}

	@Then("^(.*) is known as (.*) certified$")
	public void certifiedYes(String name, String certification) throws Throwable {

		when(service.testsma()).thenReturn("modified value!");
		assertEquals(user.testsma(),"modified value!" );
	}

	@And("test final")
	public void test() throws Throwable {
		when(service.testsma()).thenReturn("modified value2!");
	}

	@And("test final2")
	public void test2() throws Throwable {
		assertEquals(user.testsma(),"modified value2!" );
	}
}
