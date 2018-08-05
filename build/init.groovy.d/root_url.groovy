import hudson.model.*;
import jenkins.model.*;

def root_Url = System.getenv('JENKINS_BASE_URL')

Thread.start {
    if(root_Url) {
        jlc = JenkinsLocationConfiguration.get()
        jlc.setUrl(root_Url)
        jlc.save()
    }
}