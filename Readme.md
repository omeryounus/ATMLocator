BackBase assigment task

Description:
Spring Web application based on JDK 1.8 and standard servlet and JSP spec. Used apache camel to expose rest API to be used in JSP pages to find ATMs. A JSP page is used to render list of ATMs in dynamically populated datatable using jquery.

Web application URL:
http://localhost:8080/FindATMmodule

Camel service:

List of all ATMs
http://localhost:8080/FindATMmodule/camel/atm

Find ATM by name
http://localhost:8080/FindATMmodule/camel/atm/city/name

Tools used :
Maven
JDK 8
Spring 4
Tomcat 7
Netbeans 8.0.2


Deployment steps:

1- clone the repo
2- mvn clean install will create a war file name findATMModule.war under $user_dir\FindATM\FindATMmodule\target
3- Deploy to Tomcat 7
4- Access the application at: http://localhost:8080/FindATMmodule`

