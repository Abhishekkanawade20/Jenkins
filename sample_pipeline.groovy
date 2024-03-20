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
                sh '/opt/apache-maven-3.9.6/bin/mvn clean package'
                echo 'build stage'
            }
        }
         stage('test') {
            steps {
                /opt/apache-maven-3.9.6/bin/mvn sonar:sonar -Dsonar.projectKey=Calculator -Dsonar.host.url=http://13.126.235.162:9000 -Dsonar.login=62dabd732b94780b83e77bce03afa0e9ab5805b9
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
