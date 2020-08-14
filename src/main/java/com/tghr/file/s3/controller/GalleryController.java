package com.tghr.file.s3.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.tghr.file.s3.dto.GalleryDto;
import com.tghr.file.s3.service.GalleryService;
import com.tghr.file.s3.service.S3Service;

import java.io.IOException;

@Controller
@AllArgsConstructor
public class GalleryController {
    private S3Service s3Service;
    private GalleryService galleryService;

    @GetMapping("/gallery")
    public String dispWrite() {

        return "/gallery";
    }

    @PostMapping("/gallery")
    public String execWrite(GalleryDto galleryDto, MultipartFile file) throws IOException {
        String imgPath = s3Service.upload(file);
        galleryDto.setFilePath(imgPath);

        galleryService.savePost(galleryDto);

        return "redirect:/gallery";
    }
}

