FROM jenkinsci/blueocean

ENV JAVA_OPTS="-Djenkins.install.runSetupWizard=false \
 -Dhudson.DNSMultiCast.disabled=true \
 -Dhudson.model.UpdateCenter.never=true \
 -Dhudson.model.UsageStatistics.disabled=true \
 -Djenkins.CLI.disabled=true"

# Use root to allow access to /var/run/docker.sock
# Alternative: Align user- and group-IDs between host and container to allow the Jenkins-user inside the container access to that file.
USER root

COPY --chown=jenkins:jenkins init.groovy.d/ /usr/share/jenkins/ref/init.groovy.d/
COPY --chown=jenkins:jenkins jenkins_home ${JENKINS_HOME}/
