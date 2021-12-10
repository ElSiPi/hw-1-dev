pipeline {
    agent any
    stages{
        stage("Build") {
            steps {
                git branch: 'main', url: 'https://github.com/ElSiPi/hw-1-dev.git'
                withMaven{
                bat "mvn clean compile"

    }
            }
        }
    }
}
