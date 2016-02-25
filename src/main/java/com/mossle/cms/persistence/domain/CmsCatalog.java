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
@Table(name = "CMS_CATALOG")
public class CmsCatalog implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private CmsSite cmsSite;
	private CmsCatalog cmsCatalog;
	private String name;
	private String code;
	private String logo;
	private Integer type;
	private String templateIndex;
	private String templateList;
	private String templateDetail;
	private String keyword;
	private String description;
	private String tenantId;
	private Set<CmsCatalog> cmsCatalogs = new HashSet<CmsCatalog>(0);
	private Set<CmsArticle> cmsArticles = new HashSet<CmsArticle>(0);

	public CmsCatalog() {
	}

	public CmsCatalog(CmsSite cmsSite, CmsCatalog cmsCatalog, String name, String code, String logo, Integer type, String templateIndex, String templateList, String templateDetail, String keyword, String description, String tenantId, Set<CmsCatalog> cmsCatalogs, Set<CmsArticle> cmsArticles) {
		this.cmsSite = cmsSite;
		this.cmsCatalog = cmsCatalog;
		this.name = name;
		this.code = code;
		this.logo = logo;
		this.type = type;
		this.templateIndex = templateIndex;
		this.templateList = templateList;
		this.templateDetail = templateDetail;
		this.keyword = keyword;
		this.description = description;
		this.tenantId = tenantId;
		this.cmsCatalogs = cmsCatalogs;
		this.cmsArticles = cmsArticles;
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
	@JoinColumn(name = "SITE_ID")
	public CmsSite getCmsSite() {
		return this.cmsSite;
	}

	public void setCmsSite(CmsSite cmsSite) {
		this.cmsSite = cmsSite;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARENT_ID")
	public CmsCatalog getCmsCatalog() {
		return this.cmsCatalog;
	}

	public void setCmsCatalog(CmsCatalog cmsCatalog) {
		this.cmsCatalog = cmsCatalog;
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

	@Column(name = "LOGO", length = 200)
	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	@Column(name = "TYPE")
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Column(name = "TEMPLATE_INDEX", length = 200)
	public String getTemplateIndex() {
		return this.templateIndex;
	}

	public void setTemplateIndex(String templateIndex) {
		this.templateIndex = templateIndex;
	}

	@Column(name = "TEMPLATE_LIST", length = 200)
	public String getTemplateList() {
		return this.templateList;
	}

	public void setTemplateList(String templateList) {
		this.templateList = templateList;
	}

	@Column(name = "TEMPLATE_DETAIL", length = 200)
	public String getTemplateDetail() {
		return this.templateDetail;
	}

	public void setTemplateDetail(String templateDetail) {
		this.templateDetail = templateDetail;
	}

	@Column(name = "KEYWORD", length = 200)
	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Column(name = "DESCRIPTION", length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cmsCatalog")
	public Set<CmsCatalog> getCmsCatalogs() {
		return this.cmsCatalogs;
	}

	public void setCmsCatalogs(Set<CmsCatalog> cmsCatalogs) {
		this.cmsCatalogs = cmsCatalogs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cmsCatalog")
	public Set<CmsArticle> getCmsArticles() {
		return this.cmsArticles;
	}

	public void setCmsArticles(Set<CmsArticle> cmsArticles) {
		this.cmsArticles = cmsArticles;
	}
}
//need to confirm