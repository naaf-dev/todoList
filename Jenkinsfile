pipeline {
	agent any
	triggers {
	    pollSCM ('* * * * *')
	}
	stages {
		stage('Source') { // Get code
		 steps {
			 // get code from our Git repository
			 git credentialsId: 'github', url: 'https://github.com/naaf-dev/todoList.git'
		 	}
		 }
		 
		 stage('Build'){
		     
		     steps{
		         echo 'Hello Jenkins!'
		     }

		 }
	}
    
}