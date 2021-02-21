package com.compant.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name ="users")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "user_id")
    private String userId;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = {CascadeType.PERSIST,
            CascadeType.MERGE},
            orphanRemoval = true)
    private Set<UserAssignedFunctionGroup> userAssignedFunctionGroups = new HashSet<>();

    public User(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Set<UserAssignedFunctionGroup> getUserAssignedFunctionGroups() {
        return userAssignedFunctionGroups;
    }

    public void setUserAssignedFunctionGroups(Set<UserAssignedFunctionGroup> userAssignedFunctionGroups) {
        this.userAssignedFunctionGroups = userAssignedFunctionGroups;
    }
}
