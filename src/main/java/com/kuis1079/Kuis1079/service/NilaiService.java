/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1079.Kuis1079.service;

import com.kuis1079.Kuis1079.entity.Nilai;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kuis1079.Kuis1079.repo.NilaiRepo;

/**
 *
 * @author Hendro Steven
 */
@Service("NilaiService")
@Transactional
public class NilaiService {

    @Autowired
    private NilaiRepo repo;

    public Nilai insertOrUpdate(Nilai nilai) {
        return repo.save(nilai);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<Nilai> findAll() {
        return repo.findAllProduct();
    }

    public List<Nilai> findByCv(Long cvId) {
        return repo.findByCv(cvId);
    }

    public List<Nilai> findByName(String name) {
        return repo.findByName("%" + name + "%");
    }
}
