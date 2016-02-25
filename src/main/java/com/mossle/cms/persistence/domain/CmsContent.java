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
@Table(name = "CMS_CONTENT")
public class CmsContent implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String name;
	private String code;
	private String content;
	private String tenantId;
	private Set<CmsVersion> cmsVersions = new HashSet<CmsVersion>(0);

	public CmsContent() {
	}

	public CmsContent(String name, String code, String content, String tenantId, Set<CmsVersion> cmsVersions) {
		this.name = name;
		this.code = code;
		this.content = content;
		this.tenantId = tenantId;
		this.cmsVersions = cmsVersions;
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

	@Column(name = "CODE", length = 200)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "CONTENT", length = 65535)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cmsContent")
	public Set<CmsVersion> getCmsVersions() {
		return this.cmsVersions;
	}

	public void setCmsVersions(Set<CmsVersion> cmsVersions) {
		this.cmsVersions = cmsVersions;
	}
}
//need to confirm