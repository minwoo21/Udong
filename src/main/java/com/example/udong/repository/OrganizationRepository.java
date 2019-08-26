package com.example.udong.repository;

import com.example.udong.model.OrganizationBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends JpaRepository<OrganizationBean, String> {

}