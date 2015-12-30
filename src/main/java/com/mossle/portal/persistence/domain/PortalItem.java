package com.mossle.portal.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PORTAL_ITEM")
public class PortalItem implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private PortalInfo portalInfo;
	private PortalWidget portalWidget;
	private String name;
	private Integer columnIndex;
	private Integer rowIndex;
	private String data;
	private String tenantId;

	public PortalItem() {
	}

	public PortalItem(PortalInfo portalInfo, PortalWidget portalWidget, String name, Integer columnIndex, Integer rowIndex, String data, String tenantId) {
		this.portalInfo = portalInfo;
		this.portalWidget = portalWidget;
		this.name = name;
		this.columnIndex = columnIndex;
		this.rowIndex = rowIndex;
		this.data = data;
		this.tenantId = tenantId;
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
	@JoinColumn(name = "INFO_ID")
	public PortalInfo getPortalInfo() {
		return this.portalInfo;
	}

	public void setPortalInfo(PortalInfo portalInfo) {
		this.portalInfo = portalInfo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "WIDGET_ID")
	public PortalWidget getPortalWidget() {
		return this.portalWidget;
	}

	public void setPortalWidget(PortalWidget portalWidget) {
		this.portalWidget = portalWidget;
	}

	@Column(name = "NAME", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "COLUMN_INDEX")
	public Integer getColumnIndex() {
		return this.columnIndex;
	}

	public void setColumnIndex(Integer columnIndex) {
		this.columnIndex = columnIndex;
	}

	@Column(name = "ROW_INDEX")
	public Integer getRowIndex() {
		return this.rowIndex;
	}

	public void setRowIndex(Integer rowIndex) {
		this.rowIndex = rowIndex;
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
}