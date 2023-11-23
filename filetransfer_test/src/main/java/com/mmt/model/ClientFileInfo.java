package com.mmt.model;
import java.time.*;


public class ClientFileInfo {
    private String fileName;
    private Long size;
    private String description;
    private LocalDate uploadDate;
    private String fileLocation;

    public ClientFileInfo(String fileName, Long size, String description, LocalDate uploadDate, String fileLocation) {
        this.fileName = fileName;
        this.size = size;
        this.description = description;
        this.uploadDate = uploadDate;
        this.fileLocation = fileLocation;
    }

    public ClientFileInfo(String fileName, Long size, String description, String fileLocation) {
        this.fileName = fileName;
        this.size = size;
        this.description = description;
        this.fileLocation = fileLocation;
        this.uploadDate = LocalDate.now();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDate uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public String formatFileSize() {
        if (this.size < 1024) {
            return this.size + " B";
        } else if (size < 1024 * 1024) {
            double sizeInKB = this.size / 1024.0;
            return String.format("%.2f KB", sizeInKB);
        } else if (this.size < 1024 * 1024 * 1024) {
            double sizeInMB = this.size / (1024.0 * 1024);
            return String.format("%.2f MB", sizeInMB);
        } else {
            double sizeInGB = this.size / (1024.0 * 1024 * 1024);
            return String.format("%.2f GB", sizeInGB);
        }
    }

    public static String formatFileSize(long sizeInBytes) {
        if (sizeInBytes < 1024) {
            return sizeInBytes + " B";
        } else if (sizeInBytes < 1024 * 1024) {
            double sizeInKB = sizeInBytes / 1024.0;
            return String.format("%.2f KB", sizeInKB);
        } else if (sizeInBytes < 1024 * 1024 * 1024) {
            double sizeInMB = sizeInBytes / (1024.0 * 1024);
            return String.format("%.2f MB", sizeInMB);
        } else {
            double sizeInGB = sizeInBytes / (1024.0 * 1024 * 1024);
            return String.format("%.2f GB", sizeInGB);
        }
    }
}
