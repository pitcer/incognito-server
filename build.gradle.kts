plugins {
	java
}

defaultTasks("clean", "build")

subprojects {
	plugins.apply("java")

	java {
		sourceCompatibility = JavaVersion.VERSION_11
		targetCompatibility = JavaVersion.VERSION_11
	}

	tasks.withType<Jar> {
		archiveBaseName.set(project.property("artifact") as String)
		archiveClassifier.set(project.name)
	}
}

