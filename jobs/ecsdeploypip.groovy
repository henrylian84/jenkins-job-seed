pipelineJob("springboot-demo-pipeline"){
    jdk('Java 8')

    definition{
        cpsScm{
            scm {
                git {
                    remote {
                        url("https://github.com/henrylian84/springbootdemo.git")
                    }
                    branch("master")
                    // All submodules recursively
                    configure { gitscm ->
                        gitscm / 'extensions' << 'hudson.plugins.git.extensions.impl.SubmoduleOption' {
                            recursiveSubmodules(true)
                        }
                    }
                }
            }
            scriptPath("deploy/Jenkinsfile")
        }
    }
    steps {

    }
}