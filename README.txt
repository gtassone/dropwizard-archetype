This Maven archetype generates the simplest DropWizard (version 0.8.3) application possible. 

It includes only the components necessary to startup successfully, which should work right out of the box.

Usage
-----
cd dropwizard-archetype
mvn clean install
cd ..
mvn archetype:generate
-> choose the archetype # for 
local -> com.gmail.gtassone:dropwizard-archetype (Maven Archetype for generating Dropwizard projects.)
(should be the last one in the list)
OR 
mvn archetype:generate -DarchetypeGroupId=com.gmail.gtassone -DarchetypeArtifactId=dropwizard-archetype

-> answer the prompts e.g.
Define value for property 'groupId': : com.addthis.tyrell
Define value for property 'artifactId': : emptyDrop
Define value for property 'version':  1.0-SNAPSHOT: :
Define value for property 'package':  com.addthis.tyrell: :
Define value for property 'applicationClass':  : : EmptyDropwizardApplication
Define value for property 'applicationName':  : : Empty
Define value for property 'configClass':  : : EmptyDropwizardConfig
Define value for property 'projectName':  : : Empty DropWizard
Define value for property 'resourceClass':  : : EmptyRESTResource
Define value for property 'resourceMethod':  : : get
Define value for property 'resourcePath':  : : endpoint

cd emptyDrop
mvn clean package
java -jar target/emptyDrop.jar server conf/conf.yaml