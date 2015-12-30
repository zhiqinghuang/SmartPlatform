package com.mossle.cms.persistence.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CMS_SITE")
public class CmsSite implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private CmsArticle cmsArticle;
	private String type;
	private String name;
	private String code;
	private Integer priority;
	private String tenantId;
	private Set<CmsCatalog> cmsCatalogs = new HashSet<CmsCatalog>(0);

	public CmsSite() {
	}

	public CmsSite(CmsArticle cmsArticle, String type, String name, String code, Integer priority, String tenantId, Set<CmsCatalog> cmsCatalogs) {
		this.cmsArticle = cmsArticle;
		this.type = type;
		this.name = name;
		this.code = code;
		this.priority = priority;
		this.tenantId = tenantId;
		this.cmsCatalogs = cmsCatalogs;
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
	@JoinColumn(name = "PARENT_ID")
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

	@Column(name = "NAME", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "CODE", length = 200)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "PRIORITY")
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cmsSite")
	public Set<CmsCatalog> getCmsCatalogs() {
		return this.cmsCatalogs;
	}

	public void setCmsCatalogs(Set<CmsCatalog> cmsCatalogs) {
		this.cmsCatalogs = cmsCatalogs;
	}
}