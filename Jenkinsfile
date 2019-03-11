pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                cd '/home/jmesa/eclipse-workspace/realpe-authentication/'
                sh 'make' 
                pwd()
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true 
            }
        }
    }
}
