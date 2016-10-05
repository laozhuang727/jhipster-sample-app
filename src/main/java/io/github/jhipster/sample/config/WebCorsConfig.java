package io.github.jhipster.sample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
//@EnableWebMvc
public class WebCorsConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/*")
            .allowedOrigins("http://127.0.0.1:8085","http://127.0.0.1:9000");
//            .allowedMethods("PUT", "DELETE")
//            .allowedHeaders("header1", "header2", "header3")
//            .exposedHeaders("header1", "header2")
//            .allowCredentials(false).maxAge(3600);
    }
}
