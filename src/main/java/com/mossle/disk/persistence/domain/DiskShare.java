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
@Table(name = "DISK_SHARE")
public class DiskShare implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private DiskInfo diskInfo;
	private String shareType;
	private Date shareTime;
	private String name;
	private String creator;
	private String type;
	private Integer dirType;
	private Integer countView;
	private Integer countSave;
	private Integer countDownload;
	private Set<DiskAcl> diskAcls = new HashSet<DiskAcl>(0);

	public DiskShare() {
	}

	public DiskShare(DiskInfo diskInfo, String shareType, Date shareTime, String name, String creator, String type, Integer dirType, Integer countView, Integer countSave, Integer countDownload, Set<DiskAcl> diskAcls) {
		this.diskInfo = diskInfo;
		this.shareType = shareType;
		this.shareTime = shareTime;
		this.name = name;
		this.creator = creator;
		this.type = type;
		this.dirType = dirType;
		this.countView = countView;
		this.countSave = countSave;
		this.countDownload = countDownload;
		this.diskAcls = diskAcls;
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
	public DiskInfo getDiskInfo() {
		return this.diskInfo;
	}

	public void setDiskInfo(DiskInfo diskInfo) {
		this.diskInfo = diskInfo;
	}

	@Column(name = "SHARE_TYPE", length = 50)
	public String getShareType() {
		return this.shareType;
	}

	public void setShareType(String shareType) {
		this.shareType = shareType;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SHARE_TIME", length = 26)
	public Date getShareTime() {
		return this.shareTime;
	}

	public void setShareTime(Date shareTime) {
		this.shareTime = shareTime;
	}

	@Column(name = "NAME", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "CREATOR", length = 64)
	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	@Column(name = "TYPE", length = 64)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "DIR_TYPE")
	public Integer getDirType() {
		return this.dirType;
	}

	public void setDirType(Integer dirType) {
		this.dirType = dirType;
	}

	@Column(name = "COUNT_VIEW")
	public Integer getCountView() {
		return this.countView;
	}

	public void setCountView(Integer countView) {
		this.countView = countView;
	}

	@Column(name = "COUNT_SAVE")
	public Integer getCountSave() {
		return this.countSave;
	}

	public void setCountSave(Integer countSave) {
		this.countSave = countSave;
	}

	@Column(name = "COUNT_DOWNLOAD")
	public Integer getCountDownload() {
		return this.countDownload;
	}

	public void setCountDownload(Integer countDownload) {
		this.countDownload = countDownload;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "diskShare")
	public Set<DiskAcl> getDiskAcls() {
		return this.diskAcls;
	}

	public void setDiskAcls(Set<DiskAcl> diskAcls) {
		this.diskAcls = diskAcls;
	}
}
//need to confirm