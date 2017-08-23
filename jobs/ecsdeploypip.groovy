pipelineJob("ecs-deploy-pipeline"){
    jdk('Java 8')
    scm {
        github('henrylian84/ecs-deploy', 'master')
    }
    steps {

    }
}