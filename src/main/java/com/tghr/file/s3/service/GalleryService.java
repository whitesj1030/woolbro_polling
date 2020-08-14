package com.tghr.file.s3.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import com.tghr.file.s3.domain.repository.GalleryRepository;
import com.tghr.file.s3.dto.GalleryDto;

@Service
@AllArgsConstructor
public class GalleryService {
    private GalleryRepository galleryRepository;

    public void savePost(GalleryDto galleryDto) {
        galleryRepository.save(galleryDto.toEntity());
    }
}
