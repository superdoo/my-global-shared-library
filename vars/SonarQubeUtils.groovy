// SonarQubeUtils.groovy

def callSonarQubeScanner(String projectName, String projectKey) {
     //Call SonarQube scanner
       withSonarQubeEnv('sonarqube-server') {
       sh "sonar:sonarscanner -Dsonar.projectKey=${projectKey} -Dsonar.projectName=${projectName}"
    }




}




 //sonarqube-server