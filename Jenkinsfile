pipeline {
    agent any
    stages {
        stage("Build") {
            steps {
                sh("docker-compose down")

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
