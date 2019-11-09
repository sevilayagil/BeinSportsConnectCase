$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Subscribe.feature");
formatter.feature({
  "line": 1,
  "name": "subscribe",
  "description": "",
  "id": "subscribe",
  "keyword": "Feature"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "a web browser is at the BeinSportsConnect home page",
  "keyword": "Given "
});
formatter.match({
  "location": "SubscribeStep.aWebBrowserIsAtTheBeinSportsConnectHomePage()"
});
formatter.result({
  "duration": 17272982892,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User navigate to site and fills user form after fills card detail and show popup",
  "description": "",
  "id": "subscribe;user-navigate-to-site-and-fills-user-form-after-fills-card-detail-and-show-popup",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@subs"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user clicks subscribe button and selects Monthly Pass with One Week Free Trial",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user fills user information detail and click create account button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user fills card detail and clicks confirm payment method",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user shows error popup",
  "keyword": "Then "
});
formatter.match({
  "location": "SubscribeStep.userClicksSubscribeButtonAndSelectsMonthlyPassWithOneWeekFreeTrial()"
});
formatter.result({
  "duration": 8928316972,
  "status": "passed"
});
formatter.match({
  "location": "SubscribeStep.userFillsUserInformationDetailAndClickCreateAccountButton()"
});
formatter.result({
  "duration": 6013550646,
  "status": "passed"
});
formatter.match({
  "location": "SubscribeStep.userFillsCardDetailAndClicksConfirmPaymentMethod()"
});
