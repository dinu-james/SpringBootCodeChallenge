package com.telstra.codechallenge.service;

import com.telstra.codechallenge.DTO.UserList;
import com.telstra.codechallenge.DTO.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    public List<User> getOldUserAccounts(long noOfAccounts) {
        RestTemplate restTemplate = new RestTemplate();
        UserList userDTO = restTemplate.getForObject(getUri(), UserList.class);
        return userDTO.getUsers()
                .stream()
                .limit(noOfAccounts)
                .collect(Collectors.toList());

    }

    private URI getUri() {
        return UriComponentsBuilder.fromUriString("https://api.github.com")
                .path("/search/users")
                .queryParam("q","followers:0")
                .queryParam("sort","joined")
                .queryParam("order","asc")
                .build()
                .encode().toUri();
    }
}
