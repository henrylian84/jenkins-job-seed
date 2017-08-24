pipelineJob("springboot-demo-pipeline"){
    jdk('Java 8')

    definition{
        cpsScm{
            scm {
                github('henrylian84/springbootdemo', 'master')
            }
            scriptPath("deploy/Jenkinsfile")
        }
    }
    steps {

    }
}