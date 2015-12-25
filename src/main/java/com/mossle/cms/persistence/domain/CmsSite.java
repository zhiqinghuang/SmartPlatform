package com.mossle.cms.persistence.domain;

// Generated by Hibernate Tools
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

/**
 * CmsSite .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "CMS_SITE")
public class CmsSite implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	/** null. */
	private Long id;

	/** null. */
	private CmsArticle cmsArticle;

	/** null. */
	private String type;

	/** null. */
	private String name;

	/** null. */
	private String code;

	/** null. */
	private Integer priority;

	/** null. */
	private String tenantId;

	/** . */
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

	/** @return null. */
	@Id
	@GeneratedValue
	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	/**
	 * @param id
	 *            null.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/** @return null. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARENT_ID")
	public CmsArticle getCmsArticle() {
		return this.cmsArticle;
	}

	/**
	 * @param cmsArticle
	 *            null.
	 */
	public void setCmsArticle(CmsArticle cmsArticle) {
		this.cmsArticle = cmsArticle;
	}

	/** @return null. */
	@Column(name = "TYPE", length = 50)
	public String getType() {
		return this.type;
	}

	/**
	 * @param type
	 *            null.
	 */
	public void setType(String type) {
		this.type = type;
	}

	/** @return null. */
	@Column(name = "NAME", length = 50)
	public String getName() {
		return this.name;
	}

	/**
	 * @param name
	 *            null.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** @return null. */
	@Column(name = "CODE", length = 200)
	public String getCode() {
		return this.code;
	}

	/**
	 * @param code
	 *            null.
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/** @return null. */
	@Column(name = "PRIORITY")
	public Integer getPriority() {
		return this.priority;
	}

	/**
	 * @param priority
	 *            null.
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	/** @return null. */
	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	/**
	 * @param tenantId
	 *            null.
	 */
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	/** @return . */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cmsSite")
	public Set<CmsCatalog> getCmsCatalogs() {
		return this.cmsCatalogs;
	}

	/**
	 * @param cmsCatalogs
	 *            .
	 */
	public void setCmsCatalogs(Set<CmsCatalog> cmsCatalogs) {
		this.cmsCatalogs = cmsCatalogs;
	}
}
