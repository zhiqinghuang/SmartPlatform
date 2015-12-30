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
@Table(name = "CMS_FAVORITE")
public class CmsFavorite implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private CmsComment cmsComment;
	private CmsArticle cmsArticle;
	private String subject;
	private Date createTime;
	private String userId;

	public CmsFavorite() {
	}

	public CmsFavorite(CmsComment cmsComment, CmsArticle cmsArticle, String subject, Date createTime, String userId) {
		this.cmsComment = cmsComment;
		this.cmsArticle = cmsArticle;
		this.subject = subject;
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
	@JoinColumn(name = "COMMENT_ID")
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

	@Column(name = "SUBJECT", length = 200)
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
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