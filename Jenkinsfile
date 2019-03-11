pipeline {
    agent any

    stages {
        stage('Build') {
            steps {                                
                sh '/home/jmesa/eclipse-workspace/realpe-authentication/make' 
                echo 'Directory before archiveArtifacts: '
                pwd()
                archiveArtifacts artifacts: '/home/jmesa/eclipse-workspace/realpe-authentication/**/target/*.jar', fingerprint: true                               
            }
        }
    }
}
