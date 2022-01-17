1. create web project using maven
2. package groupId.artifactId
3. use artifactId for component search
4. in web.xml
	use servlet >> init-param >> contextConfigLocation = /WEB-INF/servlet-spring.xml
5. in servlet-spring.xml
	context:component-scan base-package="artifactIds"
	mvc:annotation-driven