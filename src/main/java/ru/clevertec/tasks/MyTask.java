package ru.clevertec.tasks;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;


public class MyTask extends DefaultTask {

    public MyTask() {
        dependsOn("test");
        dependsOn("jacocoTestReport");
    }

    @TaskAction
    public void runTestsAndGenerateJacocoReport() {
        getLogger().lifecycle("Running tests and generating JaCoCo report...");
    }

}