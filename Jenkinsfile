pipeline{
    agent any
    stages{
        stage('SCM'){
            steps{
                echo 'fetching from the git!!!!!!!!!!'
                git changelog: false, poll: false, url: 'https://github.com/sandeep4358/productService.git'
            }
            
        }
        stage('Maven build'){
            steps{
                echo 'maven build'
                sh 'mvn clean install'
            }
            
        }
        stage('Docker Bild'){
            steps{
                echo 'Docker build'
                script{
                    withDockerRegistry(credentialsId: 'a77c722e-a2ea-45c3-b4e3-6100d91bcb67') {
                    // some block
                    sh 'docker image build -t sandeep022/productservice:tage234 .'
                    sh 'docker push sandeep022/productservice:tage234'
                }
                }
            }
            
        }
    }
}