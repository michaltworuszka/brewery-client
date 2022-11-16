package com.tworuszka.breweryclient.web.client;

import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author Michał Tworuszka
 * @project brewery-client
 */

@Component
@Setter
@ConfigurationProperties(value = "twor.brewery", ignoreUnknownFields = false)
public class BreweryClient {

    public final String BEER_PATH_V1 ="/api/v1/beer";
    private String apihost;

    private final RestTemplate restTemplate;

    public BreweryClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
}
