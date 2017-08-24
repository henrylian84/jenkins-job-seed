pipelineJob("springboot-demo-pipeline"){
    jdk('Java 8')

    definition{
        cpsScm{
            scm {
                github('henrylian84/springbootdemo', 'master')
                recursiveSubmodules(true)
            }
            scriptPath("deploy/Jenkinsfile")
        }
    }
    steps {

    }
}