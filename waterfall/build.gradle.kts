plugins {
	id("net.minecrell.plugin-yml.bungee") version "0.3.0"
}

repositories {
	maven("https://papermc.io/repo/repository/maven-public")
}

dependencies {
	compileOnly("io.github.waterfallmc:waterfall-api:1.13-SNAPSHOT")
}

bungee {
	name = project.property("plugin-name") as String
	main = "pl.pitcer.incognitoserver.IncognitoServerPlugin"
}
