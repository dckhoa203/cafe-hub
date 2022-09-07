# cafe-hub
You want to go to a cafe but don't know where to go. Let cafe hub support you. Ok let's go
## Architecture: [Domain Driven Design (DDD)](https://viblo.asia/p/gioi-thieu-design-pattern-domain-driven-design-ddd-Qbq5Q423lD8)
## LDM 
![LDM](https://user-images.githubusercontent.com/43290383/188680254-818902f4-e021-48cd-84bc-34fd688ba93a.png)
### Install
JAVA JDK: https://www.oracle.com/java/technologies/javase-downloads.html \
Intellij IDEA: https://www.jetbrains.com/idea/ \
Maven: https://maven.apache.org/download.cgi
## Run:
After the build is completed, look for the class *ApiApplication.java* and start to run.\
By default, the application will run on port 8080.\
Look for the class *Keys.APiPath.java*, this class contains all the api endpoints.\
Example: [GET] http://localhost:8080/v1/provinces

    .
    └───src
        ├───main
        │   ├───java
        │   │   └───com
        │   │       └───cafehub
        │   │           └───api
        │   │               │   ApiApplication.java       # Main class
        │   │               ├───config
        │   │               │       Keys.java             # Path
