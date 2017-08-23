pipelineJob("ecs-deploy-pipeline"){
    jdk('Java 8')

    definition{
        cpsScm{
            scm {
                github('henrylian84/ecs-deploy', 'master')
            }
            scriptPath("Jenkinsfile")
        }
    }
    steps {

    }
}