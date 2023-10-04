package com.appslab.imagedownloaderusinggithub;

public class DataModel {
    private String name;
    private String imgUrl;
    private String pdfUrl;

    public DataModel(String name, String imgUrl, String pdfUrl) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.pdfUrl = pdfUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }
}
