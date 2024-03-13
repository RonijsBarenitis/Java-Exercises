package co.develhope.Services_File_Upload.Download.services;

import lombok.SneakyThrows;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;

@Service
public class FileStorageService {

    @Value("${fileRepositoryFolder}")
    private String fileRepositoryFolder;

    @SneakyThrows
    public String upload(MultipartFile file) {

        String extension = FilenameUtils.getExtension(file.getOriginalFilename());
        System.out.println("Extension" +extension);
        String newFileName = UUID.randomUUID().toString();
        System.out.println("NewFileName" +newFileName);
        String completeNewFileName = newFileName +"." +extension;
        System.out.println("Complete name " +completeNewFileName);

        File finalFolder = new File(fileRepositoryFolder);
        if (!finalFolder.exists()) throw new IOException("The folder doesn't exist");
        if (!finalFolder.isDirectory()) throw new IOException("The folder is not a directory");

        File finalDestination = new File(fileRepositoryFolder + "\\" +completeNewFileName);
        if (finalDestination.exists()) throw new IOException("The file already exists");

        file.transferTo(finalDestination);
        return completeNewFileName;

    }

    @SneakyThrows
    public byte[] download(String fileName) {
        File file = new File(fileRepositoryFolder +"\\" +fileName);
        if(!file.exists()) throw new IOException("That file doesn't exist");
        return IOUtils.toByteArray(new FileInputStream(file));
    }
}
