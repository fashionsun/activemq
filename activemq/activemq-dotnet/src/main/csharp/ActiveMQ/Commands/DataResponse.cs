/*
* Copyright 2006 The Apache Software Foundation or its licensors, as
* applicable.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

//
//  NOTE!: This file is autogenerated - do not modify!
//         if you need to make a change, please see the Groovy scripts in the
//         activemq-core module
//

using System;
using System.Collections;

using ActiveMQ.OpenWire;
using ActiveMQ.Commands;

namespace ActiveMQ.Commands
{
	/// <summary>
    ///  The ActiveMQ DataResponse Command
	/// </summary>
    public class DataResponse : Response
    {
        public const byte ID_DataResponse = 32;
    			
        DataStructure data;

		public override string ToString() {
            return GetType().Name + "["
                + " Data=" + Data
                + " ]";

		}
	


        public override byte GetDataStructureType() {
            return ID_DataResponse;
        }


        // Properties

        public DataStructure Data
        {
            get { return data; }
            set { this.data = value; }            
        }

    }
}
