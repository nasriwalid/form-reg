package com.nojoum.al.malaeb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nojoum.al.malaeb.entiies.Membre;

public interface MemberRepository extends JpaRepository<Membre, Long >{

}
