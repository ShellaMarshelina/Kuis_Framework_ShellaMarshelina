/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1079.Kuis1079.service;

import com.kuis1079.Kuis1079.entity.Cv;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kuis1079.Kuis1079.repo.CvRepo;

/**
 *
 * @author Hendro Steven
 */
@Service("cvService")
@Transactional
public class CvService {

    @Autowired
    private CvRepo repo;

    public Cv insert(Cv cv) {
        return repo.save(cv);
    }
    
    public Cv update(Cv cv) {
        return repo.save(cv);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Cv getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Cv> getAll(){
        return repo.findAllCv();
    }
}
