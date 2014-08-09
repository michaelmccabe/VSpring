

package com.mic.apptest.vaadin;

import org.springframework.stereotype.Component;


@Component
public class InstanceService {

    private static int instanceId = 0;

    public InstanceService() {
        instanceId++;
    }

    public String getInstanceText() {
        return "TextLabelService instanceId: " + instanceId;
    }
}
