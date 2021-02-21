package com.compant.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name = "function")
public class UserAssignedFunctionGroup {
    @Id
    @GeneratedValue
    private Long fId;

    @Column(name = "function_group_id", nullable = false, updatable = false, insertable = false)
    private String functionGroupId;

    @ManyToOne(fetch = LAZY, optional = false)
    @JoinColumn(name = "user", nullable = false, updatable = false)
    private User user;

    @ManyToMany(fetch = LAZY)
    @JoinTable(
            name="function_group",
            joinColumns={@JoinColumn(name="f_id")},
            inverseJoinColumns={@JoinColumn(name = "g_fd")})
    private Set<Group> groups = new HashSet<>();

    public UserAssignedFunctionGroup(){}

    public Long getfId() {
        return fId;
    }

    public void setfId(Long id) {
        this.fId = id;
    }

    public String getFunctionGroupId() {
        return functionGroupId;
    }

    public void setFunctionGroupId(String functionGroupId) {
        this.functionGroupId = functionGroupId;
    }

    public Set<Group> getGroups() {
        return groups;
    }

    public void setGroups(Set<Group> groups) {
        this.groups = groups;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
