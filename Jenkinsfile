pipeline {
    agent any

    stages {
        stage('Build') {
            steps {                                
                sh '/home/jmesa/eclipse-workspace/realpe-authentication/make' 
                archiveArtifacts artifacts: '/home/jmesa/eclipse-workspace/realpe-authentication/**/target/*.jar', fingerprint: true                               
            }
        }
    }
}
