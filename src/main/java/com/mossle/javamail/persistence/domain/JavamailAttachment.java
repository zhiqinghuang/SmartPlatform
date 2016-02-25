package com.mossle.javamail.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JAVAMAIL_ATTACHMENT")
public class JavamailAttachment implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private JavamailMessage javamailMessage;
	private String name;
	private String ref;
	private String type;

	public JavamailAttachment() {
	}

	public JavamailAttachment(JavamailMessage javamailMessage, String name, String ref, String type) {
		this.javamailMessage = javamailMessage;
		this.name = name;
		this.ref = ref;
		this.type = type;
	}

	@Id
	@GeneratedValue
	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MESSAGE_ID")
	public JavamailMessage getJavamailMessage() {
		return this.javamailMessage;
	}

	public void setJavamailMessage(JavamailMessage javamailMessage) {
		this.javamailMessage = javamailMessage;
	}

	@Column(name = "NAME", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "REF", length = 200)
	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	@Column(name = "TYPE", length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
//need to confirm