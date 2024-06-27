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
                script {
                    if (params.RUN_LOGIN) {
                        sh 'mvn clean test -PLogin'
                    }
                }
            }
        }
        stage('Build and Test - Regression') {
            steps {
                script {
                    if (params.RUN_REGRESSION) {
                        sh 'mvn clean test -PRegression'
                    }
                }
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
