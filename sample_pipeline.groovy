pipeline {
    agent any

    stages {
        stage('pull') {
            steps {
                git branch: 'main', credentialsId: '92b8381e-6fbd-42eb-afc4-fa275426bc1c', url: 'https://github.com/Abhishekkanawade20/Jenkins.git'
                echo "hello"
            }
        }
         stage('build') {
            steps {
                echo 'build stage'
            }
        }
         stage('test') {
            steps {
                echo 'test stage'
            }
        }
         stage('deploy') {
            steps {
                echo 'deploy stage'
            }
        }
    }
}
