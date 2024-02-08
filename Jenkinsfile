pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // TODO: Build stage
                sh './gradlew assemble'
            }
        }
        stage('Test') {
            steps {
                // TODO: Test stage
                sh './gradlew test'
            }
        }
        // Add more stages as needed
    }

    // Post-build actions can be added here
}

