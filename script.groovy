def buildApp() {
    echo "Building project..."
    bat "npm install"
    bat "npm run build"
}

def testApp() {
    echo "Running tests..."
    bat "npm test"
}

def deployApp() {
    echo "Deploying application..."
    echo "Deploying version ${params.VERSION}"
}

return this