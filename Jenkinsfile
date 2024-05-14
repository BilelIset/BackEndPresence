pipeline {
    agent any
    stages {

            stage("Checkout") {
                steps {

                    git branch: 'main',
                        credentialsId: '', // Laissez ceci vide pour utiliser le token d'accès personnel
                        url: 'https://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@github.com/BilelIset/BackEndPresence.git'
                }

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
