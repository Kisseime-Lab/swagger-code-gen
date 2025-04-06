package com.example.swagger_codegen_maven;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.swagger_codegen_maven.api.AnnonceApi;
import com.example.swagger_codegen_maven.model.Annonce;

@RestController
public class AnnonceController implements AnnonceApi {

    @Override
    public ResponseEntity<Annonce> createAnnonce(Annonce annonce) throws Exception {
        // TODO Auto-generated method stub
        return AnnonceApi.super.createAnnonce(annonce);
    }

    @Override
    public ResponseEntity<Void> deleteAnnonce(String id, String byAdmin) throws Exception {
        // TODO Auto-generated method stub
        return AnnonceApi.super.deleteAnnonce(id, byAdmin);
    }

    @Override
    public ResponseEntity<Annonce> getAnnonceById(String id, String byAdmin) throws Exception {
        // TODO Auto-generated method stub
        return AnnonceApi.super.getAnnonceById(id, byAdmin);
    }

    @Override
    public ResponseEntity<Object> getLatestAnnonce(String cityDepart, String cityArrivee, String userId, Integer page,
            Integer size, String byAdmin) throws Exception {
        // TODO Auto-generated method stub
        // return AnnonceApi.super.getLatestAnnonce(cityDepart, cityArrivee, userId, page, size, byAdmin);
        return new ResponseEntity<Object>(List.of("null"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Annonce> updateAnnonce(String id, String byAdmin, Annonce annonce) throws Exception {
        // TODO Auto-generated method stub
        return AnnonceApi.super.updateAnnonce(id, byAdmin, annonce);
    }
    
}
