package pers.scathon.gradle.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * @author scathonlin
 * @date 2022/5/29 22:06
 */
public class GoodbyePlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        System.out.println("Message from goodbye plugin.");
    }
}
