def call(String mavenGoal){
  
  if ("${mavenGoal}" == "Clean")
     {
       sh "/var/lib/jenkins/tools/hudson.tasks.Maven_MavenInstallation/Maven3.8.4/bin/mvn clean"
     }
  else if ("${mavenGoal}" == "Compile")
     {
       sh "/var/lib/jenkins/tools/hudson.tasks.Maven_MavenInstallation/Maven3.8.4/bin/mvn clean compile"
     }
  else if ("${mavenGoal}" == "Test")
     {
       sh "/var/lib/jenkins/tools/hudson.tasks.Maven_MavenInstallation/Maven3.8.4/bin/mvn clean test"
     }
   else if ("${mavenGoal}" == "Package")
      {
        sh "/var/lib/jenkins/tools/hudson.tasks.Maven_MavenInstallation/Maven3.8.4/bin/mvn clean package"
     }
}
