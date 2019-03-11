pipeline {
    agent any

    stages {
        stage('Build') {
            steps {                                                                
                sh 'pwd'
                sh 'ls'
                sh 'cd authentication-module/ mvn clean package'
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }        
    }
}
