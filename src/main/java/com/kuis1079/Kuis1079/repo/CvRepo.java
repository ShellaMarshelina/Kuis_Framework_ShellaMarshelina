/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1079.Kuis1079.repo;

import com.kuis1079.Kuis1079.entity.Cv;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface CvRepo extends CrudRepository<Cv, Long> {

    @Query("select c from Cv c")
    public List<Cv> findAllCv();
}
