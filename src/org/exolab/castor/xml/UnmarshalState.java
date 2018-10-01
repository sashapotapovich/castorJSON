/**
 * Redistribution and use of this software and associated documentation
 * ("Software"), with or without modification, are permitted provided
 * that the following conditions are met:
 *
 * 1. Redistributions of source code must retain copyright
 *    statements and notices.  Redistributions must also contain a
 *    copy of this document.
 *
 * 2. Redistributions in binary form must reproduce the
 *    above copyright notice, this list of conditions and the
 *    following disclaimer in the documentation and/or other
 *    materials provided with the distribution.
 *
 * 3. The name "Exolab" must not be used to endorse or promote
 *    products derived from this Software without prior written
 *    permission of Intalio, Inc.  For written permission,
 *    please contact info@exolab.org.
 *
 * 4. Products derived from this Software may not be called "Exolab"
 *    nor may "Exolab" appear in their names without prior written
 *    permission of Intalio, Inc. Exolab is a registered
 *    trademark of Intalio, Inc.
 *
 * 5. Due credit should be given to the Exolab Project
 *    (http://www.exolab.org/).
 *
 * THIS SOFTWARE IS PROVIDED BY INTALIO, INC. AND CONTRIBUTORS
 * ``AS IS'' AND ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT
 * NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL
 * INTALIO, INC. OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * Copyright 1999-2004 (C) Intalio, Inc. All Rights Reserved.
 *
 * $Id: UnmarshalState.java 8145 2009-03-29 22:07:00Z rjoachim $
 */

package org.exolab.castor.xml;

import java.util.HashSet;

/**
 * The state information class for the UnmarshalHandler.
 * 
 * @author <a href="mailto:kvisco-at-intalio.com">Keith Visco</a>
 * @version $Revision: 8145 $ $Date: 2004-12-11 02:25:45 -0700 (Sat, 11 Dec 2004) $
 */
public class UnmarshalState {
    /** Holds on to Constructor arguments. */
    UnmarshalHandler.Arguments _args = null;
    
    /** Holds the current location path. */
    String _location = "";
    
    /** Indicates if the xsi:nil='true' attribute was present on the element. */
    boolean _nil = false;
    
    /** The xml element name of the current object. */
    String _elementName = null;

    /** Characters read in during unmarshalling. */
    StringBuffer _buffer = null;

    /** The key for the object. This may be null if no key
     *  or identity has been specified. */
    Object _key = null;
    
    /** The current that we are unmarshalling to. */
    Object _object = null;
    
    /** The class of the object, mainly used for primitives. */
    Class _type = null;

    /** The field descriptor for the Object. */
    XMLFieldDescriptor _fieldDesc = null;

    /** The class descriptor for the Object, in case
     *  FieldDescriptor#getClassDescriptor returns null. */
    XMLClassDescriptor _classDesc = null;

    /** Is the field a primitive or immutable type? */
    boolean _primitiveOrImmutable = false;

    /** The list of *used* field descriptors.
     * Note: Initialized upon demand, no need to create the list for primitive fields. */
    private HashSet _markedList = null;

    /** Is this a derived field? */
    boolean _derived = false;
    
    /** Is this a wrapper state? */
    boolean _wrapper = false;
    
    /** The whitespace preserve flag. */
    boolean _wsPreserve = false;
    
    boolean _trailingWhitespaceRemoved = false;
    
    /** Index of next expected sequence element; used during validation. */
    public int _expectedIndex = 0;
    
    /** Indicates (during validation) whether the current field descriptor 
     *  points to a multi-valued element. */
    public boolean _withinMultivaluedElement = false;
    
    /** The UnmarshalState which contains information about the parent object for object
     *  containted within this state. Used when handling element containers/wrappers. */
    UnmarshalState _targetState = null;
    
    /** A reference to the parent state. */
    UnmarshalState _parent = null;

    UnmarshalState() {
        super();
    }
    
    /**
     * Reinitializes all variables
     */
    void clear() {
        
        _args = null;
        _location = "";
        _elementName = null;
        _buffer = null;
        _key = null;
        _nil = false;
        _object = null;
        _type = null;
        _fieldDesc = null;
        _classDesc = null;
        _primitiveOrImmutable = false;
        if (_markedList != null) {
            _markedList.clear();
        }
        _derived = false;
        _wrapper = false;
        _targetState = null;
        _wsPreserve = false;
        _parent = null;
        _trailingWhitespaceRemoved = false;
    } //-- clear

    /**
     * Marks the given XMLFieldDescriptor as having been used.
     * 
     * @param descriptor the XMLFieldDescriptor to mark.
     */
    void markAsUsed(XMLFieldDescriptor descriptor) {
        if (_markedList == null) { _markedList = new HashSet(5); }
        _markedList.add(descriptor);
    }

    void markAsNotUsed(XMLFieldDescriptor descriptor) {
        if (_markedList == null) { return; }
        _markedList.remove(descriptor);
    }

    boolean isUsed(XMLFieldDescriptor descriptor) {
        if (_markedList == null) { return false; }
        return _markedList.contains(descriptor);
    }
}
