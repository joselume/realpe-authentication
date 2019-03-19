pipeline {
    agent any

    stages {
        stage('Build') {
            retry(10) {                                                                
                sh 'pwd'
                sh 'ls'
                // sh 'cd authentication-module/; mvn clean package'
                // Delete the next line and stay with the previous one
                sh 'cd ; mvn clean package'
                
                sh 'cd authentication-app/; mvn clean package'
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
            post {                
                always {
                    echo 'This will always run'
                }
                success {
                    echo 'This will run only if successful'
                }
                failure {
                    echo 'This will run only if failed'
                }
                unstable {
                    echo 'This will run only if the run was marked as unstable'
                }
                changed {
                    echo 'This will run only if the state of the Pipeline has changed'
                    echo 'For example, if the Pipeline was previously failing but is now successful'
                }                                                                
            }
        }        
    }
}
