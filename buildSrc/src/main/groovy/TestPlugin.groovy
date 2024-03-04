import org.gradle.api.Plugin
import org.gradle.api.Project
class TestPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        // 这里第一个参数名字就确定了 build.gradle 里面的闭包的名字
        def extension = project.extensions.create('testExtension', TestPluginExtension)
        project.task('pluginTest') {
            doLast {
                println extension.message
            }
        }
    }
}