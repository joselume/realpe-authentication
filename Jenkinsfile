pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh '/home/jmesa/eclipse-workspace/realpe-authentication/make' 
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true 
            }
        }
    }
}
