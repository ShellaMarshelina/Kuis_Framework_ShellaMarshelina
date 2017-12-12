/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1079.Kuis1079.repo;

import com.kuis1079.Kuis1079.entity.Nilai;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author Hendro Steven
 */
public interface NilaiRepo extends CrudRepository<Nilai, Long>{
    
    @Query("select p from Nilai p")
    public List<Nilai> findAllProduct();
    
    @Query("select p from Nilai p where p.v.id= :id")
    public List<Nilai> findByCv(@Param("id") Long id);
    
    @Query("select p from Nilai p where LOWER(p.name) LIKE LOWER(:name)")
    public List<Nilai> findByName(@Param("name") String name);
}
