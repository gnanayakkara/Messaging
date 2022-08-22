package com.gnanayakkara.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gnanayakkara.springboot.entity.WikimediaData;

/*
 * 21 Aug 2022
 */
public interface WikimediaDataRepositry extends JpaRepository<WikimediaData, Long>{

}
