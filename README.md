JDK 1.8 and STS is reruired to build and run the application.

<b>Steps To run the application :</b>

Download the project from github.
Import this project in STS as existing maven project. 
Maven - update project.
Run as - Maven build... - Clean Install
SpringBootJspApplication.java - Run as Spring Boot App.
Application will start at port: 9091

<b>Description:</b>

'Date Difference' problem. 
It's a spring boot application.
<b>'Julian Day Number'</b> formula is used to calculate the number of days between given dates.
Have used Lambda expression and Functional Interface features of Java8.
Have written Junit test cases and used jstl & custom tags also on JSP pages. 
This solution has two pages:
1. 1st page collects two dates as string (in DD-MM-YYYY format) and displays the difference in Number of days after the page is submitted.
(URL for first page: <b>http://localhost:9091/solution/showDateForm</b>)
2. 2nd page displays all the date difference transactions done by user also displays a message using custom tag. 
(URL for second page: <b>http://localhost:9091/solution/showDataForm</b>)<br>
<b>Note:</b> This history of transactions is from H2 in memory DB and these transactions are saved in DB on first page submit.
