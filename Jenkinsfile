// Jenkinsfile (Declarative Pipeline)
pipeline {
    agent any
    
    options {
        skipDefaultCheckout()
    }
    
    stages {
        stage('Checkout Source') {
            steps {
                git url: 'https://github.com/itzbhav/devops-app.git',
                    branch: 'main'
            }
        }
        
        stage('Build and Test') {
            steps {
                echo 'Starting Maven Build and Running Unit Tests'
                sh 'mvn clean package'
            }
        }
        
        stage('Quality Gates and Archival') {
            steps {
                echo 'Publishing Test Results and Archiving Artifacts'
                junit 'target/surefire-reports/*.xml'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
    
    post {
        always {
            echo 'Pipeline finished.'
        }
        success {
            echo 'CI Pipeline Succeeded!'
        }
        failure {
            echo 'CI Pipeline Failed due to Build or Test Failure.'
        }
    }
}
