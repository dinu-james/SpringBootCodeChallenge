# Spring Boot Coding Exercise

This is a simple coding exercise that will allow you to demonstrate your knowledge
of spring boot by using a microservice to call a downstream service and return
some results.

## Project Structure

This is a multi module maven project with two modules:

- The `micoservice` module produces a spring boot application.
- The `functional-tests` is used to run functional tests using the [karate](https://github.com/intuit/karate) library.

## Instructions

Select one of the two exercises below and add the required behaviour to the spring boot application in the microservice module. You can:

- Add libraries you need.
- Refactor any of the existing code.

You will see that there are already a couple of endpoints in the `microservice` they are fundamentally there to demonstrate the use of the [karate](https://github.com/intuit/karate) library and should not be taken as complete examples.

### Assesment

Your submission will be judge along the following criterea.

- The solution works.
- The solution is maintainable.
- The solution is tested.
- The solution is appropriate.

## The Exercises

Example curl api calls for these exercises are listed in the following gist https://gist.github.com/bartonhammond/0a19da4c24c0f644ae38

**1. Find the hottest repositories created in the last week**

Use the [GitHub API][1] to expose an endpoint in this microservice the will get a list of the
highest starred repositories in the last week.

The endpoint should accept a parameter that sets the number of repositories to return.

The following fields should be returned:

      html_url
      watchers_count
      language
      description
      name

**2. Find the oldest user accounts with zero followers**

Use the [GitHub API][1] to expose an endpoint in this microservice that will find the oldest
accounts with zero followers.

The endpoint should accept a parameter that sets the number of accounts to return.

The following fields should be returned:

      id
      login
      html_url

[1]: http://developer.github.com/v3/search/#search-repositories
