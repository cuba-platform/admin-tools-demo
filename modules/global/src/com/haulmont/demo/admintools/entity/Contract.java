package com.haulmont.demo.admintools.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import javax.persistence.Column;

@Table(name = "ADMINTOOLSDEMO_CONTRACT")
@Entity(name = "admintoolsdemo$Contract")
public class Contract extends StandardEntity {
    private static final long serialVersionUID = 8282137342476180610L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTRACTOR_ID")
    protected Contractor contractor;

    @Column(name = "DESCRIPTION")
    protected String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    public void setContractor(Contractor contractor) {
        this.contractor = contractor;
    }

    public Contractor getContractor() {
        return contractor;
    }


}