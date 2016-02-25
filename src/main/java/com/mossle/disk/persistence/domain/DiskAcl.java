package com.mossle.disk.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DISK_ACL")
public class DiskAcl implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private DiskShare diskShare;
	private String type;
	private String ref;

	public DiskAcl() {
	}

	public DiskAcl(DiskShare diskShare, String type, String ref) {
		this.diskShare = diskShare;
		this.type = type;
		this.ref = ref;
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
	@JoinColumn(name = "SHARE_ID")
	public DiskShare getDiskShare() {
		return this.diskShare;
	}

	public void setDiskShare(DiskShare diskShare) {
		this.diskShare = diskShare;
	}

	@Column(name = "TYPE", length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "REF", length = 64)
	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}
}
//need to confirm