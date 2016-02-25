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
@Table(name = "BPM_CONF_COUNTERSIGN")
public class BpmConfCountersign implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private BpmConfNode bpmConfNode;
	private Integer sequential;
	private String participant;
	private Integer type;
	private Integer rate;

	public BpmConfCountersign() {
	}

	public BpmConfCountersign(BpmConfNode bpmConfNode, Integer sequential, String participant, Integer type, Integer rate) {
		this.bpmConfNode = bpmConfNode;
		this.sequential = sequential;
		this.participant = participant;
		this.type = type;
		this.rate = rate;
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

	@Column(name = "SEQUENTIAL")
	public Integer getSequential() {
		return this.sequential;
	}

	public void setSequential(Integer sequential) {
		this.sequential = sequential;
	}

	@Column(name = "PARTICIPANT", length = 200)
	public String getParticipant() {
		return this.participant;
	}

	public void setParticipant(String participant) {
		this.participant = participant;
	}

	@Column(name = "TYPE")
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Column(name = "RATE")
	public Integer getRate() {
		return this.rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}
}
//need to confirm