package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestApplication {
	
	
	final static String server = "http://g-sellerauth-dev2.copart.com/seller/oauth/token?grant_type=password&username=Ranjini.sourirajan@copart.com&password=ranjini234";
	private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);

	public static void main(String[] args) {
		
		 //Map<String, String> vars = new HashMap<String, String>();
	        //vars.put("grant_type", "password");
	        //vars.put("username", "Ranjini.sourirajan@copart.com");
	        //vars.put("password", "ranjini234");
	        HttpHeaders headers = new HttpHeaders();
	        headers.setContentType(MediaType.APPLICATION_JSON);
	        headers.add("Authorization","Basic c2VsbGVyLXdlYjpzZWxsZXJzZWNyZXQ=");
	        HttpEntity<String> httpEntity = new HttpEntity<String>("parameters", headers);
	        System.out.println(httpEntity);
	        RestTemplate restTemplate = new RestTemplate();
		ResponseData token = (ResponseData) restTemplate.postForObject(server,  httpEntity, ResponseData.class);
		log.info(token.toString());
	}
	

	
}
