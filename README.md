# Test system by starting this spring-boot application with different profile

    mvn spring-boot:run -Dspring-boot.run.profiles={profile}

With followed profiles: default, local, test. The system will write out the log statement:

    NON-PROD message
 
With all others profiles, The system will write out:

    PROD message

## Please check the source code for more detail.