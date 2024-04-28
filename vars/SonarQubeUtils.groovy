// SonarQubeUtils.groovy

def callSonarQubeScanner(String projectName, String projectKey) {
     //Call SonarQube scanner
       withSonarQubeEnv('SonarQube') {
       sh "sonar:sonar -Dsonar.projectKey=${projectKey} -Dsonar.projectName=${projectName}"
    }




}




 //withSonarQubeEnv() {
 //     sh "${scannerHome}/bin/sonar-scanner"
 //   }