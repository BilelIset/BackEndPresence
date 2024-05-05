pipeline {
    agent any
    stages {
        stage("Build") {
            steps {
                tool 'Maven 3.9.6'
                sh "mvn clean install"
            }
        }
        stage("Test") {
            steps {
                echo ("test skipped")
            }
        }
        stage("Run") {
            steps {
            scipt{
            def dockerout= sh scipt:"docker-compose up --build",returnStdout:true
            def contid=dockerout.trim()
            sh"docker logs $contid"}
                sh " docker-compose up --build"
            }
        }
    }
}
