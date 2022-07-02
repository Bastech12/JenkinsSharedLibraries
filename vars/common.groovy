def call(String stageName){
  
  if ("${stageName}" == "Build")
     {
       sh	"$MHD/bin/mvn clean package"
     }
  else if ("${stageName}" == "SonarQube Report")
     {
       sh	"$MHD/bin/mvn sonar:sonar"
     }
  else if ("${stageName}" == "Upload Into Nexus")
     {
       sh	"$MHD/bin/mvn deploy"
     }
}
