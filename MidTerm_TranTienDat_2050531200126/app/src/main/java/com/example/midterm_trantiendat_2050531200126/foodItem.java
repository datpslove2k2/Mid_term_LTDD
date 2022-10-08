package com.example.midterm_trantiendat_2050531200126;

public class foodItem {
    private String titleFood;
    private int number;
    private int feeCount;
    private int totalCount;
    private int plusBtn;
    private int minusBtn;
    private int img;

    public foodItem(String titleFood, int number, int feeCount, int totalCount, int plusBtn, int minusBtn, int img ) {
        this.titleFood = titleFood;
        this.number = number;
        this.feeCount = feeCount;
        this.totalCount = totalCount;
        this.plusBtn = plusBtn;
        this.minusBtn = minusBtn;
        this.img = img;
    }

    public String getTitleFood() {
        return titleFood;
    }

    public void setTitleFood(String titleFood) {
        this.titleFood = titleFood;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFeeCount() {
        return feeCount;
    }

    public void setFeeCount(int feeCount) {
        this.feeCount = feeCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPlusBtn() {
        return plusBtn;
    }

    public void setPlusBtn(int plusBtn) {
        this.plusBtn = plusBtn;
    }

    public int getMinusBtn() {
        return minusBtn;
    }

    public void setMinusBtn(int minusBtn) {
        this.minusBtn = minusBtn;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
