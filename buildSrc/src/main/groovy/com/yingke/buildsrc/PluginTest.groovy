import org.gradle.api.Plugin
import org.gradle.api.Project


class PluginTest implements Plugin<Project> {


    @Override
    void apply(Project project) {
        println "==YingKePlugin is applied=="

        project.task("MyTask").doLast {
            println "MyTask doLast invoke..."
        }
    }
}