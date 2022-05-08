package com.example.SMARTIQ.Controller;
import com.example.SMARTIQ.Model.Gallery;
import com.example.SMARTIQ.Service.GalleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/gallery")
@CrossOrigin
public class GalleryController {
    @Autowired
    private GalleryService galleryService;
    @PostMapping
    public ResponseEntity<Gallery> addAGallery(@RequestBody Gallery gallery) {
        return new ResponseEntity<Gallery>(galleryService.saveOrUpdateAGallery(gallery), HttpStatus.CREATED);
    }
    @GetMapping("")
    public Iterable<Gallery> getAllGalleries(){
        return galleryService.findAll();
    }
    @GetMapping("/{galleryId}")
    public ResponseEntity<Gallery> getGalleryById(@PathVariable Long galleryId) {
        return new ResponseEntity<Gallery>(galleryService.findGalleryById(galleryId), HttpStatus.OK);
    }
    @DeleteMapping("/{galleryId}")
    public String deleteGallery(@PathVariable Long galleryId){
        return galleryService.deleteGallery(galleryId);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Gallery> update(@RequestBody Gallery gallery, @PathVariable Long id) {
        return new ResponseEntity<Gallery> (galleryService.updateGallery(gallery),HttpStatus.OK);
    }
}
