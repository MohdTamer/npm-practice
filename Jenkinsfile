pipeline {
    agent any

    stages {
        stage("build") {
            steps {
                echo "Building project..."
                sh "npm install"
                sh "npm run build"
            }
        }

        stage("test") {
            steps {
                echo "Running tests..."
                sh "npm test"
            }
        }

        stage("deploy") {
            steps {
                echo "Deploying application..."
            }
        }
    }
}