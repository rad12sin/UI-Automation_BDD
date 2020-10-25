# UI-Automation_BDD
UI automation for  PAGANTIS QA ASSIGNMENT. Notes to install UI Automation BDD framework. Please follow below steps for running the automation suite.

Install the maven 3.6.3 and set the path in environment variable.
install java-1.8 and set the path in environment variable.
Install Git bash
Install any editor like Intellij, Eclipse etc.
Open your editor like intellij if you have opened other project already then close the project from File menu after than you will get intellij start page.
Click on Get from Version Control buton on intelliJ start page
In url paste the given url https://github.com/rad12sin/UI-Automation_BDD.git
select the directory where you want to clone the project.
Click on clone button
click on Eanble autom import dependency button on pop up right-down of the screen and make sure all the maven dependency of Pom file has been installed successfully.
Install the chromedriver.exe file and add in the same directory where you have saved the project.
Put the correct path of the feature files in TestRunner class
Run the TestRunner class using Junit
If you are getting the error like package or file not found then make the all directory as source root in intelliJ while using Project->Right Click->Mark Directory-> Source Root.
You can check the result in console as well as in both Json_Output->cucumber.json and junit_xml-> cucumber.xml.
