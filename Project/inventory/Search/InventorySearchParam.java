package Project.inventory.Search;

public class InventorySearchParam {
    String carId;
    String carBrand;
    String carModel;
    String exteriorColor;
    String interiorColor;
    String yearMin;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    public String getYearMin() {
        return yearMin;
    }

    public void setYearMin(String yearMin) {
        this.yearMin = yearMin;
    }

    public String getYearMax() {
        return yearMax;
    }

    public void setYearMax(String yearMax) {
        this.yearMax = yearMax;
    }

    public String getPriceMin() {
        return priceMin;
    }

    public void setPriceMin(String priceMin) {
        this.priceMin = priceMin;
    }

    public String getPriceMax() {
        return priceMax;
    }

    public void setPriceMax(String priceMax) {
        this.priceMax = priceMax;
    }

    public String getMilesMin() {
        return milesMin;
    }

    public void setMilesMin(String milesMin) {
        this.milesMin = milesMin;
    }

    public String getMilesMax() {
        return milesMax;
    }

    public void setMilesMax(String milesMax) {
        this.milesMax = milesMax;
    }

    String yearMax;
    String priceMin;
    String priceMax;
    String milesMin;
    String milesMax;
}
