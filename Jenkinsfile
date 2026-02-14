pipeline {
    agent any

    parameters {
        choice(name: 'VERSION', choices: ['1.0.0', '2.0.0', '3.0.0'], description: 'Versions of the application to build and deploy')
        booleanParam(name: 'excuteTests', defaultValue: true, description: 'Whether to execute tests or not')
    }

    stages {
        stage("build") {
            steps {
                echo "Building project..."
                bat "npm install"
                bat "npm run build"
            }
        }

        stage("test") {
            when {
                expression {
                    params.excuteTests == true
                }
            }
            steps {
                echo "Running tests..."
                bat "npm test"
            }
        }

        stage("deploy") {
            steps {
                echo "Deploying application..."
                echo "Deploying version ${params.VERSION}"
            }
        }
    }
}