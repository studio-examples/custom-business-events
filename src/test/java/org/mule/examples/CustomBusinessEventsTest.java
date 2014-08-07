package org.mule.examples;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.mule.api.MuleMessage;
import org.mule.module.client.MuleClient;
import org.mule.tck.junit4.FunctionalTestCase;
import org.mule.transport.NullPayload;

public class CustomBusinessEventsTest extends FunctionalTestCase
{
	private static final String MESSAGE = "{\n \"email\": \"aaa@abc.sk\", \n \"item name\": \"shoes\", \n \"item units\": 2, \n \"item price per unit\": 10,\n \"membership\": \"free\"\n}";

    @Override
    protected String getConfigResources()
    {
        return "custom-business-events.xml";
    }

    @Test
    public void calculateDiscountTest() throws Exception
    {
        MuleClient client = new MuleClient(muleContext);
        Map<String, Object> props = new HashMap<String, Object>();
        props.put("http.method", "POST");
        MuleMessage result = client.send("http://localhost:8081/", MESSAGE, props);
        assertNotNull(result);
        assertFalse(result.getPayload() instanceof NullPayload);
        assertEquals("8.5", result.getPayloadAsString());
    }

}
