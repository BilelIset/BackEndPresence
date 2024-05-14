pipeline {
    agent any
    stages {
        stage("Build") {
            steps {
                tool 'Maven 3.6.3'
                sh "mvn clean install"
            }
        }
        stage("Test") {
            steps {
            sh 'mvn test'
            }
        }
        stage("Run") {
            steps {
                script {
                    sh "docker-compose up --build -d"
                }
            }
        }
    }
}
