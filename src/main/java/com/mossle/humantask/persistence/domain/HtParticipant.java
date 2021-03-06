package com.mossle.humantask.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "HT_PARTICIPANT")
public class HtParticipant implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private HtHumantask htHumantask;
	private String category;
	private String type;
	private String ref;

	public HtParticipant() {
	}

	public HtParticipant(HtHumantask htHumantask, String category, String type, String ref) {
		this.htHumantask = htHumantask;
		this.category = category;
		this.type = type;
		this.ref = ref;
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
	@JoinColumn(name = "HUMANTASK_ID")
	public HtHumantask getHtHumantask() {
		return this.htHumantask;
	}

	public void setHtHumantask(HtHumantask htHumantask) {
		this.htHumantask = htHumantask;
	}

	@Column(name = "CATEGORY", length = 200)
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Column(name = "TYPE", length = 200)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "REF", length = 200)
	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}
}
//need to confirm