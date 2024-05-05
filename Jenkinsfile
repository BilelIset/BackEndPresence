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
