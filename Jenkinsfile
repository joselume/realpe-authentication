pipeline {
    agent any

    stages {
        stage('Build') {
            steps {                                                                
                sh 'pwd'
                sh 'ls'
                sh 'make'
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }        
    }
}
