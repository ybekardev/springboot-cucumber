#@api
Feature: Get Employee Data

  @api
  Scenario: Employee Info
    When I send the get request to "http://dummy.restapiexample.com/api/v1/employees"
    Then I validate the node "data[0].employee_name" equals to "Tiger Nixon"
    #Then I validate the node "node" equals to "nodeVal" from "response"
    #Given I clear all request

  @api
  Scenario: emp name

    When I send the get request to "http://dummy.restapiexample.com/api/v1/employee/3"
    Then I validate the node "data[3].employee_name" equals to "Cedric Kelly"
    #Then I validate the node "node" equals to "nodeVal" from "response"
