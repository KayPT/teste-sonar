pipeline {
    agent {
        label any
    }

    stages {

        stage('Analise ao código .java') {
                       environment { scannerHome = tool 'sonarscanner' }
                    steps {
                        withSonarQubeEnv('sonarqube') {
                        sh "${scannerHome}/bin/sonar-scanner \
                        -D sonar.host.url=http://sonar:9000/ \
                        -D sonar.login=fbbd769f0a8c732756797f4f18e8ba8fe30e562d \
                        -D sonar.projectKey=calculadora \
                        -D sonar.java.binaries=/home/jenkins/agent/workspace/calcsonar/ \
                        -D sonar.java.source=11 "
                    }
                }
            }
        }
    }