package com.tghr.file.s3.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tghr.file.s3.domain.entity.GalleryEntity;

public interface GalleryRepository extends JpaRepository<GalleryEntity, Long> {
}
