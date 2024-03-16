pipeline {
    agent any

    stages {
        stage ('pull') {
            steps {
                git branch: 'main', url: 'https://github.com/Abhishekkanawade20/Jenkins.git'
                echo "hello"
            }
        }
    }
}