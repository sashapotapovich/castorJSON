/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.0.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.exolab.castor.mapping.xml.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.mapping.xml.BindXml;

/**
 * Class BindXmlDescriptor.
 * 
 * @version $Revision$ $Date$
 */
public class BindXmlDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _elementDefinition.
     */
    private boolean _elementDefinition;

    /**
     * Field _nsPrefix.
     */
    private String _nsPrefix;

    /**
     * Field _nsURI.
     */
    private String _nsURI;

    /**
     * Field _xmlName.
     */
    private String _xmlName;

    /**
     * Field _identity.
     */
    private org.exolab.castor.xml.XMLFieldDescriptor _identity;


      //----------------/
     //- Constructors -/
    //----------------/

    public BindXmlDescriptor() {
        super();
        _nsURI = "http://castor.exolab.org/";
        _xmlName = "bind-xml";
        _elementDefinition = true;

        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors

        //-- _name
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(String.class, "_name", "name", org.exolab.castor.xml.NodeType.Attribute);
        desc.setSchemaType("QName");
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public Object getValue( Object object ) 
                throws IllegalStateException
            {
                BindXml target = (BindXml) object;
                return target.getName();
            }
            @Override
            public void setValue( Object object, Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    BindXml target = (BindXml) object;
                    target.setName( (String) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public Object newInstance(Object parent) {
                return new String();
            }
        };
        desc.setSchemaType("QName");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _name
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.NameValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.NameValidator(
                org.exolab.castor.xml.XMLConstants.NAME_TYPE_QNAME);
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _type
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(String.class, "_type", "type", org.exolab.castor.xml.NodeType.Attribute);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public Object getValue( Object object ) 
                throws IllegalStateException
            {
                BindXml target = (BindXml) object;
                return target.getType();
            }
            @Override
            public void setValue( Object object, Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    BindXml target = (BindXml) object;
                    target.setType( (String) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public Object newInstance(Object parent) {
                return new String();
            }
        };
        desc.setSchemaType("NMTOKEN");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _type
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.NameValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.NameValidator(
                org.exolab.castor.xml.XMLConstants.NAME_TYPE_NMTOKEN);
            fieldValidator.setValidator(typeValidator);
            typeValidator.addPattern("[\\w-._:]+");
        }
        desc.setValidator(fieldValidator);
        //-- _autoNaming
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.exolab.castor.mapping.xml.types.BindXmlAutoNamingType.class, "_autoNaming", "auto-naming", org.exolab.castor.xml.NodeType.Attribute);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public Object getValue( Object object ) 
                throws IllegalStateException
            {
                BindXml target = (BindXml) object;
                return target.getAutoNaming();
            }
            @Override
            public void setValue( Object object, Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    BindXml target = (BindXml) object;
                    target.setAutoNaming( (org.exolab.castor.mapping.xml.types.BindXmlAutoNamingType) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public Object newInstance(Object parent) {
                return null;
            }
        };
        handler = new org.exolab.castor.xml.handlers.EnumFieldHandler(org.exolab.castor.mapping.xml.types.BindXmlAutoNamingType.class, handler);
        desc.setImmutable(true);
        desc.setSchemaType("BindXmlAutoNamingType");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _autoNaming
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _location
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(String.class, "_location", "location", org.exolab.castor.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public Object getValue( Object object ) 
                throws IllegalStateException
            {
                BindXml target = (BindXml) object;
                return target.getLocation();
            }
            @Override
            public void setValue( Object object, Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    BindXml target = (BindXml) object;
                    target.setLocation( (String) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public Object newInstance(Object parent) {
                return null;
            }
        };
        desc.setSchemaType("string");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _location
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _matches
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(String.class, "_matches", "matches", org.exolab.castor.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public Object getValue( Object object ) 
                throws IllegalStateException
            {
                BindXml target = (BindXml) object;
                return target.getMatches();
            }
            @Override
            public void setValue( Object object, Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    BindXml target = (BindXml) object;
                    target.setMatches( (String) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public Object newInstance(Object parent) {
                return null;
            }
        };
        desc.setSchemaType("string");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _matches
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _reference
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(Boolean.TYPE, "_reference", "reference", org.exolab.castor.xml.NodeType.Attribute);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public Object getValue( Object object ) 
                throws IllegalStateException
            {
                BindXml target = (BindXml) object;
                if (!target.hasReference()) { return null; }
                return (target.getReference() ? Boolean.TRUE : Boolean.FALSE);
            }
            @Override
            public void setValue( Object object, Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    BindXml target = (BindXml) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteReference();
                        return;
                    }
                    target.setReference( ((Boolean) value).booleanValue());
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public Object newInstance(Object parent) {
                return null;
            }
        };
        desc.setSchemaType("boolean");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _reference
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.BooleanValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.BooleanValidator();
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _node
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.exolab.castor.mapping.xml.types.BindXmlNodeType.class, "_node", "node", org.exolab.castor.xml.NodeType.Attribute);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public Object getValue( Object object ) 
                throws IllegalStateException
            {
                BindXml target = (BindXml) object;
                return target.getNode();
            }
            @Override
            public void setValue( Object object, Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    BindXml target = (BindXml) object;
                    target.setNode( (org.exolab.castor.mapping.xml.types.BindXmlNodeType) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public Object newInstance(Object parent) {
                return null;
            }
        };
        handler = new org.exolab.castor.xml.handlers.EnumFieldHandler(org.exolab.castor.mapping.xml.types.BindXmlNodeType.class, handler);
        desc.setImmutable(true);
        desc.setSchemaType("BindXmlNodeType");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _node
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _QNamePrefix
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(String.class, "_QNamePrefix", "QName-prefix", org.exolab.castor.xml.NodeType.Attribute);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public Object getValue( Object object ) 
                throws IllegalStateException
            {
                BindXml target = (BindXml) object;
                return target.getQNamePrefix();
            }
            @Override
            public void setValue( Object object, Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    BindXml target = (BindXml) object;
                    target.setQNamePrefix( (String) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public Object newInstance(Object parent) {
                return new String();
            }
        };
        desc.setSchemaType("NMTOKEN");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _QNamePrefix
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.NameValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.NameValidator(
                org.exolab.castor.xml.XMLConstants.NAME_TYPE_NMTOKEN);
            fieldValidator.setValidator(typeValidator);
            typeValidator.addPattern("[\\w-._:]+");
        }
        desc.setValidator(fieldValidator);
        //-- _transient
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(Boolean.TYPE, "_transient", "transient", org.exolab.castor.xml.NodeType.Attribute);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public Object getValue( Object object ) 
                throws IllegalStateException
            {
                BindXml target = (BindXml) object;
                if (!target.hasTransient()) { return null; }
                return (target.getTransient() ? Boolean.TRUE : Boolean.FALSE);
            }
            @Override
            public void setValue( Object object, Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    BindXml target = (BindXml) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteTransient();
                        return;
                    }
                    target.setTransient( ((Boolean) value).booleanValue());
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public Object newInstance(Object parent) {
                return null;
            }
        };
        desc.setSchemaType("boolean");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _transient
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.BooleanValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.BooleanValidator();
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- initialize element descriptors

        //-- _classMapping
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.exolab.castor.mapping.xml.ClassMapping.class, "_classMapping", "class", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public Object getValue( Object object ) 
                throws IllegalStateException
            {
                BindXml target = (BindXml) object;
                return target.getClassMapping();
            }
            @Override
            public void setValue( Object object, Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    BindXml target = (BindXml) object;
                    target.setClassMapping( (org.exolab.castor.mapping.xml.ClassMapping) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public Object newInstance(Object parent) {
                return null;
            }
        };
        desc.setSchemaType("org.exolab.castor.mapping.xml.ClassMapping");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://castor.exolab.org/");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _classMapping
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _propertyList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.exolab.castor.mapping.xml.Property.class, "_propertyList", "property", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public Object getValue( Object object ) 
                throws IllegalStateException
            {
                BindXml target = (BindXml) object;
                return target.getProperty();
            }
            @Override
            public void setValue( Object object, Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    BindXml target = (BindXml) object;
                    target.addProperty( (org.exolab.castor.mapping.xml.Property) value);
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    BindXml target = (BindXml) object;
                    target.removeAllProperty();
                } catch (Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public Object newInstance(Object parent) {
                return null;
            }
        };
        desc.setSchemaType("list");
        desc.setComponentType("org.exolab.castor.mapping.xml.Property");
        desc.setHandler(handler);
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _propertyList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method getAccessMode.
     * 
     * @return the access mode specified for this class.
     */
    @Override()
    public org.exolab.castor.mapping.AccessMode getAccessMode(
    ) {
        return null;
    }

    /**
     * Method getIdentity.
     * 
     * @return the identity field, null if this class has no
     * identity.
     */
    @Override()
    public org.exolab.castor.mapping.FieldDescriptor getIdentity(
    ) {
        return _identity;
    }

    /**
     * Method getJavaClass.
     * 
     * @return the Java class represented by this descriptor.
     */
    @Override()
    public Class getJavaClass(
    ) {
        return org.exolab.castor.mapping.xml.BindXml.class;
    }

    /**
     * Method getNameSpacePrefix.
     * 
     * @return the namespace prefix to use when marshaling as XML.
     */
    @Override()
    public String getNameSpacePrefix(
    ) {
        return _nsPrefix;
    }

    /**
     * Method getNameSpaceURI.
     * 
     * @return the namespace URI used when marshaling and
     * unmarshaling as XML.
     */
    @Override()
    public String getNameSpaceURI(
    ) {
        return _nsURI;
    }

    /**
     * Method getValidator.
     * 
     * @return a specific validator for the class described by this
     * ClassDescriptor.
     */
    @Override()
    public org.exolab.castor.xml.TypeValidator getValidator(
    ) {
        return this;
    }

    /**
     * Method getXMLName.
     * 
     * @return the XML Name for the Class being described.
     */
    @Override()
    public String getXMLName(
    ) {
        return _xmlName;
    }

    /**
     * Method isElementDefinition.
     * 
     * @return true if XML schema definition of this Class is that
     * of a global
     * element or element with anonymous type definition.
     */
    public boolean isElementDefinition(
    ) {
        return _elementDefinition;
    }

}