pipeline {
    agent any

    stages {
        stage('Build') {
            steps {                                
                sh '/home/jmesa/eclipse-workspace/realpe-authentication/make' 
                echo '==================================='
                echo 'Directory before archiveArtifacts: '
                pwd()
                echo '==================================='
                archiveArtifacts artifacts: '/home/jmesa/eclipse-workspace/realpe-authentication/**/target/*.jar', fingerprint: true                               
            }
        }
    }
}
