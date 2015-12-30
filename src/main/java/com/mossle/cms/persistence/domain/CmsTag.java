package com.mossle.cms.persistence.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CMS_TAG")
public class CmsTag implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String name;
	private Integer countArticle;
	private String tenantId;
	private Set<CmsTagArticle> cmsTagArticles = new HashSet<CmsTagArticle>(0);

	public CmsTag() {
	}

	public CmsTag(String name, Integer countArticle, String tenantId, Set<CmsTagArticle> cmsTagArticles) {
		this.name = name;
		this.countArticle = countArticle;
		this.tenantId = tenantId;
		this.cmsTagArticles = cmsTagArticles;
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

	@Column(name = "NAME", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "COUNT_ARTICLE")
	public Integer getCountArticle() {
		return this.countArticle;
	}

	public void setCountArticle(Integer countArticle) {
		this.countArticle = countArticle;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cmsTag")
	public Set<CmsTagArticle> getCmsTagArticles() {
		return this.cmsTagArticles;
	}

	public void setCmsTagArticles(Set<CmsTagArticle> cmsTagArticles) {
		this.cmsTagArticles = cmsTagArticles;
	}
}