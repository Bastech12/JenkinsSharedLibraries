def call(String mavenGoal){
  
  if ("${mavenGoal}" == "Clean")
     {
       sh "/home/ec2-user/ugo-node9/tools/hudson.tasks.Maven_MavenInstallation/Maven3.8.4/bin/mvn clean"
     }
  else if ("${mavenGoal}" == "Compile")
     {
       sh "/home/ec2-user/ugo-node9/tools/hudson.tasks.Maven_MavenInstallation/Maven3.8.4/bin/mvn clean compile"
     }
  else if ("${mavenGoal}" == "Test")
     {
       sh "/home/ec2-user/ugo-node9/tools/hudson.tasks.Maven_MavenInstallation/Maven3.8.4/bin/mvn clean test"
     }
   else if ("${mavenGoal}" == "Package")
      {
        sh "/var/lib/jenkins/tools/hudson.tasks.Maven_MavenInstallation/Maven3.8.4/bin/mvn clean package"
     }
}
