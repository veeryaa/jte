// Sample root Jenkinsfile for Jenkins Templating Engine (JTE)
// This example declares the pipeline directly in the root Jenkinsfile.
pipeline {
  agent any
  stages {
    stage('Hello World') {
      steps {
        echo 'Hello from declarative Jenkinsfile!'
        script {
          // Call a library step implemented in lib/helloLibrary/steps/helloLibrary.groovy
          helloLibrary()
        }
      }
    }
  }
}
