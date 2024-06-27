pipeline {
    agent any
    
    tools {
        // Define Maven tool installation
        maven 'Maven' // Make sure 'Maven' matches the name defined in Jenkins configuration
        jdk 'Java 18.0.2.1' // Define the specific JDK version
    }
    
    stages {
        stage('Checkout') {
            steps {
                // Replace with your actual Git repository URL and branch
                git url: 'https://github.com/QA-kaushal/SomanyUiAutomation.git', branch: 'master'
            }
        }
        stage('Build and Test - Login') {
            steps {
                script {
                    // Assuming you want to run only the 'Login' profile
                    sh 'mvn clean test -PLogin'
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
