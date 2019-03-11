pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh '/home/jmesa/eclipse-workspace/make' 
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true 
            }
        }
    }
}
