package com.katru.api.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.katru.api.entity.Post;

@Service
public class PostService {

    private final RestTemplate restTemplate;
    
    public PostService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Post> loadPosts(){
        // call the json place holder service and return list of posts

        // 2 options:
        // spring rest template or web client
        ResponseEntity<List<Post>> exchange = restTemplate.exchange("SOME_URL_HERE", 
                            HttpMethod.GET, 
                            null,
                            new ParameterizedTypeReference<List<Post>>() {}
        );

        return exchange.getBody();
        
    }
}
