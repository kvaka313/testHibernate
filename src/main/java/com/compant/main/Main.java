package com.compant.main;

import com.compant.entity.Group;
import com.compant.entity.User;
import com.compant.entity.UserAssignedFunctionGroup;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("example-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        User user1 = new User();
//        user1.setUserId("user1");
//
//        User user2 = new User();
//        user2.setUserId("user2");
//
//        User user3 = new User();
//        user3.setUserId("user3");
//        entityManager.persist(user1);
//        entityManager.persist(user2);
//        entityManager.persist(user3);
//
//        UserAssignedFunctionGroup userAssignedFunctionGroup1 = new UserAssignedFunctionGroup();
//        userAssignedFunctionGroup1.setFunctionGroupId("function1");
//        userAssignedFunctionGroup1.setUser(user1);
//        entityManager.persist(userAssignedFunctionGroup1);
//
//        UserAssignedFunctionGroup userAssignedFunctionGroup2 = new UserAssignedFunctionGroup();
//        userAssignedFunctionGroup2.setFunctionGroupId("function2");
//        userAssignedFunctionGroup2.setUser(user1);
//        entityManager.persist(userAssignedFunctionGroup2);
//
//        UserAssignedFunctionGroup userAssignedFunctionGroup3 = new UserAssignedFunctionGroup();
//        userAssignedFunctionGroup3.setFunctionGroupId("function3");
//        userAssignedFunctionGroup3.setUser(user3);
//        entityManager.persist(userAssignedFunctionGroup3);
//
//        entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        HashSet<UserAssignedFunctionGroup> userAssignedFunctionGroups = new HashSet<>();
//        userAssignedFunctionGroups.add(userAssignedFunctionGroup1);
//        userAssignedFunctionGroups.add(userAssignedFunctionGroup2);
//        user1.setUserAssignedFunctionGroups(userAssignedFunctionGroups);
//        entityManager.persist(user1);
//
//        HashSet<UserAssignedFunctionGroup> userAssignedFunctionGroups3 = new HashSet<>();
//        userAssignedFunctionGroups3.add(userAssignedFunctionGroup3);
//        user3.setUserAssignedFunctionGroups(userAssignedFunctionGroups3);
//        entityManager.persist(user3);
//
//        Group group1 = new Group();
//        group1.setGroupId("group1");
//
//        Group group2 = new Group();
//        group2.setGroupId("group2");
//
//        HashSet<Group> setGroup1 = new HashSet<>();
//        setGroup1.add(group1);
//        setGroup1.add(group2);
//        userAssignedFunctionGroup1.setGroups(setGroup1);
//
//        HashSet<Group> setGroup2 = new HashSet<>();
//        setGroup2.add(group2);
//        userAssignedFunctionGroup2.setGroups(setGroup2);
//
//        HashSet<Group> setGroup3 = new HashSet<>();
//        setGroup3.add(group1);
//        userAssignedFunctionGroup3.setGroups(setGroup3);
//        entityManager.getTransaction().commit();



    }
}
