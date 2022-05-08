package com.example.SMARTIQ.Repository;
import com.example.SMARTIQ.Model.Gallery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GalleryRepository extends CrudRepository<Gallery,Long> {
    Gallery getByGalleryId(Long id);

}
