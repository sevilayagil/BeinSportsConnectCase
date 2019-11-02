$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Subscribe.feature");
formatter.feature({
  "line": 1,
  "name": "subscribe fail",
  "description": "",
  "id": "subscribe-fail",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User navigate to site and fills user form. after fills card detail and show popup",
  "description": "",
  "id": "subscribe-fail;user-navigate-to-site-and-fills-user-form.-after-fills-card-detail-and-show-popup",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@subs"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "a web browser is at the BeinSportsConnect home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks subscribe button and selects Monthly Pass with One Week Free Trial",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user fiils user information detail and click create account button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user fills card detail and clicks confirm payment method",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user shows error popup",
  "keyword": "Then "
});
formatter.match({
  "location": "SubscribeStep.aWebBrowserIsAtTheBeinSportsConnectHomePage()"
});
formatter.result({
  "duration": 11993172209,
  "status": "passed"
});
formatter.match({
  "location": "SubscribeStep.userClicksSubscribeButtonAndSelectsMonthlyPassWithOneWeekFreeTrial()"
});
formatter.result({
  "duration": 18355971659,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d78.0.3904.87)\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u002702484840Bs-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:48c:7f98:e720:4203%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 78.0.3904.87, chrome: {chromedriverVersion: 78.0.3904.70 (edb9c9f3de024..., userDataDir: /var/folders/9h/zl96m3md12l...}, goog:chromeOptions: {debuggerAddress: localhost:55766}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 5a4e3093aa0e89bc1a0ba642ee6d1c09\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:658)\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:343)\n\tat scenarios.base.StepManager.takeScreenshot(StepManager.java:114)\n\tat scenarios.base.StepManager.elementClick(StepManager.java:76)\n\tat scenarios.testcases.SubscribeStep.userClicksSubscribeButtonAndSelectsMonthlyPassWithOneWeekFreeTrial(SubscribeStep.java:29)\n\tat ✽.When user clicks subscribe button and selects Monthly Pass with One Week Free Trial(src/test/resources/Subscribe.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "SubscribeStep.userFiilsUserInformationDetailAndClickCreateAccountButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SubscribeStep.userFillsCardDetailAndClicksConfirmPaymentMethod()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SubscribeStep.userShowsErrorPopup()"
});
formatter.result({
  "status": "skipped"
});
});