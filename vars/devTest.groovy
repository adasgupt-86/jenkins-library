def checkout() {
    echo "Hello, This is ${name} from devops team"
}
def build() {
    echo "Hello, This is for Building the Docker-Image"
    sh 'docker build -t nginx-jenkins .'
}
def deploy() {
    echo "Hello, This is for Tagging and Pushing the Docker-Image into DOCKER-HUB"
    sh '''
        echo $DOCKER_LOGIN_PSW | docker login -u $DOCKER_LOGIN_USR --password-stdin
        '''
        sh 'docker --version'
        sh 'docker tag nginx-jenkins:latest adasgupt86/nginx-jenkins:v1'
        sh 'docker push adasgupt86/nginx-jenkins:v1'
}
