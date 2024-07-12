package com.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
@Configuration
public class APIConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("ElectronicsStoreManagementsystem", r -> r.path("/ElectronicsStore/**")
                .uri("http://localhost:8098"))
            .route("ElectronicsManagementSystempayment", r -> r.path("/payments/**")
                    .uri("http://localhost:8099"))
//            .route("product-service", r -> r.path("/product/**")
//               .uri("http://localhost:8098"))
//            .route("order-service", r -> r.path("/orders/**")
//                    .uri("http://localhost:8098"))
//            .route("orderproduct-service", r -> r.path("/orderproducts/**")
//                    .uri("http://localhost:8098")) 
//            .route("offer-service", r -> r.path("/offer/**")
//                    .uri("http://localhost:8098")) 
//            .route("offer-service", r -> r.path("/payments/**")
//                    .uri("http://localhost:8099")) 
            .build();
        
            
    }

}