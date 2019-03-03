plugins {
	id("net.minecrell.plugin-yml.bukkit") version "0.3.0"
}

repositories {
	maven("https://papermc.io/repo/repository/maven-public")
}

dependencies {
	compileOnly("com.destroystokyo.paper:paper-api:1.13.2-R0.1-SNAPSHOT")
}

bukkit {
	name = project.property("plugin-name") as String
	main = "pl.pitcer.incognitoserver.IncognitoServerPlugin"
	apiVersion = "1.13"
}
