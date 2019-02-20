package Project.inventory.interfaces;

import java.util.*;

public interface Vehicle {
    public String getId();
    public String getDealerID();
    public void setDealerID(String dealerID);
    public String getYear();
    public void setYear(String year);
    public String getBrand();
    public void setBrand(String brand);
    public String getModel();
    public void setModel(String model);
    public boolean getIsNew();
    public void setNewOrUsed(boolean isNew);
    public String getPrice();
    public void setPrice(String price);
    public String getExteriorColor();
    public void setExteriorColor(String exteriorColor);
    public String getInteriorColor();
    public void setInteriorColor(String interiorColor);
    public List<String> getFeatures();
    public void setFeatures(List<String> features);
    public void addFeature(String feature);
    public String getMiles();
    public void setMiles(String miles);
    public List<String> getImages();
    public void setImages(List<String> images);
    public void addImages(String url);
    public String getFinalPrice();
    public void setFinalPrice(String finalPrice);
    public String getDiscountRate();
    public void setDiscountRate(String discountRate);
    public List<String> getSpecialIDs();
    public void setSpecialIDs(List<String> specialIDs);
}
