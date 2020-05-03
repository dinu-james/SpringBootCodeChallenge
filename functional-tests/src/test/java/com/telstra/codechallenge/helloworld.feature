# See
# https://github.com/intuit/karate#syntax-guide
# for how to write feature scenarios
Feature: As a developer i want to test the helloworld uri

  Scenario: Is the hello uri available and functioning
    Given url microserviceUrl
    And path '/hello'
    When method GET
    Then status 200
    And match header Content-Type contains 'application/json'
    # see https://github.com/intuit/karate#schema-validation
    And match response == 
    """
    { id : '#number',
      content : '#string'
    }
    And match response.content == "Hello, World!"
    """


