$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/taskpage.feature");
formatter.feature({
  "line": 1,
  "name": "To Test the Task Page in CRM",
  "description": "",
  "id": "to-test-the-task-page-in-crm",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "To Complete the Task Page",
  "description": "",
  "id": "to-test-the-task-page-in-crm;to-complete-the-task-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "include details \"\u003ctitle\u003e\" and \"\u003cdue date\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "enter \"\u003cdescription\u003e\" and \"\u003ccompletion\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "add \"\u003ctype\u003e\" and \"\u003cpriority\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "save task",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "take Screenshot",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "to-test-the-task-page-in-crm;to-complete-the-task-page;",
  "rows": [
    {
      "cells": [
        "title",
        "due date",
        "description",
        "completion",
        "type",
        "priority"
      ],
      "line": 21,
      "id": "to-test-the-task-page-in-crm;to-complete-the-task-page;;1"
    },
    {
      "cells": [
        "CRM Title for Demo",
        "07/08/2020 22:30",
        "all good",
        "done",
        "Complaint",
        "high"
      ],
      "line": 22,
      "id": "to-test-the-task-page-in-crm;to-complete-the-task-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 4,
  "name": "User is logged into CRM",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on free crm login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters email \"malarinbox@gmail.com\" and password \"Figo@2020\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click navigate to task page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click add new task",
  "keyword": "Then "
});
formatter.match({
  "location": "TasksStepDefinition.user_is_on_free_crm_login_page()"
});
formatter.result({
  "duration": 7599456700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "malarinbox@gmail.com",
      "offset": 19
    },
    {
      "val": "Figo@2020",
      "offset": 55
    }
  ],
  "location": "TasksStepDefinition.user_enters_email_and_password(String,String)"
});
formatter.result({
  "duration": 575550500,
  "status": "passed"
});
formatter.match({
  "location": "TasksStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 106416300,
  "status": "passed"
});
formatter.match({
  "location": "TasksStepDefinition.click_navigate_to_task_page()"
});
formatter.result({
  "duration": 1561109300,
  "status": "passed"
});
formatter.match({
  "location": "TasksStepDefinition.click_add_new_task()"
});
formatter.result({
  "duration": 203540900,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "To Complete the Task Page",
  "description": "",
  "id": "to-test-the-task-page-in-crm;to-complete-the-task-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "include details \"CRM Title for Demo\" and \"07/08/2020 22:30\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "enter \"all good\" and \"done\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "add \"Complaint\" and \"high\"",
  "matchedColumns": [
    4,
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "save task",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "take Screenshot",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "CRM Title for Demo",
      "offset": 17
    },
    {
      "val": "07/08/2020 22:30",
      "offset": 42
    }
  ],
  "location": "TasksStepDefinition.include_details_and(String,String)"
});
formatter.result({
  "duration": 664771600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "all good",
      "offset": 7
    },
    {
      "val": "done",
      "offset": 22
    }
  ],
  "location": "TasksStepDefinition.enter_and(String,String)"
});
formatter.result({
  "duration": 362789800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Complaint",
      "offset": 5
    },
    {
      "val": "high",
      "offset": 21
    }
  ],
  "location": "TasksStepDefinition.add_and(String,String)"
});
formatter.result({
  "duration": 1122715500,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cdiv name\u003d\"type\" role\u003d\"listbox\" aria-expanded\u003d\"false\" class\u003d\"ui selection dropdown\" tabindex\u003d\"0\"\u003e...\u003c/div\u003e is not clickable at point (997, 51). Other element would receive the click: \u003cdiv class\u003d\"ui secondary pointing menu header-title page-header\" id\u003d\"dashboard-toolbar\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d83.0.4103.116)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-5UR6993\u0027, ip: \u002710.0.0.103\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\vkinb\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:58193}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 16acdd4a7bfe8791b320256c3323f3f7\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat com.pages.TasksPage.selectType(TasksPage.java:126)\r\n\tat com.stepdefinition.TasksStepDefinition.add_and(TasksStepDefinition.java:65)\r\n\tat ✽.Then add \"Complaint\" and \"high\"(src/test/resources/Features/taskpage.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TasksStepDefinition.save_task()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TasksStepDefinition.take_Screenshot()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TasksStepDefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});