/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1079.Kuis1079.controller;

import com.kuis1079.Kuis1079.entity.Nilai;
import com.kuis1079.Kuis1079.service.NilaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.kuis1079.Kuis1079.repo.NilaiRepo;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/nilai")
public class NilaiController {
    
    @Autowired
    private NilaiService nilaiService;
    
    @RequestMapping(method = RequestMethod.POST)
    public Nilai insertOrUpdate(@RequestBody Nilai nilai){
        return nilaiService.insertOrUpdate(nilai);
    }
  
}
