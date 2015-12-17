package com.mossle.party.persistence.domain;

// Generated by Hibernate Tools
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * PartyType .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "PARTY_TYPE")
public class PartyType implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private String name;

    /** null. */
    private String tenantId;

    /** null. */
    private Integer type;

    /** null. */
    private String ref;

    /** . */
    private Set<PartyStructRule> parentStructRules = new HashSet<PartyStructRule>(
            0);

    /** . */
    private Set<PartyStructRule> childStructRules = new HashSet<PartyStructRule>(
            0);

    /** . */
    private Set<PartyEntity> partyEntities = new HashSet<PartyEntity>(0);

    public PartyType() {
    }

    public PartyType(String name, String tenantId, Integer type, String ref,
            Set<PartyStructRule> parentStructRules,
            Set<PartyStructRule> childStructRules,
            Set<PartyEntity> partyEntities) {
        this.name = name;
        this.tenantId = tenantId;
        this.type = type;
        this.ref = ref;
        this.parentStructRules = parentStructRules;
        this.childStructRules = childStructRules;
        this.partyEntities = partyEntities;
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
    @Column(name = "NAME", length = 50)
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
    @Column(name = "TENANT_ID", length = 50)
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

    /** @return null. */
    @Column(name = "TYPE")
    public Integer getType() {
        return this.type;
    }

    /**
     * @param type
     *            null.
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /** @return null. */
    @Column(name = "REF", length = 50)
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

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "childType")
    public Set<PartyStructRule> getParentStructRules() {
        return this.parentStructRules;
    }

    /**
     * @param parentStructRules
     *            .
     */
    public void setParentStructRules(Set<PartyStructRule> parentStructRules) {
        this.parentStructRules = parentStructRules;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "parentType")
    public Set<PartyStructRule> getChildStructRules() {
        return this.childStructRules;
    }

    /**
     * @param childStructRules
     *            .
     */
    public void setChildStructRules(Set<PartyStructRule> childStructRules) {
        this.childStructRules = childStructRules;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "partyType")
    public Set<PartyEntity> getPartyEntities() {
        return this.partyEntities;
    }

    /**
     * @param partyEntities
     *            .
     */
    public void setPartyEntities(Set<PartyEntity> partyEntities) {
        this.partyEntities = partyEntities;
    }
}
