package config;

import com.nttdata.prototype.Person;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
	
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Person PersonPrototype() {
		return new Person(null, 0);
		
	}
	
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
	public Person PersonSingleton() {
		return new Person(null, 0);	
	}
	
}
