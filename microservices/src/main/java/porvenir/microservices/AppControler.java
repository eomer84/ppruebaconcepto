package porvenir.microservices;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppControler {

	private static final String template = "Hello, %s!";
	 
    @RequestMapping("/greeting/{name}")
        public Parametricas greeting(@PathVariable("name") String name) {
            return new Parametricas(String.format(template, name));
        }
}
