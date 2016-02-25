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
@Table(name = "CMS_ARTICLE")
public class CmsArticle implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private CmsCatalog cmsCatalog;
	private String title;
	private String shortTitle;
	private String subTitle;
	private String content;
	private String summary;
	private String logo;
	private String keyword;
	private String tags;
	private String source;
	private Integer allowComment;
	private Integer status;
	private Date publishTime;
	private Date closeTime;
	private Integer type;
	private Integer top;
	private Integer weight;
	private Date createTime;
	private String template;
	private Integer hitCount;
	private Long recommendId;
	private Integer recommendStatus;
	private String userId;
	private Integer commentCount;
	private String code;
	private String tenantId;
	private Set<CmsAttachment> cmsAttachments = new HashSet<CmsAttachment>(0);
	private Set<CmsFavorite> cmsFavorites = new HashSet<CmsFavorite>(0);
	private Set<CmsTagArticle> cmsTagArticles = new HashSet<CmsTagArticle>(0);
	private Set<CmsComment> cmsComments = new HashSet<CmsComment>(0);
	private Set<CmsClick> cmsClicks = new HashSet<CmsClick>(0);
	private Set<CmsSite> cmsSites = new HashSet<CmsSite>(0);

	public CmsArticle() {
	}

	public CmsArticle(CmsCatalog cmsCatalog, String title, String shortTitle, String subTitle, String content, String summary, String logo, String keyword, String tags, String source, Integer allowComment, Integer status, Date publishTime, Date closeTime, Integer type, Integer top, Integer weight, Date createTime, String template, Integer hitCount, Long recommendId, Integer recommendStatus, String userId, Integer commentCount, String code, String tenantId, Set<CmsAttachment> cmsAttachments, Set<CmsFavorite> cmsFavorites, Set<CmsTagArticle> cmsTagArticles, Set<CmsComment> cmsComments,
			Set<CmsClick> cmsClicks, Set<CmsSite> cmsSites) {
		this.cmsCatalog = cmsCatalog;
		this.title = title;
		this.shortTitle = shortTitle;
		this.subTitle = subTitle;
		this.content = content;
		this.summary = summary;
		this.logo = logo;
		this.keyword = keyword;
		this.tags = tags;
		this.source = source;
		this.allowComment = allowComment;
		this.status = status;
		this.publishTime = publishTime;
		this.closeTime = closeTime;
		this.type = type;
		this.top = top;
		this.weight = weight;
		this.createTime = createTime;
		this.template = template;
		this.hitCount = hitCount;
		this.recommendId = recommendId;
		this.recommendStatus = recommendStatus;
		this.userId = userId;
		this.commentCount = commentCount;
		this.code = code;
		this.tenantId = tenantId;
		this.cmsAttachments = cmsAttachments;
		this.cmsFavorites = cmsFavorites;
		this.cmsTagArticles = cmsTagArticles;
		this.cmsComments = cmsComments;
		this.cmsClicks = cmsClicks;
		this.cmsSites = cmsSites;
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
	@JoinColumn(name = "CATALOG_ID")
	public CmsCatalog getCmsCatalog() {
		return this.cmsCatalog;
	}

	public void setCmsCatalog(CmsCatalog cmsCatalog) {
		this.cmsCatalog = cmsCatalog;
	}

	@Column(name = "TITLE", length = 200)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "SHORT_TITLE", length = 200)
	public String getShortTitle() {
		return this.shortTitle;
	}

	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}

	@Column(name = "SUB_TITLE", length = 200)
	public String getSubTitle() {
		return this.subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	@Column(name = "CONTENT", length = 65535)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "SUMMARY", length = 200)
	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Column(name = "LOGO", length = 200)
	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	@Column(name = "KEYWORD", length = 200)
	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Column(name = "TAGS", length = 200)
	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	@Column(name = "SOURCE", length = 200)
	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Column(name = "ALLOW_COMMENT")
	public Integer getAllowComment() {
		return this.allowComment;
	}

	public void setAllowComment(Integer allowComment) {
		this.allowComment = allowComment;
	}

	@Column(name = "STATUS")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PUBLISH_TIME", length = 26)
	public Date getPublishTime() {
		return this.publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CLOSE_TIME", length = 26)
	public Date getCloseTime() {
		return this.closeTime;
	}

	public void setCloseTime(Date closeTime) {
		this.closeTime = closeTime;
	}

	@Column(name = "TYPE")
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Column(name = "TOP")
	public Integer getTop() {
		return this.top;
	}

	public void setTop(Integer top) {
		this.top = top;
	}

	@Column(name = "WEIGHT")
	public Integer getWeight() {
		return this.weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME", length = 26)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "TEMPLATE", length = 200)
	public String getTemplate() {
		return this.template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	@Column(name = "HIT_COUNT")
	public Integer getHitCount() {
		return this.hitCount;
	}

	public void setHitCount(Integer hitCount) {
		this.hitCount = hitCount;
	}

	@Column(name = "RECOMMEND_ID")
	public Long getRecommendId() {
		return this.recommendId;
	}

	public void setRecommendId(Long recommendId) {
		this.recommendId = recommendId;
	}

	@Column(name = "RECOMMEND_STATUS")
	public Integer getRecommendStatus() {
		return this.recommendStatus;
	}

	public void setRecommendStatus(Integer recommendStatus) {
		this.recommendStatus = recommendStatus;
	}

	@Column(name = "USER_ID", length = 200)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "COMMENT_COUNT")
	public Integer getCommentCount() {
		return this.commentCount;
	}

	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}

	@Column(name = "CODE", length = 50)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cmsArticle")
	public Set<CmsAttachment> getCmsAttachments() {
		return this.cmsAttachments;
	}

	public void setCmsAttachments(Set<CmsAttachment> cmsAttachments) {
		this.cmsAttachments = cmsAttachments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cmsArticle")
	public Set<CmsFavorite> getCmsFavorites() {
		return this.cmsFavorites;
	}

	public void setCmsFavorites(Set<CmsFavorite> cmsFavorites) {
		this.cmsFavorites = cmsFavorites;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cmsArticle")
	public Set<CmsTagArticle> getCmsTagArticles() {
		return this.cmsTagArticles;
	}

	public void setCmsTagArticles(Set<CmsTagArticle> cmsTagArticles) {
		this.cmsTagArticles = cmsTagArticles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cmsArticle")
	public Set<CmsComment> getCmsComments() {
		return this.cmsComments;
	}

	public void setCmsComments(Set<CmsComment> cmsComments) {
		this.cmsComments = cmsComments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cmsArticle")
	public Set<CmsClick> getCmsClicks() {
		return this.cmsClicks;
	}

	public void setCmsClicks(Set<CmsClick> cmsClicks) {
		this.cmsClicks = cmsClicks;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cmsArticle")
	public Set<CmsSite> getCmsSites() {
		return this.cmsSites;
	}

	public void setCmsSites(Set<CmsSite> cmsSites) {
		this.cmsSites = cmsSites;
	}
}
//need to confirm