package com.example.closedloanupdate.repository;
import com.example.closedloanupdate.Model.Mclient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface MClientrepository extends JpaRepository<Mclient, String> {
    List<Mclient> findMclientByExternalId(String externalId);
}

