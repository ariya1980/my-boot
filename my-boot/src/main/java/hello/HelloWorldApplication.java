package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

@SpringBootApplication
public class HelloWorldApplication {

//    @Bean
//    public ConfigurableServletWebServerFactory webServerFactory()
//    {
//        JettyServletWebServerFactory factory = new JettyServletWebServerFactory();
//        factory.setPort(9001);
//        factory.setContextPath("/myapp");
//        factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/notfound.html"));
//        return factory;
//    }
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
