pipeline {
    agent any

    stages {
        stage("build") {
            steps {
                echo "Building project..."
                bat "npm install"
                bat "npm run build"
            }
        }

        stage("test") {
            steps {
                echo "Running tests..."
                bat "npm test"
            }
        }

        stage("deploy") {
            steps {
                echo "Deploying application..."
            }
        }
    }
}