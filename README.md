#Custom Business Event

This example shows how to track data using the custom business event component. 

####Example use case

Order data in JSON format is sent through an HTTP endpoint to a Ruby component. The custom code embedded with this component is used to calculate the discount that is offered for a certain product type. The Custom Business event keeps track of the item name, number of units and price per unit for the order data.

### Set up and run the example

1. Import the example project into your workspace

2. Sign in to https://aplicor2googleqa.qa.cloudhub.io/login.html

3. Export the project in your workspace to a zip file using File -> Export -> Mule -> Anypoint Studio Project to Mule Deployable Archive

4. Now add the example application in a deployable zip format to cloudhub.io.

5. Click on **Start Application** from the Deployment tab to deploy your application on cloudhiub. 

6. In the Settings tab enable Metadata and Replay and then save teh changes

7. Use Postman to make a POST request using JSON to http://<your domain>.qa2.cloudhub.io:

       {
       "email": "aaa@abc.sk", 
       "item name": "shoes", 
       "item units": 2, 
       "item price per unit": 10,
       "membership": "free"
       }

    The response body should contain price per unit with the applied discount (-15% for shoes):

8. Go to your cloudhub.io account and click on the Insight tab in the left panel to see that your custom business event was logged.

### Go further
 
* Check out the documentation [here](http://www.mulesoft.org/documentation/display/current/Business+Events)
