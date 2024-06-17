pipeline{
agent any
stages{
stage "build"{
sh("mvn clean install")

}stage "test"{
sh("mvn test")
}stage "run"{
sh("sudo docker-compose up --build")
}

}}