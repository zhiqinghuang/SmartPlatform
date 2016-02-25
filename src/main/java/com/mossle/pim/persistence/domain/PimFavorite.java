package com.mossle.pim.persistence.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PIM_FAVORITE")
public class PimFavorite implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String moduleType;
	private String moduleId;
	private String title;
	private String content;
	private Date createTime;
	private String tags;
	private String userId;

	public PimFavorite() {
	}

	public PimFavorite(String moduleType, String moduleId, String title, String content, Date createTime, String tags, String userId) {
		this.moduleType = moduleType;
		this.moduleId = moduleId;
		this.title = title;
		this.content = content;
		this.createTime = createTime;
		this.tags = tags;
		this.userId = userId;
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

	@Column(name = "MODULE_TYPE", length = 50)
	public String getModuleType() {
		return this.moduleType;
	}

	public void setModuleType(String moduleType) {
		this.moduleType = moduleType;
	}

	@Column(name = "MODULE_ID", length = 64)
	public String getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	@Column(name = "TITLE", length = 100)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "CONTENT", length = 200)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME", length = 26)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "TAGS", length = 200)
	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	@Column(name = "USER_ID", length = 64)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
//need to confirm