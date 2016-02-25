package com.mossle.portal.persistence.domain;

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
@Table(name = "PORTAL_WIDGET")
public class PortalWidget implements java.io.Serializable {
	private static final long serialVersionUID = 0L;
	private Long id;
	private String name;
	private String url;
	private String data;
	private String tenantId;
	private Set<PortalItem> portalItems = new HashSet<PortalItem>(0);
	public PortalWidget() {
	}

	public PortalWidget(String name, String url, String data, String tenantId, Set<PortalItem> portalItems) {
		this.name = name;
		this.url = url;
		this.data = data;
		this.tenantId = tenantId;
		this.portalItems = portalItems;
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

	@Column(name = "URL", length = 200)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "DATA", length = 200)
	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "portalWidget")
	public Set<PortalItem> getPortalItems() {
		return this.portalItems;
	}

	public void setPortalItems(Set<PortalItem> portalItems) {
		this.portalItems = portalItems;
	}
}
//need to confirm