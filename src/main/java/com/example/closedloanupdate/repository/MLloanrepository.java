package com.example.closedloanupdate.repository;

import com.example.closedloanupdate.Model.Mloan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MLloanrepository extends JpaRepository<Mloan, String> {

    List<Mloan> findMloanByExternalId(String externalId);}
