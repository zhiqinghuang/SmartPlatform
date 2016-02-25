package com.mossle.portal.persistence.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PORTAL_INFO")
public class PortalInfo implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String name;
	private String description;
	private String userId;
	private Date createTime;
	private String columnLayout;
	private String sharedStatus;
	private String globalStatus;
	private String tenantId;
	private Set<PortalItem> portalItems = new HashSet<PortalItem>(0);
	private Set<PortalRef> portalRefs = new HashSet<PortalRef>(0);

	public PortalInfo() {
	}

	public PortalInfo(String name, String description, String userId, Date createTime, String columnLayout, String sharedStatus, String globalStatus, String tenantId, Set<PortalItem> portalItems, Set<PortalRef> portalRefs) {
		this.name = name;
		this.description = description;
		this.userId = userId;
		this.createTime = createTime;
		this.columnLayout = columnLayout;
		this.sharedStatus = sharedStatus;
		this.globalStatus = globalStatus;
		this.tenantId = tenantId;
		this.portalItems = portalItems;
		this.portalRefs = portalRefs;
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

	@Column(name = "NAME", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "DESCRIPTION", length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "USER_ID", length = 64)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME", length = 26)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "COLUMN_LAYOUT", length = 100)
	public String getColumnLayout() {
		return this.columnLayout;
	}

	public void setColumnLayout(String columnLayout) {
		this.columnLayout = columnLayout;
	}

	@Column(name = "SHARED_STATUS", length = 10)
	public String getSharedStatus() {
		return this.sharedStatus;
	}

	public void setSharedStatus(String sharedStatus) {
		this.sharedStatus = sharedStatus;
	}

	@Column(name = "GLOBAL_STATUS", length = 10)
	public String getGlobalStatus() {
		return this.globalStatus;
	}

	public void setGlobalStatus(String globalStatus) {
		this.globalStatus = globalStatus;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "portalInfo")
	public Set<PortalItem> getPortalItems() {
		return this.portalItems;
	}

	public void setPortalItems(Set<PortalItem> portalItems) {
		this.portalItems = portalItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "portalInfo")
	public Set<PortalRef> getPortalRefs() {
		return this.portalRefs;
	}

	public void setPortalRefs(Set<PortalRef> portalRefs) {
		this.portalRefs = portalRefs;
	}
}
//need to confirm