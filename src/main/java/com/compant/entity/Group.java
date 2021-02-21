package com.compant.entity;

import javax.persistence.*;

@Entity
@Table(name = "group")
public class Group {
    @Id
    @GeneratedValue
    private Long gId;

    @Column(name = "group_id")
    private String groupId;

    public Group(){}

    public Long getgId() {
        return gId;
    }

    public void setgId(Long id) {
        this.gId= id;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
