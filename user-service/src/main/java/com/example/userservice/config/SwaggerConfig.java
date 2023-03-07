package com.example.userservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@SecurityScheme(name = "Authorization",
                in = SecuritySchemeIn.HEADER,
                type = SecuritySchemeType.APIKEY
                )
@OpenAPIDefinition(
        info = @Info(
                title = "API documentation for Email service",
                description = "Uzum market is set of product ...",
                termsOfService = "https://uzum.uz/",
                contact = @Contact(name = "Avazbek Yusupov", email = "yusupofavazbek@gmail.com"),
                version = "1.0.0"
        )
)
public class SwaggerConfig {

}
