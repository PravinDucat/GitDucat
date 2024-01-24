$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/pc/eclipse-workspaceNEW2/BDDFrameworkCucumber/Features/Demo.feature");
formatter.feature({
  "line": 1,
  "name": "Rediffmail login features",
  "description": "",
  "id": "rediffmail-login-features",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Rediffmail login test scenario",
  "description": "",
  "id": "rediffmail-login-features;rediffmail-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is rediff",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoSDF.user_is_already_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DemoSDF.title_of_login_page_is_rediff()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DemoSDF.user_enters_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DemoSDF.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DemoSDF.user_is_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
});