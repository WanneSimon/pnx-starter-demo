%It is recommended for you to use "java -jar  StarterDemo-1.0-SNAPSHOT.jar", If you run on your development-machine %
@ecoh This must be place with StarterDemo-1.0-SNAPSHOT.jar

@echo "Starting ..."
@echo "Downloading libraries from maven repository, it may takes a few minutes. You can also place libraries into repository."
java -Dthin.root=. -jar  StarterDemo-1.0-SNAPSHOT.jar
PAUSE