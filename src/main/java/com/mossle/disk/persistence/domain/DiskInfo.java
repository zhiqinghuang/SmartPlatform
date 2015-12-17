package com.mossle.disk.persistence.domain;

// Generated by Hibernate Tools
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

/**
 * DiskInfo .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "DISK_INFO")
public class DiskInfo implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private DiskInfo diskInfo;

    /** null. */
    private String name;

    /** null. */
    private String description;

    /** null. */
    private String type;

    /** null. */
    private Long fileSize;

    /** null. */
    private String creator;

    /** null. */
    private Date createTime;

    /** null. */
    private String ref;

    /** null. */
    private String previewStatus;

    /** null. */
    private String previewRef;

    /** null. */
    private String parentPath;

    /** null. */
    private Integer dirType;

    /** null. */
    private Integer priority;

    /** null. */
    private String lastModifier;

    /** null. */
    private Date lastModifiedTime;

    /** null. */
    private String status;

    /** null. */
    private Date expireTime;

    /** null. */
    private String checkoutStatus;

    /** null. */
    private String fileVersion;

    /** null. */
    private String securityLevel;

    /** . */
    private Set<DiskInfo> diskInfos = new HashSet<DiskInfo>(0);

    /** . */
    private Set<DiskShare> diskShares = new HashSet<DiskShare>(0);

    public DiskInfo() {
    }

    public DiskInfo(DiskInfo diskInfo, String name, String description,
            String type, Long fileSize, String creator, Date createTime,
            String ref, String previewStatus, String previewRef,
            String parentPath, Integer dirType, Integer priority,
            String lastModifier, Date lastModifiedTime, String status,
            Date expireTime, String checkoutStatus, String fileVersion,
            String securityLevel, Set<DiskInfo> diskInfos,
            Set<DiskShare> diskShares) {
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
    public DiskInfo getDiskInfo() {
        return this.diskInfo;
    }

    /**
     * @param diskInfo
     *            null.
     */
    public void setDiskInfo(DiskInfo diskInfo) {
        this.diskInfo = diskInfo;
    }

    /** @return null. */
    @Column(name = "NAME", length = 200)
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
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     *            null.
     */
    public void setDescription(String description) {
        this.description = description;
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
    @Column(name = "FILE_SIZE")
    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * @param fileSize
     *            null.
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /** @return null. */
    @Column(name = "CREATOR", length = 64)
    public String getCreator() {
        return this.creator;
    }

    /**
     * @param creator
     *            null.
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", length = 26)
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     *            null.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** @return null. */
    @Column(name = "REF", length = 200)
    public String getRef() {
        return this.ref;
    }

    /**
     * @param ref
     *            null.
     */
    public void setRef(String ref) {
        this.ref = ref;
    }

    /** @return null. */
    @Column(name = "PREVIEW_STATUS", length = 50)
    public String getPreviewStatus() {
        return this.previewStatus;
    }

    /**
     * @param previewStatus
     *            null.
     */
    public void setPreviewStatus(String previewStatus) {
        this.previewStatus = previewStatus;
    }

    /** @return null. */
    @Column(name = "PREVIEW_REF", length = 200)
    public String getPreviewRef() {
        return this.previewRef;
    }

    /**
     * @param previewRef
     *            null.
     */
    public void setPreviewRef(String previewRef) {
        this.previewRef = previewRef;
    }

    /** @return null. */
    @Column(name = "PARENT_PATH", length = 200)
    public String getParentPath() {
        return this.parentPath;
    }

    /**
     * @param parentPath
     *            null.
     */
    public void setParentPath(String parentPath) {
        this.parentPath = parentPath;
    }

    /** @return null. */
    @Column(name = "DIR_TYPE")
    public Integer getDirType() {
        return this.dirType;
    }

    /**
     * @param dirType
     *            null.
     */
    public void setDirType(Integer dirType) {
        this.dirType = dirType;
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
    @Column(name = "LAST_MODIFIER", length = 64)
    public String getLastModifier() {
        return this.lastModifier;
    }

    /**
     * @param lastModifier
     *            null.
     */
    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_MODIFIED_TIME", length = 26)
    public Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @param lastModifiedTime
     *            null.
     */
    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /** @return null. */
    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            null.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EXPIRE_TIME", length = 26)
    public Date getExpireTime() {
        return this.expireTime;
    }

    /**
     * @param expireTime
     *            null.
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    /** @return null. */
    @Column(name = "CHECKOUT_STATUS", length = 50)
    public String getCheckoutStatus() {
        return this.checkoutStatus;
    }

    /**
     * @param checkoutStatus
     *            null.
     */
    public void setCheckoutStatus(String checkoutStatus) {
        this.checkoutStatus = checkoutStatus;
    }

    /** @return null. */
    @Column(name = "FILE_VERSION", length = 50)
    public String getFileVersion() {
        return this.fileVersion;
    }

    /**
     * @param fileVersion
     *            null.
     */
    public void setFileVersion(String fileVersion) {
        this.fileVersion = fileVersion;
    }

    /** @return null. */
    @Column(name = "SECURITY_LEVEL", length = 50)
    public String getSecurityLevel() {
        return this.securityLevel;
    }

    /**
     * @param securityLevel
     *            null.
     */
    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "diskInfo")
    public Set<DiskInfo> getDiskInfos() {
        return this.diskInfos;
    }

    /**
     * @param diskInfos
     *            .
     */
    public void setDiskInfos(Set<DiskInfo> diskInfos) {
        this.diskInfos = diskInfos;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "diskInfo")
    public Set<DiskShare> getDiskShares() {
        return this.diskShares;
    }

    /**
     * @param diskShares
     *            .
     */
    public void setDiskShares(Set<DiskShare> diskShares) {
        this.diskShares = diskShares;
    }
}
