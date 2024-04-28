// SonarQubeUtils.groovy

def callSonarQubeScanner(String projectName, String projectKey) {
    // Call SonarQube scanner
    withSonarQubeEnv('SonarQube') {
        sh "mvn sonar:sonar -Dsonar.projectKey=${projectKey} -Dsonar.projectName=${projectName}"
    }
}
