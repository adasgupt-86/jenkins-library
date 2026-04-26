def checkout() {
    echo "Hello, This is ${name} from devops team"
}
def build() {
    echo "Hello, This is ${name} from devops team"
    sh 'docker build -t nginx-jenkins .'
}
def deploy() {
    echo "Hello, This is ${name} from devops team"
}
