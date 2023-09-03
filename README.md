# Sanjeeda_PathanRepo

Selenium Automation Project for Web Testing
This project is an example of Selenium automation testing for a web application. The project includes two assignments that demonstrate the automation of specific test scenarios using Selenium WebDriver and Java. The assignments involve navigating a website, interacting with web elements, and verifying expected behaviors.

**Assignment 1: Messaging and User Profiles**

Test Scenario
Navigate to the website and go to the "Career" section, then click on "Jobs."
Click on any job listing and send a message to a recommended user.
Navigate to your inbox and verify that the sent message is listed in your user's chat.
Visit User2's profile and print the names and company names displayed under "Others Similar to <User2>."

**Assignment 2: Career Paths**

Test Scenario
Navigate to the website and go to the "Career" section, then click on "Career Paths."
Select three career paths from the "Inspiration from You" section.
Store the names of the selected career paths in a collection.
Make sure option 3 is pre-selected in the "Career Stage" section.
Return to the homepage and refresh.
Verify that the "Recently viewed careers" list is reversed compared to step 2.

**Project Structure**

'src' directory contains the source code for the Selenium automation scripts.
'test' directory includes test cases and additional test scripts.
'drivers' directory stores web driver executable files.
'config' directory contains configuration files, if any.

**Usage**

To run the automation tests, follow these steps:
Clone this repository to your local machine.
Set up the necessary Selenium WebDriver and Java environment.
Run the test scripts located in the src directory.
The tests should execute, and the results will be displayed in the console.
Dependencies
This project relies on Selenium WebDriver and Java. You must have the necessary dependencies installed to run the tests successfully.

**Additional Notes**
The code uses custom XPaths for locating web elements.
CAPTCHA issues are manually handled with a 20-second wait to allow manual interaction.
Additional test cases can be added as needed for further validation.
