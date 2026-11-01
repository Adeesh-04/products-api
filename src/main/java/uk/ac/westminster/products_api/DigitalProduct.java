package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable {
    private double discountedPrice;
    private String downloadUrl;
    private double fileSizeMb;
    public DigitalProduct(){

    }
    public DigitalProduct(Long id,String name,double price,String downloadUrl,double fileSizeMb) {
        super(id, name, price);
        this.downloadUrl=downloadUrl;
        this.fileSizeMb=fileSizeMb;
        this.discountedPrice=price;
    }
    public String getDownloadUrl(){
        return downloadUrl;
    }
    public double getFileSizeMb(){
        return fileSizeMb;
    }

    @Override
    public String getSummary(){
        return "Digital:" + getName()+ " |Download:"+ downloadUrl;
    }

    @Override
    public void applyDiscount(double rate){
        this.discountedPrice=getPrice()*(1-rate);
    }
    @Override
    public double getDiscountedPrice(){
        return discountedPrice;
    }
}
