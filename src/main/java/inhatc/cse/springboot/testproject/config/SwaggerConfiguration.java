

//이 자바파일은 구버전(3.x이전) 스프링 부트에서 swagger를 사용하기 위한 코드이다
//3.x 이후 버전은 pom.xml파일에 springdoc dependency를 추가하고 사용하면 된다



//package inhatc.cse.springboot.testproject.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfiguration {
//
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("inhatc.cse.springboot"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        return  new ApiInfoBuilder()
//                .title("Yongjin Open API Test with Swagger")
//                .description("설명 부분")
//                .version("21")
//                .build();
//    }
//}
