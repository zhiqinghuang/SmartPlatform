package com.mossle.cms.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CMS_TAG_ARTICLE")
public class CmsTagArticle implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private CmsTag cmsTag;
	private CmsArticle cmsArticle;
	private String type;
	private String tenantId;

	public CmsTagArticle() {
	}

	public CmsTagArticle(CmsTag cmsTag, CmsArticle cmsArticle, String type, String tenantId) {
		this.cmsTag = cmsTag;
		this.cmsArticle = cmsArticle;
		this.type = type;
		this.tenantId = tenantId;
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
	@JoinColumn(name = "TAG_ID")
	public CmsTag getCmsTag() {
		return this.cmsTag;
	}

	public void setCmsTag(CmsTag cmsTag) {
		this.cmsTag = cmsTag;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ARTICLE_ID")
	public CmsArticle getCmsArticle() {
		return this.cmsArticle;
	}

	public void setCmsArticle(CmsArticle cmsArticle) {
		this.cmsArticle = cmsArticle;
	}

	@Column(name = "TYPE", length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
}