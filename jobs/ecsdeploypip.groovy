pipelineJob("springboot-demo-pipeline"){
    jdk('Java 8')

    definition{
        cpsScm{
            scm {
                github('henrylian84/springbootdemo', 'master')
                configure { gitscm ->
                    gitscm / 'extensions' << 'hudson.plugins.git.extensions.impl.SubmoduleOption' {
                        recursiveSubmodules(true)
                    }
                }
            }
            scriptPath("deploy/Jenkinsfile")
        }
    }
    steps {

    }
}