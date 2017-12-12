/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1079.Kuis1079.controller;

import com.kuis1079.Kuis1079.entity.Cv;
import com.kuis1079.Kuis1079.service.CvService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/cv_1079")
public class CvController {

    @Autowired
    private CvService cvService;

    @RequestMapping(method = RequestMethod.POST)
    public Cv insert(@RequestBody Cv cv) {
        return cvService.insert(cv);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Cv update(@RequestBody Cv cv) {
        return cvService.update(cv);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return cvService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Cv getById(@PathVariable("id") Long id){
        return cvService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Cv> getAll(){
        return cvService.getAll();
    }
}
