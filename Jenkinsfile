pipeline {
    agent any
    
    tools {
        maven 'Maven' // Assumes Maven is installed and named 'Maven'
    }
    
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/username/repository.git', branch: 'main'
            }
        }
        stage('Build and Test - Login') {
            steps {
                sh 'mvn clean test -PLogin'
            }
        }
    }
    
    post {
        always {
            junit '**/target/surefire-reports/*.xml'
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
        }
        success {
            echo 'Build succeeded!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
