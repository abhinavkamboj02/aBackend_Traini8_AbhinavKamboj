# aBackend_Traini8_AbhinavKamboj
1-> OPEN THE PROJECT IN INTELLIJ IDEA

2-> CONFIGURE THE DATABASE DETAILS IN application.properties FILE.
YOU CAN CONFIGURE BELOW THREE PROPERTIES AS PER YOUR DATABASE IN YOUR SYSTEM

spring.datasource.url

spring.datasource.username

spring.datasource.password

I HAVE USED PostgresSQL DATABASE,

3-> RUN THE PROJECT

4-> TO TEST APIs in POSTMAN

 4.1-> TO CREATE TRAINING CENTER

      Post Request

      URL-> http://localhost:8080/training-center/create
      Payload ->  
                 {
        "centerCode": "7892e0be7452",
        "centerName": "test name",
        "studentCapacity": 99,
        "coursesOffered": [
            "apple",
            "banana",
            "cherry",
            "date",
            "elderberry"
        ],
        "createdOn": "2024-10-03T06:20:43.091+00:00",
        "contactEmail": "test@gmail.com",
        "contactPhone": "9999999999",
        "address": {
            "detailedAddress": "test123",
            "city": "city1",
            "state": "UP",
            "pinCode": "247001"
        }
    }

4.2-> TO FETCH ALL TRAINING CENTERS FROM DATABASE

     GET REQUEST
     URL-> http://localhost:8080/training-center/get-all
4.3-> TO FETCH ALL TRAINING CENTERS FROM GIVEN CITY FROM DATABASE
    
     GET REQUEST
     URL-> http://localhost:8080/training-center/city
     Add query params in Param
     Key -> city
     value -> city name
     
     



