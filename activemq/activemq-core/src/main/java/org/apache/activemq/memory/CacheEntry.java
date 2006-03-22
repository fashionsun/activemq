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
package org.apache.activemq.memory;

public class CacheEntry {
    
    public final Object key;    
    public final Object value;
    
    public CacheEntry next;
    public CacheEntry previous;
    public CacheEntryList owner;
    
    public CacheEntry(Object key, Object value) {
        this.key=key;
        this.value = value;
    }

    /**
     * 
     * @param entry
     * @return false if you are trying to remove the tail pointer.
     */
    public boolean remove() {
                
        // Cannot remove if this is a tail pointer.
        // Or not linked.
        if( owner==null || this.key==null || this.next==null )
            return false;
        
        synchronized( owner.tail ) {            
            this.next.previous = this.previous;
            this.previous.next = this.next;
            this.owner = null;
            this.next = this.previous = null;
        }
        
        return true;
    }

}