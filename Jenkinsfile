pipeline {
    agent {
        label any
    }

    stages {

        stage('Analise ao código .java') {
                     environment { scannerHome = tool 'sonarscanner' }
            steps {
                withSonarQubeEnv ('sonarqube') {
                    sh "${scannerHome}/bin/sonar-scanner \
                    -D sonar.host.url=http://sonar:9000/ \
                    -D sonar.sources=src/main/java \
                    -D sonar.login=fbbd769f0a8c732756797f4f18e8ba8fe30e562d \
                    -D sonar.projectKey=calculadora \
                    -D sonar.java.source=11 "
                    }
                    timeout(time: 10, unit: 'MINUTES') {
                        waitForQualityGate abortPipeline: true
        }
    }
}
    }
}