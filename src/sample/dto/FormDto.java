package sample.dto;

public class FormDto {

private String header;

private String firstButton;

private String secondButton;

private String thirdButton;

private String firstImage;

private String secondImage;

private String thirdImage;

private String resultImage;

    public String getResultImage() {
        return resultImage;
    }

    public void setResultImage(String resultImage) {
        this.resultImage = resultImage;
    }

    private String sign;

    public FormDto() {
    }

    public FormDto(String header, String firstButton, String secondButton, String thirdButton, String firstImage, String secondImage, String thirdImage, String resultImage, String sign) {
        this.header = header;
        this.firstButton = firstButton;
        this.secondButton = secondButton;
        this.thirdButton = thirdButton;
        this.firstImage = firstImage;
        this.secondImage = secondImage;
        this.thirdImage = thirdImage;
        this.resultImage = resultImage;
        this.sign = sign;
    }



    public String getHeader() {
        return header;
    }

    public String getFirstButton() {
        return firstButton;
    }

    public String getSecondButton() {
        return secondButton;
    }

    public String getThirdButton() {
        return thirdButton;
    }

    public String getFirstImage() {
        return firstImage;
    }

    public String getSecondImage() {
        return secondImage;
    }

    public String getThirdImage() {
        return thirdImage;
    }

    public String getSign() {
        return sign;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setFirstButton(String firstButton) {
        this.firstButton = firstButton;
    }

    public void setSecondButton(String secondButton) {
        this.secondButton = secondButton;
    }

    public void setThirdButton(String thirdButton) {
        this.thirdButton = thirdButton;
    }

    public void setFirstImage(String firstImage) {
        this.firstImage = firstImage;
    }

    public void setSecondImage(String secondImage) {
        this.secondImage = secondImage;
    }

    public void setThirdImage(String thirdImage) {
        this.thirdImage = thirdImage;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
