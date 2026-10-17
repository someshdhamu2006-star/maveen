
pipeline {
    agent any

    environment {
        DOCKER_IMAGE = 'somesh2404/java-weather-app:1.0'
        KUBECONFIG = 'C:\\Users\\LENOVO\\.kube\\config'
        PATH = "C:\\Users\\LENOVO\\AppData\\Local\\Programs\\DockerDesktop\\resources\\bin;${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build with Maven') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t %DOCKER_IMAGE% .'
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                bat 'kubectl apply -f deployment.yaml'
            }
        }
    }

    post {
        success {
            echo 'Java Maven build and Kubernetes deployment completed.'
        }
        failure {
            echo 'Pipeline failed. Check Console Output.'
        }
    }
}
