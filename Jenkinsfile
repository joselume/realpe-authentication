pipeline {
    agent any

    stages {
        stage('Build') {
            steps {                                
                sh 'cd /home/jmesa/eclipse-workspace/realpe-authentication'
                sh 'make'
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }        
    }
}
