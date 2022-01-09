package com.practice.pooria.variance.show.chart.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value="classpath:showchart.properties")
@ConfigurationProperties(prefix = "endpoint")
public class DefectEndpointProperties {

	private String baseUrl;
	private String url;

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(final String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(final String url) {
		this.url = url;
	}

	public String getEndpoint(){
		return baseUrl + url;
	}
}
