plugins {
	java
	id("net.minecrell.plugin-yml.bungee") version "0.3.0"
}

java {
	sourceCompatibility = JavaVersion.VERSION_11
}

repositories {
	maven("https://papermc.io/repo/repository/maven-public")
}

dependencies {
	compileOnly("io.github.waterfallmc:waterfall-api:1.13-SNAPSHOT")
}

tasks.withType<Jar> {
	archiveBaseName.set(project.property("artifact") as String)
	archiveClassifier.set(project.name)
}

bungee {
	name = project.property("plugin-name") as String
	main = "pl.pitcer.incognitoserver.IncognitoServerPlugin"
}
