package com.jeya.swaggerSpringBootTest;

import static java.util.Collections.emptyList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwaggerSpringBootTestApplication
{

  public static void main(String[] args)
  {
    SpringApplication.run(SwaggerSpringBootTestApplication.class, args);
  }

  @Bean
  Docket swaggerConfiguration()
  {
    Docket docket = new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.ant("/api/*"))
      .apis(RequestHandlerSelectors.basePackage("com.jeya")).build();
    ApiInfo apiInfo = getApiInfo();
    docket.apiInfo(apiInfo);
    return docket;
  }

  private ApiInfo getApiInfo()
  {
    return new ApiInfo("Address book API",
                       "Sample API fo JavaBrains tutorial",
                       "1.0",
                       "Free to use",
                       new springfox.documentation.service.Contact("JJ",
                                                                   "https://github.com/Jeyatharsini/SwaggerSpringBootTest",
                                                                   "jjeyatharsini@gmail.com"),
                       "API License",
                       "https://github.com/Jeyatharsini/",
                       emptyList());
  }
}
