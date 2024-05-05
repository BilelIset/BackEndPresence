pipeline {
    agent any
    stages {
        stage("Build") {
            steps {
                sh("docker-compose down")
                tool 'Maven 3.9.6'
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
