package com.mmt.model;

import java.time.LocalDate;

public class ServerFileInfo {
    private String fileName;
    private Long size;
    private String description;
    private LocalDate uploadDate;
    private String sender;
    private String senderIP;
    private boolean online;
    public ServerFileInfo(String fileName, Long size, String description, LocalDate uploadDate, String sender,
            String senderIP, boolean online) {
        this.fileName = fileName;
        this.size = size;
        this.description = description;
        this.uploadDate = uploadDate;
        this.senderIP = senderIP;
        this.online = online;
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
    public String getSender() {
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }
    public String getSenderIP() {
        return senderIP;
    }
    public void setSenderIP(String senderIP) {
        this.senderIP = senderIP;
    }
    public boolean isOnline() {
        return online;
    }
    public void setOnline(boolean online) {
        this.online = online;
    }
    
}
