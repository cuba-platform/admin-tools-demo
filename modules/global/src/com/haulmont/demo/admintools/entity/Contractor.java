package com.haulmont.demo.admintools.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
import javax.persistence.OneToMany;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.Column;

@NamePattern("%s|contracts")
@Table(name = "ADMINTOOLSDEMO_CONTRACTOR")
@Entity(name = "admintoolsdemo$Contractor")
public class Contractor extends StandardEntity {
    private static final long serialVersionUID = 3577690745487686430L;

    @OneToMany(mappedBy = "contractor")
    protected List<Contract> contracts;

    @Column(name = "NAME")
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public List<Contract> getContracts() {
        return contracts;
    }


}