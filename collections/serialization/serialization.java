	in a single jvm (local machine)

	if you declare a method public then it can accessable by any programe vailable on that machine


	but we handle lots of data let's' think distributed Systems via network they have differnt machine 

				here simply public is not sufficient

			now assume yours is jvm1 and in network jvm2 is avilable


			jvm1  <-------------------------------file-----------------------------> jvm2

			jvm2 needs to read the data from jvm1 now we need to transfer the data through network

			so to send data through network , network only supports file formate 

			so , here we talk about two thinks 1.) serialization 2.) deserialization

			1.) serialization :

						 process of write the Object in the file 
								we need two classes 

								1.) (fos)  (file output stream)

								2.) (oos) Object output stream (oos)

			2.) deserialization :

						1.) process of read the Object in the file 

							we need two classes 

							1.) (fis)  (file output stream)

							2.) (ois) Object input stream (ois)

			if you want to protect some data from jvm2 then use transient modifer for the variables in jvm1
				if you use this in jvm2 default values for the variables only visible

				ex: for int ->0 and String -> null ect,.... 