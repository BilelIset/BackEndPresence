pipeline {
    agent any
    stages {
        stage("Build") {
            steps {
                tool 'Maven 3'
                sh "/var/lib/jenkins/tools/hudson.tasks.Maven_MavenInstallation/Maven_3/mvn clean install"
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
