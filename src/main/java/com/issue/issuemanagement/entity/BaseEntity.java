package com.issue.issuemanagement.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;


@Data  //icerisindeki fieldlarin getter setter methodlarini otomatik olusturur.
@MappedSuperclass //butun tablolarda ortak olmasini sagliyor diger classlarda extend edilebilmesini sagliyor.
@Getter
@Setter
public abstract class BaseEntity implements Serializable {

    //Entityler hibernatede bir ORM nesnesi olarak tutulacagi icin bunlarin Serializable edilmesi lazim.
    //Bu nesnenin networkten tasinabilmesini veya diske yazilabilmesi gibi islemleri Serializable interface'inden
    // implement ediyoruz.

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "created_by", length = 100)
    private String createdBy;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "updated_by", length = 100)
    private String updatedBy;
    @Column(name = "status")
    private Boolean status;
}
