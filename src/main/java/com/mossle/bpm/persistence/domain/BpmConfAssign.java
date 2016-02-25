package com.mossle.bpm.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BPM_CONF_ASSIGN")
public class BpmConfAssign implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private BpmConfNode bpmConfNode;
	private String name;

	public BpmConfAssign() {
	}

	public BpmConfAssign(BpmConfNode bpmConfNode, String name) {
		this.bpmConfNode = bpmConfNode;
		this.name = name;
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
	@JoinColumn(name = "NODE_ID")
	public BpmConfNode getBpmConfNode() {
		return this.bpmConfNode;
	}

	public void setBpmConfNode(BpmConfNode bpmConfNode) {
		this.bpmConfNode = bpmConfNode;
	}

	@Column(name = "NAME", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
//need to confirm