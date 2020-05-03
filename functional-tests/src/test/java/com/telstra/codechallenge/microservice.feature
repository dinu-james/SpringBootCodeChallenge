# See
# https://github.com/intuit/karate#syntax-guide
# for how to write feature scenarios
Feature: As a developer i want to know if my spring boot application is running

  Scenario: Is the health uri available and status=UP
    Given url microserviceUrl
    And path '/actuator/health'
    When method GET
    Then status 200
    And match response == { "status" : "UP" }

  Scenario: Is the info uri available and returning data
    Given url microserviceUrl
    And path '/actuator/info'
    When method GET
    Then status 200
    # see https://github.com/intuit/karate#schema-validation
    And match response ==
      """
        {
          build: {
            version: '#string',
            artifact: '#string',
            name: '#string',
            group: '#string',
            time: '#string'
          }
        }
      """