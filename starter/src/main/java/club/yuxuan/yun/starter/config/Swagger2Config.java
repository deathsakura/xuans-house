package club.yuxuan.yun.starter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * SwaggerUI配置类
 *
 * @author yuxuan.han
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
	
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("club.yuxuan.yun.mvc"))
				.paths(PathSelectors.any())
				.build();
	}

	private ApiInfo apiInfo() {
		Contact contact = new Contact("yuxuan.han", "https://github.com/yuxuanjava/xuans-house", "xuans_house@163.com");
		return new ApiInfoBuilder()
				.title("使用Swagger2构建后台接口API")
				.description("简单优雅的rest fun风格")
				.termsOfServiceUrl("http://localhost/swagger-ui.html#/")
				.contact(contact)
				.version("2.0")
				.build();
	}
	
}
