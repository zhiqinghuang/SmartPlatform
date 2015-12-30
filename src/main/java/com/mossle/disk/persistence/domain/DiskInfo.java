package com.mossle.disk.persistence.domain;

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
@Table(name = "DISK_INFO")
public class DiskInfo implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private DiskInfo diskInfo;
	private String name;
	private String description;
	private String type;
	private Long fileSize;
	private String creator;
	private Date createTime;
	private String ref;
	private String previewStatus;
	private String previewRef;
	private String parentPath;
	private Integer dirType;
	private Integer priority;
	private String lastModifier;
	private Date lastModifiedTime;
	private String status;
	private Date expireTime;
	private String checkoutStatus;
	private String fileVersion;
	private String securityLevel;
	private Set<DiskInfo> diskInfos = new HashSet<DiskInfo>(0);
	private Set<DiskShare> diskShares = new HashSet<DiskShare>(0);

	public DiskInfo() {
	}

	public DiskInfo(DiskInfo diskInfo, String name, String description, String type, Long fileSize, String creator, Date createTime, String ref, String previewStatus, String previewRef, String parentPath, Integer dirType, Integer priority, String lastModifier, Date lastModifiedTime, String status, Date expireTime, String checkoutStatus, String fileVersion, String securityLevel, Set<DiskInfo> diskInfos, Set<DiskShare> diskShares) {
		this.diskInfo = diskInfo;
		this.name = name;
		this.description = description;
		this.type = type;
		this.fileSize = fileSize;
		this.creator = creator;
		this.createTime = createTime;
		this.ref = ref;
		this.previewStatus = previewStatus;
		this.previewRef = previewRef;
		this.parentPath = parentPath;
		this.dirType = dirType;
		this.priority = priority;
		this.lastModifier = lastModifier;
		this.lastModifiedTime = lastModifiedTime;
		this.status = status;
		this.expireTime = expireTime;
		this.checkoutStatus = checkoutStatus;
		this.fileVersion = fileVersion;
		this.securityLevel = securityLevel;
		this.diskInfos = diskInfos;
		this.diskShares = diskShares;
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
	public DiskInfo getDiskInfo() {
		return this.diskInfo;
	}

	public void setDiskInfo(DiskInfo diskInfo) {
		this.diskInfo = diskInfo;
	}

	@Column(name = "NAME", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "DESCRIPTION")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "TYPE", length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "FILE_SIZE")
	public Long getFileSize() {
		return this.fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	@Column(name = "CREATOR", length = 64)
	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME", length = 26)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "REF", length = 200)
	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	@Column(name = "PREVIEW_STATUS", length = 50)
	public String getPreviewStatus() {
		return this.previewStatus;
	}

	public void setPreviewStatus(String previewStatus) {
		this.previewStatus = previewStatus;
	}

	@Column(name = "PREVIEW_REF", length = 200)
	public String getPreviewRef() {
		return this.previewRef;
	}

	public void setPreviewRef(String previewRef) {
		this.previewRef = previewRef;
	}

	@Column(name = "PARENT_PATH", length = 200)
	public String getParentPath() {
		return this.parentPath;
	}

	public void setParentPath(String parentPath) {
		this.parentPath = parentPath;
	}

	@Column(name = "DIR_TYPE")
	public Integer getDirType() {
		return this.dirType;
	}

	public void setDirType(Integer dirType) {
		this.dirType = dirType;
	}

	@Column(name = "PRIORITY")
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Column(name = "LAST_MODIFIER", length = 64)
	public String getLastModifier() {
		return this.lastModifier;
	}

	public void setLastModifier(String lastModifier) {
		this.lastModifier = lastModifier;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_MODIFIED_TIME", length = 26)
	public Date getLastModifiedTime() {
		return this.lastModifiedTime;
	}

	public void setLastModifiedTime(Date lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	@Column(name = "STATUS", length = 50)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EXPIRE_TIME", length = 26)
	public Date getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	@Column(name = "CHECKOUT_STATUS", length = 50)
	public String getCheckoutStatus() {
		return this.checkoutStatus;
	}

	public void setCheckoutStatus(String checkoutStatus) {
		this.checkoutStatus = checkoutStatus;
	}

	@Column(name = "FILE_VERSION", length = 50)
	public String getFileVersion() {
		return this.fileVersion;
	}

	public void setFileVersion(String fileVersion) {
		this.fileVersion = fileVersion;
	}

	@Column(name = "SECURITY_LEVEL", length = 50)
	public String getSecurityLevel() {
		return this.securityLevel;
	}

	public void setSecurityLevel(String securityLevel) {
		this.securityLevel = securityLevel;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "diskInfo")
	public Set<DiskInfo> getDiskInfos() {
		return this.diskInfos;
	}

	public void setDiskInfos(Set<DiskInfo> diskInfos) {
		this.diskInfos = diskInfos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "diskInfo")
	public Set<DiskShare> getDiskShares() {
		return this.diskShares;
	}

	public void setDiskShares(Set<DiskShare> diskShares) {
		this.diskShares = diskShares;
	}
}