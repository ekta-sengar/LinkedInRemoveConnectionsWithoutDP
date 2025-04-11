pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git url: 'https://github.com/ektasengardocuments/LinkedInRemoveConnectionsWithoutDP.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                echo 'Building...'
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                echo 'Running Tests...'
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // Add deploy steps if any
            }
        }
    }
}
