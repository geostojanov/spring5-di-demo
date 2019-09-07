package guru.springframework;

import guru.springframework.controllers.CIController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PIController;
import guru.springframework.controllers.SIController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");
		controller.hello();

		System.out.println(ctx.getBean(PIController.class).sayHello());
		System.out.println(ctx.getBean(SIController.class).sayHello());
		System.out.println(ctx.getBean(CIController.class).sayHello());
	}
}
