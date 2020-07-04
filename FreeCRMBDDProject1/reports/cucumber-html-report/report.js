$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/task.feature");
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
  "name": "enter details \"\u003ctitle\u003e\" and \"\u003cdescription\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "add \"\u003ctype\u003e\" and \"\u003cpriority\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "save task",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "take Screenshot",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "to-test-the-task-page-in-crm;to-complete-the-task-page;",
  "rows": [
    {
      "cells": [
        "title",
        "description",
        "type",
        "priority"
      ],
      "line": 20,
      "id": "to-test-the-task-page-in-crm;to-complete-the-task-page;;1"
    },
    {
      "cells": [
        "CRM Title for Demo",
        "To check if the page works fine",
        "Complaint",
        "high"
      ],
      "line": 21,
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
  "duration": 7471954800,
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
  "duration": 370042300,
  "status": "passed"
});
formatter.match({
  "location": "TasksStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 176500800,
  "status": "passed"
});
formatter.match({
  "location": "TasksStepDefinition.click_navigate_to_task_page()"
});
formatter.result({
  "duration": 995296300,
  "status": "passed"
});
formatter.match({
  "location": "TasksStepDefinition.click_add_new_task()"
});
formatter.result({
  "duration": 194053700,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "To Complete the Task Page",
  "description": "",
  "id": "to-test-the-task-page-in-crm;to-complete-the-task-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "enter details \"CRM Title for Demo\" and \"To check if the page works fine\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "add \"Complaint\" and \"high\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "save task",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "take Screenshot",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "CRM Title for Demo",
      "offset": 15
    },
    {
      "val": "To check if the page works fine",
      "offset": 40
    }
  ],
  "location": "TasksStepDefinition.enter_details_and(String,String)"
});
formatter.result({
  "duration": 560499800,
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
  "duration": 139108300,
  "status": "passed"
});
formatter.match({
  "location": "TasksStepDefinition.save_task()"
});
formatter.result({
  "duration": 16900,
  "status": "passed"
});
formatter.match({
  "location": "TasksStepDefinition.take_Screenshot()"
});
formatter.result({
  "duration": 455707900,
  "status": "passed"
});
formatter.match({
  "location": "TasksStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 120230600,
  "status": "passed"
});
});