// SonarQubeUtils.groovy

def callSonarQubeScanner(String projectName, String projectKey) {
    // Call SonarQube scanner
    withSonarQubeEnv() {
      sh "${scannerHome}/bin/sonar-scanner"
    }
    //withSonarQubeEnv('SonarQube') {
      //  sh "mvn sonar:sonar -Dsonar.projectKey=${projectKey} -Dsonar.projectName=${projectName}"
    }




 //withSonarQubeEnv() {
 //     sh "${scannerHome}/bin/sonar-scanner"
 //   }