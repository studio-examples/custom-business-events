custom-business-events
===========

This example shows how to track important data using custom business events. Order in JSON format is sent via an HTTP endpoint to calculate a discount that is offered for the certain product type.

Step 1: sign in to https://aplicor2googleqa.qa.cloudhub.io/login.html
Step 2: export the project to zip format
Step 3: add application at cloudhub.io after logging in. 
Step 4: deploy the exported app in the Deployment tab and start it
Step 5: in the Settings tab enable Metadata and Replay and save it
Step 6: use postman to make a POST request using JSON to http://<your domain>.qa2.cloudhub.io:

{
 "email": "aaa@abc.sk", 
 "item name": "shoes", 
 "item units": 2, 
 "item price per unit": 10,
 "membership": "free"
}

the response body should contain price per unit with the applied discount (-15% for shoes):

8.5

go to your cloudhub.io account and click insights in the left panel. see that your custom business log was logged.