pipeline {
    agent any
    stages {
        stage("Build") {
            steps {
                tool 'Maven 3'
                sh "mvn clean install"
            }
        }
        stage("Test") {
            steps {
                sh "mvn test"
            }
        }
        stage("Run") {
            steps {
                sh "sudo docker-compose up --build"
            }
        }
    }
}
