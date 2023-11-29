Feature: Student Registration API Testing

  Scenario: Register a student via API
    Given the API base URI is "http://your-api-base-url.com"
    When a POST request is made to "/register/student" with the following payload:
      """
      {
        "name": "John Doe",
        "age": 25,
        "grade": "A"
      }
      """
    Then the response status code should be 200
    And the response body should contain:
      """
      {
        "status": "success"
      }
      """
