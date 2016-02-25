package com.mossle.cms.persistence.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CMS_ATTACHMENT")
public class CmsAttachment implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private CmsArticle cmsArticle;
	private String type;
	private String name;
	private String path;
	private Integer size;
	private Integer height;
	private Integer width;
	private Date createTime;
	private String userId;

	public CmsAttachment() {
	}

	public CmsAttachment(CmsArticle cmsArticle, String type, String name, String path, Integer size, Integer height, Integer width, Date createTime, String userId) {
		this.cmsArticle = cmsArticle;
		this.type = type;
		this.name = name;
		this.path = path;
		this.size = size;
		this.height = height;
		this.width = width;
		this.createTime = createTime;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ARTICLE_ID")
	public CmsArticle getCmsArticle() {
		return this.cmsArticle;
	}

	public void setCmsArticle(CmsArticle cmsArticle) {
		this.cmsArticle = cmsArticle;
	}

	@Column(name = "TYPE", length = 200)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "NAME", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "PATH", length = 200)
	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Column(name = "SIZE")
	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	@Column(name = "HEIGHT")
	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	@Column(name = "WIDTH")
	public Integer getWidth() {
		return this.width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME", length = 26)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "USER_ID", length = 200)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
//need to confirm