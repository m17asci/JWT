package com.example.SMARTIQ.Service;
import com.example.SMARTIQ.Model.Gallery;
import com.example.SMARTIQ.Repository.GalleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class GalleryService {
        @Autowired
        private GalleryRepository galleryRepository;

        public Gallery saveOrUpdateAGallery(Gallery gallery) {
            return galleryRepository.save(gallery);
        }

        public Gallery findGalleryById(Long galleryId) {
            return galleryRepository.getByGalleryId(galleryId);
        }

        public Iterable<Gallery> findAll() {
            return galleryRepository.findAll();
        }

        public String deleteGallery(Long galleryId) {
            galleryRepository.deleteById(galleryId);
            return "gallery removed"+galleryId;
        }

        public Gallery updateGallery(Gallery gallery) {

            Gallery existingGallery = galleryRepository.findById((long) gallery.getGalleryId()).orElse(null);
            existingGallery.setGalleryName(gallery.getGalleryName());
            existingGallery.setLocation(gallery.getLocation());
            return galleryRepository.save(existingGallery);
        }
    }


