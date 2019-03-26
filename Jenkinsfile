
pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
              sh 'cd authentication-app/; mvn test'        
            }
        }
        stage('Build') {
            steps {
                retry(10) {                                                                
                    sh 'pwd'
                    sh 'ls'
                    sh 'cd authentication-module/; mvn clean package'                                        
                    sh 'cd authentication-app/; mvn clean package'
                    archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
                }
            }
        }
    }
    
    post {                
        always {
            echo 'This will always run'
            junit '**/*.xml'
        }
        success {
            echo 'This will run only if successful'            
            archiveArtifacts artifacts: '**/*.jar', fingerprint: true
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


/*
pipeline {
    agent {
        docker { image 'node:7-alpine' }
    }
    stages {
        stage('Test') {
            steps {
                sh 'node --version'
            }
        }
    }
}
*/

/*
pipeline {
    agent any

    environment {
        DISABLE_AUTH = 'true'
        DB_ENGINE    = 'sqlite'
    }

    stages {
        stage('Build') {
            steps {
                sh 'printenv'
            }
        }
    }
}
*/
