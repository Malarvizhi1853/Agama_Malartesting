Feature: To Test the Task Page in CRM


Background: User is logged into CRM
Given user is on free crm login page
When user enters email "malarinbox@gmail.com" and password "Figo@2020"
And user clicks on login button
Then click navigate to task page
Then click add new task


Scenario Outline: To Complete the Task Page
Then enter details "<title>" and "<description>" 
Then add "<type>" and "<priority>"
Then save task
Then take Screenshot
Then close the browser

Examples:
|title|description|type|priority|
|CRM Title for Demo|To check if the page works fine|Complaint|high|