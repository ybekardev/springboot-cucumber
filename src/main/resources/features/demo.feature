Feature: Api Test

  #@demo
  Scenario:
  Given The json file should include the value

  @demo
  Scenario Outline: Customer Info - <nodeValue>
    Given The json file "<fileName>" node "<node>"should include the value "<nodeValue>"

    Examples:
      |fileName|node|nodeValue|
      |src/main/resources/payloads/payloadArray.json|customer[0].fullName |Emily Jenkins|
      |src/main/resources/payloads/payloadArray.json| customer[0].age     |            27 |
      |src/main/resources/payloads/payloadArray.json| customer[0].id     |            44521 |
      |src/main/resources/payloads/payloadArray.json| customer[0].consumption_info.last_buy     | 2012-04-23 |
      |src/main/resources/payloads/payloadArray.json| customer[0].consumption_info.fav_product     |   Coke |

  #@api
  Scenario: emp name

    When I send the get request to "http://dummy.restapiexample.com/api/v1/employee/5"
    Then I validate the node "data[5].employee_name" equals to "Brielle Williamson"
    #Then I validate the node "node" equals to "nodeVal" from "response"
