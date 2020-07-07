package com.telstra.codechallenge.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;


public class User {

   int id;
   String login;
   @JsonProperty(value="html_url")
   String htmlUrl;

    public User() {
    }

    public User(int id, String login, String htmlUrl) {
        this.id = id;
        this.login = login;
        this.htmlUrl = htmlUrl;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }
}
