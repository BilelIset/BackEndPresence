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
echo("test skipped")            }
        }
        stage("Run") {
            steps {
                sh "docker-compose up --build"
            }
        }
    }
}
