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
                    recursiveSubmodules()
                }
            }
            scriptPath("deploy/Jenkinsfile")
        }
    }
    steps {

    }
}