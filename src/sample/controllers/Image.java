package sample.controllers;

import java.io.File;

public class Image {

    String imageName;

    String imageSrc;

    public Image(String imageName, String imageSrc) {
        this.imageName = imageName;
        this.imageSrc = imageSrc;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }
}
