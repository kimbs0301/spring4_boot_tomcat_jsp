이클립스 VM arguments
-server -Xms256m -Xmx256m -XX:+UseG1GC -XX:+UnlockDiagnosticVMOptions -XX:InitiatingHeapOccupancyPercent=35 -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=local

이클립스 springloaded VM arguments
-server -Xms256m -Xmx256m -XX:+UseG1GC -XX:+UnlockDiagnosticVMOptions -XX:InitiatingHeapOccupancyPercent=35 -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=local -javaagent:file/springloaded-1.2.5.RELEASE.jar -noverify

로컬 테스트
java -server -Xms256m -Xmx256m -XX:+UseG1GC -XX:+UnlockDiagnosticVMOptions -XX:+G1SummarizeConcMark -XX:InitiatingHeapOccupancyPercent=35 -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=local -jar target/spring-0.0.1-SNAPSHOT.jar


cd /workspace/luna/spring4_boot_tomcat_jsp
git add -A
git commit -a -m "ok"
git push



Spring Boot 재기동 없이 개발하기(springloaded)
https://github.com/spring-projects/spring-loaded
