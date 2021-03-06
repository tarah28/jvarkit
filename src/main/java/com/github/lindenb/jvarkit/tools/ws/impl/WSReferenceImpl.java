package com.github.lindenb.jvarkit.tools.ws.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.github.lindenb.jvarkit.tools.ws.WSReference;

@XmlRootElement(name=WSReferenceImpl.xmlName)
@XmlAccessorType(XmlAccessType.PROPERTY)
public class WSReferenceImpl implements WSReference
	{
	private static final long serialVersionUID = 1L;
	public static final String xmlName="reference";
	private String id;
	private String label;
	private String description;
	
	public WSReferenceImpl()
		{
		this(null,null,null);
		}
	
	public WSReferenceImpl(String id, String label, String description)
		{
		super();
		this.id = id;
		this.label = label;
		this.description = description;
		}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getLabel() {
		return label;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WSReferenceImpl other = (WSReferenceImpl) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "WSReferenceImpl [id=" + id + ", label=" + label
				+ ", description=" + description + "]";
	}
	
	}
