package tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AbrirElBrowser implements Task {

	 private PageObject page;
	 
	 public AbrirElBrowser(PageObject page){
		 this.page = page;
	 }
	 
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
	}
	public static AbrirElBrowser on(PageObject page) {
		return instrumented(AbrirElBrowser.class, page);
	}
}