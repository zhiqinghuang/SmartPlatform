package com.mossle.user.persistence.domain;

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
 * AccountCredential .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "ACCOUNT_CREDENTIAL")
public class AccountCredential implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private AccountInfo accountInfo;

    /** null. */
    private String password;

    /** null. */
    private Date modifyTime;

    /** null. */
    private Date expireTime;

    /** null. */
    private String expireStatus;

    /** null. */
    private String required;

    /** null. */
    private String couldModify;

    /** null. */
    private String type;

    /** null. */
    private String catalog;

    /** null. */
    private String data;

    /** null. */
    private String status;

    /** null. */
    private String tenantId;

    /** . */
    private Set<AccountHistoryCredential> accountHistoryCredentials = new HashSet<AccountHistoryCredential>(
            0);

    public AccountCredential() {
    }

    public AccountCredential(AccountInfo accountInfo, String password,
            Date modifyTime, Date expireTime, String expireStatus,
            String required, String couldModify, String type, String catalog,
            String data, String status, String tenantId,
            Set<AccountHistoryCredential> accountHistoryCredentials) {
        this.accountInfo = accountInfo;
        this.password = password;
        this.modifyTime = modifyTime;
        this.expireTime = expireTime;
        this.expireStatus = expireStatus;
        this.required = required;
        this.couldModify = couldModify;
        this.type = type;
        this.catalog = catalog;
        this.data = data;
        this.status = status;
        this.tenantId = tenantId;
        this.accountHistoryCredentials = accountHistoryCredentials;
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
    @JoinColumn(name = "ACCOUNT_ID")
    public AccountInfo getAccountInfo() {
        return this.accountInfo;
    }

    /**
     * @param accountInfo
     *            null.
     */
    public void setAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
    }

    /** @return null. */
    @Column(name = "PASSWORD", length = 50)
    public String getPassword() {
        return this.password;
    }

    /**
     * @param password
     *            null.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MODIFY_TIME", length = 26)
    public Date getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @param modifyTime
     *            null.
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
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
    @Column(name = "EXPIRE_STATUS", length = 50)
    public String getExpireStatus() {
        return this.expireStatus;
    }

    /**
     * @param expireStatus
     *            null.
     */
    public void setExpireStatus(String expireStatus) {
        this.expireStatus = expireStatus;
    }

    /** @return null. */
    @Column(name = "REQUIRED", length = 50)
    public String getRequired() {
        return this.required;
    }

    /**
     * @param required
     *            null.
     */
    public void setRequired(String required) {
        this.required = required;
    }

    /** @return null. */
    @Column(name = "COULD_MODIFY", length = 50)
    public String getCouldModify() {
        return this.couldModify;
    }

    /**
     * @param couldModify
     *            null.
     */
    public void setCouldModify(String couldModify) {
        this.couldModify = couldModify;
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
    @Column(name = "CATALOG", length = 50)
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @param catalog
     *            null.
     */
    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /** @return null. */
    @Column(name = "DATA", length = 200)
    public String getData() {
        return this.data;
    }

    /**
     * @param data
     *            null.
     */
    public void setData(String data) {
        this.data = data;
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
    @Column(name = "TENANT_ID", length = 64)
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @param tenantId
     *            null.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "accountCredential")
    public Set<AccountHistoryCredential> getAccountHistoryCredentials() {
        return this.accountHistoryCredentials;
    }

    /**
     * @param accountHistoryCredentials
     *            .
     */
    public void setAccountHistoryCredentials(
            Set<AccountHistoryCredential> accountHistoryCredentials) {
        this.accountHistoryCredentials = accountHistoryCredentials;
    }
}
