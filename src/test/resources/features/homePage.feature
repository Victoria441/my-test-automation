@HomePageTest
  Feature: Home Page Test

    @test
    Scenario: Verify Login
      Given User open home page
      Then User input "john@gmail.com" as a "email"
      Then User input "123a" as a "password"
      Then User click a button "Log In"

