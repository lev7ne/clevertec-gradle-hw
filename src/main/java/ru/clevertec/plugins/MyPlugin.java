package ru.clevertec.plugins;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.testing.jacoco.plugins.JacocoPlugin;
import ru.clevertec.tasks.MyTask;


public class MyPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.getPlugins().apply(JacocoPlugin.class);

        project.getTasks().create("runTestsAndGenerateJacocoReport", MyTask.class, task -> {
            task.setGroup("verification");
            task.setDescription("Runs tests and generates a Jacoco coverage report.");
        });
    }

}
