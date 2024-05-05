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
                echo "Tests skipped"
            }
        }
        stage("Run") {
            steps {
                script {
                    // Démarrer les conteneurs Docker et récupérer leur ID
                    def dockerComposeOutput = sh script: "docker-compose up --build -d", returnStdout: true
                    def containerId = dockerComposeOutput.trim()

                    // Récupérer les journaux du conteneur Docker et les afficher dans la console Jenkins
                    sh "docker logs $containerId"
                }
            }
        }
    }
}
