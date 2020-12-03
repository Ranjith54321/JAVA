#Advance java : 

	key points :
----------------------
		core-java 
		Advanve-java      these two words are not official words


   in java : (3 categories as per sun micro systems) :

   1.) J2SE (standared Edition)   -> Corejava,jdbc
   2.) J2EE (Enterprise Edition)  -> servelets, JSP, JSTL, xml, JPA, ETS, web_services
   3.) J2ME (Micro Edition)

   here advance java is :

   	-> small part of J2SE (jdbc)  + small part of J2EE (servelets, JSP, JSTL)

   --> Advance java is also based on technologies not frame works******

   	## Technologies   Vs   FrameWorks :
------------------------------------------
   	Technology is the base 

   1.)	Based on the Technology only Frame Works are developed

   ----------------------------------------------
   |	Technology  	|			FrameWorks	|
   |--------------------------------------------|
   |	JDBC 			|			Hibernate	|
   |					|						|
   |	Servelets 		|			strucs		|
   |					|						|
   | 	JSP 			|			JSF			|
   |					|						|
   |	ETS 			|			Spring		|
   |--------------------------------------------|

   2.) FrameWork supports all the features of technologies also it has Extra features it over comes  problems in Technologies

   3.) Respective to performence technologies are good 

   		bcoz of that products are build in product based companies by using technoloies like java jdbc ect, not bsed on frame work

   	4.) Frameworks are more felxible :

   			bcoz it has more API's but Technologies not have that much

   	5.) FrameWorks has More predefined support :

   		More predefined support  -> less coding 

   		less predefined support   ->  more coding


   ## Different types of Application's :

   1.) Standalone Application    .jar

   			Technologies ->J2SE
 
   2.) web Application           .war

   			Technologies -> servlets,JSP  FrameWorks -> strucs , JSF    

   3.) Enterprise Application   .ear

   			Technologies -> EJB FrameWork -> Spring

   4.) Distributed Application    .aar

   			Technologies -> RMS, web.servers 

   5.) Mobile Application         .apk (for android)

   			Technologies -> android,ios,J2ME   


   	.jar  -> java Archieve file

   	.war  -> web Archieve file

   	.ear  -> enterprise Archieve file

   	.aar    -> application Archieve file

   	.apk    -> android 


   --> in advance java mainly based on servlets and JSP so it is based on WebApplication   [  --> .war  ]


   ## Standalone Application (also called destop / windows application's) :

   		1.) It is specific to particular machine

   		2.) No need of client server Architechture

   		3.) No need of internet connection

   		4.) it is developed using J2SE

   		5.) It contains main method **
   				so JVM will initiate the work

   		other 4 types of application's does not contain main method's**

   		client send's the request to webcontainser (here tomcat) then web container decides which serverlt it going to connect 
   			then servelt send the response in the form of xml or any other formate
   			here we basically use annotation's

   	## WebApplication's : 



   	   Client 									server 											DataBase
   	 1.)  send the request to server and       it contains project ,take request from 			 to store the data, it contains application data
   	   hold the response recieved from     the client, idntify the request , generate 		(or) project data (or) client data
   	   the server 								and process the response

   	 2.) eg: all the browser's 				eg : tomcat -> apache          						eg: mysql
   	   it send the request and get the  		 weblogic -> oracle 								oracle
   	   response

   	  3.) technologies and frameworks :

   	   html,css,javascript,angular,jsp,..    servlets,jsp,spring,jsf,php                        JDBC, Hibernate 

   	  4.) 3 type's of layer :
   	  		1.) presentation layer :
   	  			client side designing logic's
   	  		2.) Business layer :
   	  			server side functionality logic's
   	  		3.) presistance layer :
   	  			DataBase logic's and works

   	  JDBC :

   	  		provides connection between java Application to DataBase

   	  		mainly used for presistence logic

   	  		enables java application  to contaact with DataBase

   	 Servlets :

   	 		used to write programe at server side

   	 		servlets is an object excecuted at server side

   	 JSP :

   	 		used both client and server side

   	 JSTL :

   	 	 	It has some tag used inside JSP

   	 Spring MVC : (Model View Controller) :

   	 	it is an advanced version of strucs frameWork 

   	 	here,
   	 		servlets act as Controller 

   	 		JSP act as a View


   	## working with JDBC using musql :

   	 7 steps :  (we are using eclips here)

   	 	1.) import the package : --> import java.sql.*;

   	 	2.) a.) Load the driver [we need to add the driver in the src folder we download it from net .jar file]
   	 		b.) then register the driver  ->Class.forName("com.jdbc.Driver");// for mysql

   	 	3.) Establish connection 

   	 	4.) createstatement :(stypes of statements) :
   	 			1.) statement
   	 			2.) prepare-statement
   	 			3.) callable-statement (used for sharedprocedures)
   	 	5.) excecute the query
   	 	6.) process the query
   	 	7.) close [like close the connection and statements]   see Main.java on eclips


