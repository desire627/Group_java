Feature: Greeting a person

  Scenario: Greet someone by name
    Given I have a name "World"
    When I greet the person
    Then the greeting should be "Hello, World!"
