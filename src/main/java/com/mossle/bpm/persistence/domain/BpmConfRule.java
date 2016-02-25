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
@Table(name = "BPM_CONF_RULE")
public class BpmConfRule implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private BpmConfNode bpmConfNode;
	private String value;

	public BpmConfRule() {
	}

	public BpmConfRule(BpmConfNode bpmConfNode, String value) {
		this.bpmConfNode = bpmConfNode;
		this.value = value;
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

	@Column(name = "VALUE", length = 200)
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
//need to confirm