
run:

  gradle build
  java  -jar build/libs/spring-boot-hello-jdbc-postgresql-0.2.0.jar



Ernads-iMac:libs hernad$ jar tvf spring-boot-hello-jdbc-postgresql-0.2.0.jar | grep lib
<pre>
     0 Fri Dec 05 10:59:16 CET 2014 lib/
  2152 Fri Dec 05 10:59:16 CET 2014 lib/spring-boot-starter-1.1.9.RELEASE.jar
424663 Fri Dec 05 10:59:16 CET 2014 lib/spring-jdbc-4.0.8.RELEASE.jar
594653 Fri Dec 05 10:59:16 CET 2014 lib/postgresql-9.2-1003-jdbc4.jar
334451 Fri Dec 05 10:59:16 CET 2014 lib/spring-boot-1.1.9.RELEASE.jar
348976 Fri Dec 05 10:59:16 CET 2014 lib/spring-boot-autoconfigure-1.1.9.RELEASE.jar
  2185 Fri Dec 05 10:59:16 CET 2014 lib/spring-boot-starter-logging-1.1.9.RELEASE.jar
978137 Fri Dec 05 10:59:16 CET 2014 lib/spring-core-4.0.8.RELEASE.jar
273449 Fri Dec 05 10:59:16 CET 2014 lib/snakeyaml-1.13.jar
671277 Fri Dec 05 10:59:16 CET 2014 lib/spring-beans-4.0.8.RELEASE.jar
248344 Fri Dec 05 10:59:16 CET 2014 lib/spring-tx-4.0.8.RELEASE.jar
979614 Fri Dec 05 10:59:16 CET 2014 lib/spring-context-4.0.8.RELEASE.jar
 16519 Fri Dec 05 10:59:16 CET 2014 lib/jcl-over-slf4j-1.7.7.jar
  4730 Fri Dec 05 10:59:16 CET 2014 lib/jul-to-slf4j-1.7.7.jar
 24220 Fri Dec 05 10:59:16 CET 2014 lib/log4j-over-slf4j-1.7.7.jar
270750 Fri Dec 05 10:59:16 CET 2014 lib/logback-classic-1.1.2.jar
 62050 Fri Dec 05 10:59:16 CET 2014 lib/commons-logging-1.1.3.jar
352832 Fri Dec 05 10:59:16 CET 2014 lib/spring-aop-4.0.8.RELEASE.jar
205369 Fri Dec 05 10:59:16 CET 2014 lib/spring-expression-4.0.8.RELEASE.jar
 29257 Fri Dec 05 10:59:16 CET 2014 lib/slf4j-api-1.7.7.jar
427729 Fri Dec 05 10:59:16 CET 2014 lib/logback-core-1.1.2.jar
  4467 Fri Dec 05 10:59:16 CET 2014 lib/aopalliance-1.0.jar
</pre>
