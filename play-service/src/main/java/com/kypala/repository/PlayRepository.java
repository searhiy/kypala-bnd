package com.kypala.repository;

import com.kypala.domain.Play;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PlayRepository extends JpaRepository<Play, Long>{

}
