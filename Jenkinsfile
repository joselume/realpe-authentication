pipeline {
    agent any

    stages {
        stage('Build') {
            steps {                                                
                sh '/home/jmesa/eclipse-workspace/realpe-authentication/make'
                sh 'pwd'
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }        
    }
}
