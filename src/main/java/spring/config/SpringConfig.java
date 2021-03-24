package spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;
import spring.stepdefinitions.ApiStepDefinitions;

@Component
@PropertySources({
        @PropertySource("application.properties"),
        @PropertySource(value = "environment/${spring.profiles.active}.properties",ignoreResourceNotFound = true)
})
//@Import({src.main.java.spring.config.SpringConfig.java}) if adding any jar files to utilize the config prop
public class SpringConfig {

    @Value("${mongodb.url}")
    private String mongodbUrl;

    @Value("${mongodb.db}")
    private String defaultDb;

    public String step(){
        return this.mongodbUrl;
    }

    @Bean
    public ApiStepDefinitions stepDef(){
        return new ApiStepDefinitions();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
