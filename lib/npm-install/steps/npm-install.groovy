// JTE library step: npm-install
// Installs npm dependencies using Jenkins-configured Node.js 18 tool
void call() {
  // Use Jenkins tool for Node.js 18 (configure 'nodejs-18' in Jenkins global tools)
  def nodeHome = tool 'nodejs-18'
  env.PATH = "${nodeHome}/bin:${env.PATH}"
  sh 'npm install'
}