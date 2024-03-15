pipeline {
    agent any

    stages {
        stage('Plan') {
            steps {
                echo 'Planing stage'
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
