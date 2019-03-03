plugins {
	java
	id("org.spongepowered.plugin") version "0.9.0"
}

java {
	sourceCompatibility = JavaVersion.VERSION_1_8
	targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
	maven("https://repo.spongepowered.org/maven")
}

dependencies {
	compileOnly("org.spongepowered:spongeapi:7.1.0")
	annotationProcessor("org.spongepowered:spongeapi:7.1.0")
}

tasks.withType<Jar> {
	archiveBaseName.set(project.property("artifact") as String)
	archiveClassifier.set(project.name)
}

sponge {
	plugin {
		meta {
			id = project.property("artifact") as String
			name = project.property("plugin-name") as String
			version = project.version as String
			description = project.description as String
			url = project.property("url") as String
			authors = listOf(project.property("author") as String)
		}
	}
}
