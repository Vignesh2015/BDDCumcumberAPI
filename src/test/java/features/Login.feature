Feature: Application Login


  Scenario: Home Page default login
    Given User is on NetBanking Landing page
    When user login into application with username "Vignesh" and password "1234"
    Then Home page is populated
    And Cards displayed are "true"

  Scenario: Home Page default login
    Given User is on NetBanking Landing page
    When user login into application with username "Karthi" and password "4321"
    Then Home page is populated
    And Cards displayed are "false"

  Scenario: Verify the place is being successfully added using the AddPlaceAPI
    Given Add Place Payload
    When User calls the AddPlace API with the Post HTTP Request
    Then the API call got success with Status code 200
    And Status in Response body is OK
