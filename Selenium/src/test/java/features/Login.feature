Feature: Login into LeafTaps application

Background:
Given open the chrome browser
And max the browser
And set the timeout
And load the url

Scenario Outline: TC002 Positive flow for create lead
And enter the username Demosalesmanager in the login page
And enter the password crmsfa in the login page
And click on the login button in the login page
And click on the crmsfa link in loginpage
Then verify whether the login is success
And click on the createlead in MyHomepage
And enter the companyname Cname in the login page
And enter the companyname Fname in the login page
And enter the companyname Lname in the login page
Examples:
|Cname|Fname|Lname|
|relx|James|peter|
|AMG|John|David|




Scenario: TC001 Login 
And enter the username Demosalesmanager in the login page
And enter the password crmsfa in the login page
And click on the login button in the login page
And click on the crmsfa link in loginpage
Then verify whether the login is success