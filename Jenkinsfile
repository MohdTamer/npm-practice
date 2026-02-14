def gv

pipeline {
    agent any

    parameters {
        choice(name: 'VERSION', choices: ['1.0.0', '2.0.0', '3.0.0'], description: 'Versions of the application to build and deploy')
        booleanParam(name: 'excuteTests', defaultValue: true, description: 'Whether to execute tests or not')
    }

    stages {
        stage("init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }

        stage("build") {
            steps {
                script {
                    gv.buildApp()
                }
            }
        }

        stage("test") {
            when {
                expression {
                    params.excuteTests == true
                }
            }
            steps {
                script {
                    gv.testApp()
                }
            }
        }

        stage("deploy") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}