pipeline {
	agent { label 'ci-x86-enc-u18.04-desktop-slave' }
	
	options {
		disableConcurrentBuilds()
	timeout(time: 20)
	timestamps()
	}
	
	stages {
	// ----  Checkout ----
		stage('Checkout') {
			steps {
			    script{
				def scmInfo = checkout scm
				echo "scm: ${scmInfo}"
			    }
			}
			}
			
			// -------------- Create a virtualenv --------------
			stage('Sleep') {
			steps{
			    script{
				echo "Before sleep"
				sleep(30)
				echo "After sleep"
			    }
			}
		}
	}
}
