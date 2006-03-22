/**
 *
 * Copyright 2005-2006 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.openwire.v1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.apache.activemq.openwire.*;
import org.apache.activemq.command.*;


/**
 * Test case for the OpenWire marshalling for JournalQueueAck
 *
 *
 * NOTE!: This file is auto generated - do not modify!
 *        if you need to make a change, please see the modify the groovy scripts in the
 *        under src/gram/script and then use maven openwire:generate to regenerate 
 *        this file.
 *
 * @version $Revision$
 */
public class JournalQueueAckTest extends DataFileGeneratorTestSupport {


    public static JournalQueueAckTest SINGLETON = new JournalQueueAckTest();

    public Object createObject() throws Exception {
    		JournalQueueAck info = new JournalQueueAck();
    		populateObject(info);
    		return info;
    }

    
    protected void populateObject(Object object) throws Exception {
    		super.populateObject(object);
    		JournalQueueAck info = (JournalQueueAck) object;
        info.setDestination(createActiveMQDestination("Destination:1"));
        info.setMessageAck(createMessageAck("MessageAck:2"));

            }
        }
