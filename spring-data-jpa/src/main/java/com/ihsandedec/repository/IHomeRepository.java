package com.ihsandedec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ihsandedec.entites.Home;

@Repository
public interface IHomeRepository extends JpaRepository<Home, Long> {

}
