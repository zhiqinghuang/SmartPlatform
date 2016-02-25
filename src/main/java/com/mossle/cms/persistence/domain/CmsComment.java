package com.mossle.cms.persistence.domain;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CMS_COMMENT")
public class CmsComment implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private CmsComment cmsComment;
	private CmsArticle cmsArticle;
	private String title;
	private String content;
	private Integer status;
	private Date createTime;
	private String userId;
	private String tenantId;
	private Set<CmsFavorite> cmsFavorites = new HashSet<CmsFavorite>(0);
	private Set<CmsComment> cmsComments = new HashSet<CmsComment>(0);

	public CmsComment() {
	}

	public CmsComment(CmsComment cmsComment, CmsArticle cmsArticle, String title, String content, Integer status, Date createTime, String userId, String tenantId, Set<CmsFavorite> cmsFavorites, Set<CmsComment> cmsComments) {
		this.cmsComment = cmsComment;
		this.cmsArticle = cmsArticle;
		this.title = title;
		this.content = content;
		this.status = status;
		this.createTime = createTime;
		this.userId = userId;
		this.tenantId = tenantId;
		this.cmsFavorites = cmsFavorites;
		this.cmsComments = cmsComments;
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
	public CmsComment getCmsComment() {
		return this.cmsComment;
	}

	public void setCmsComment(CmsComment cmsComment) {
		this.cmsComment = cmsComment;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ARTICLE_ID")
	public CmsArticle getCmsArticle() {
		return this.cmsArticle;
	}

	public void setCmsArticle(CmsArticle cmsArticle) {
		this.cmsArticle = cmsArticle;
	}

	@Column(name = "TITLE", length = 200)
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

	@Column(name = "STATUS")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cmsComment")
	public Set<CmsFavorite> getCmsFavorites() {
		return this.cmsFavorites;
	}

	public void setCmsFavorites(Set<CmsFavorite> cmsFavorites) {
		this.cmsFavorites = cmsFavorites;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cmsComment")
	public Set<CmsComment> getCmsComments() {
		return this.cmsComments;
	}

	public void setCmsComments(Set<CmsComment> cmsComments) {
		this.cmsComments = cmsComments;
	}
}
//need to confirm