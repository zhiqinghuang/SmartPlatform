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
@Table(name = "BPM_CONF_LISTENER")
public class BpmConfListener implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private BpmConfNode bpmConfNode;
	private String value;
	private Integer type;
	private Integer status;
	private Integer priority;

	public BpmConfListener() {
	}

	public BpmConfListener(BpmConfNode bpmConfNode, String value, Integer type, Integer status, Integer priority) {
		this.bpmConfNode = bpmConfNode;
		this.value = value;
		this.type = type;
		this.status = status;
		this.priority = priority;
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

	@Column(name = "TYPE")
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Column(name = "STATUS")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "PRIORITY")
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}
}
//need to confirm