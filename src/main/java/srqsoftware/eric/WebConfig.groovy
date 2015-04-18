package srqsoftware.eric;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter

@Configuration
public class WebMvcConfig extends WebMvcAutoConfigurationAdapter {

	@Override
	public void addResourceHandlers( ResourceHandlerRegistry registry ) {
		String location = "classpath:/static/";
		registry.addResourceHandler( "/**" ).addResourceLocations( location )
	}
}