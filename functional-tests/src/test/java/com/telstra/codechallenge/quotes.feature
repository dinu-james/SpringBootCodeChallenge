# See
# https://github.com/intuit/karate#syntax-guide
# for how to write feature scenarios
Feature: As an api user I want to retrieve some spring boot quotes

  Scenario: Get a random quote
    Given url microserviceUrl
    And path '/quotes/random'
    When method GET
    Then status 200
    And match header Content-Type contains 'application/json'
    # see https://github.com/intuit/karate#schema-validation
    And match response == 
    """
    { 
      type : 'success',
      value : {
        id : '#number',
        quote : '#string'
      }
    }
    """

  Scenario: Get all the quotes
    Given url microserviceUrl
    And path '/quotes'
    When method GET
    Then status 200
    And match header Content-Type contains 'application/json'
    # see https://github.com/intuit/karate#schema-validation
    # Define the required schema
    * def quoteSchema = { type : 'success', value : { id : '#number', quote : '#string' } }
    # The response should have an array of 12 quote objects
    And match response == '#[12] quoteSchema' 
