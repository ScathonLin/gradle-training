package pers.scathon.gradle.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * @author scathonlin
 * @date 2022/5/29 22:03
 */
public class HelloPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        System.out.println("Message from hello plugin!");
    }
}
