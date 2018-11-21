package guru.springframwork.didemo;

import guru.springframwork.didemo.controllers.ConstructorInjectedController;
import guru.springframwork.didemo.controllers.MyController;
import guru.springframwork.didemo.controllers.PropertyInjectedController;
import guru.springframwork.didemo.controllers.GetterInjectedController;
import guru.springframwork.didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());
	}
}
