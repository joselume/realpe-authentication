pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                
                dir('/home/jmesa/eclipse-workspace/realpe-authentication/') {
                    sh 'make' 
                    archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true 
                }                
            }
        }
    }
}
