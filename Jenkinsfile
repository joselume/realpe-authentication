pipeline {
    agent any

    stages {
        stage('Build') {
            steps {                                
                sh 'make' 
                archiveArtifacts artifacts: '/home/jmesa/eclipse-workspace/realpe-authentication/**/target/*.jar', fingerprint: true                               
            }
        }
    }
}
