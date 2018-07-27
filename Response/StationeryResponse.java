package com.prism.pickany247.Response;

import java.util.List;

public class StationeryResponse {


    /**
     * filtered_products : [{"id":"119","Module":"grocery","main_category_id":"14","main_category_name":"Fruits","sub_category_id":"89","sub_category_name":"Fruits","product_id":"PIKG38562N","product_name":"Apple","ImagePath":"http://pickany247.com/grocery/grocery/","SingleImage":"../../image/grocery/product_images/PIKG38562N/4.jpg","AllImages":"../../image/grocery/product_images/PIKG38562N/4.jpg,../../image/grocery/product_images/PIKG38562N/5.jpg","brand_id":"124","product_type":"72","color":"","cart_type":"single","tax_rate":"0.00","item_id":"2028,2038","availability":"19,30","capacity":"500 gms,1 kgs","unit_price_incl_tax":"50.00,100.00","rating":"5.0","discount":"","eggless":"","eggless_amt":"","heart_shape":"","heart_shape_amt":"","flavour":"","message":""}]
     * message : Get Filtered Products
     */

    private String message;
    private List<FilteredProductsBean> filtered_products;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<FilteredProductsBean> getFiltered_products() {
        return filtered_products;
    }

    public void setFiltered_products(List<FilteredProductsBean> filtered_products) {
        this.filtered_products = filtered_products;
    }

    public static class FilteredProductsBean {
        /**
         * id : 119
         * Module : grocery
         * main_category_id : 14
         * main_category_name : Fruits
         * sub_category_id : 89
         * sub_category_name : Fruits
         * product_id : PIKG38562N
         * product_name : Apple
         * ImagePath : http://pickany247.com/grocery/grocery/
         * SingleImage : ../../image/grocery/product_images/PIKG38562N/4.jpg
         * AllImages : ../../image/grocery/product_images/PIKG38562N/4.jpg,../../image/grocery/product_images/PIKG38562N/5.jpg
         * brand_id : 124
         * product_type : 72
         * color :
         * cart_type : single
         * tax_rate : 0.00
         * item_id : 2028,2038
         * availability : 19,30
         * capacity : 500 gms,1 kgs
         * unit_price_incl_tax : 50.00,100.00
         * rating : 5.0
         * discount :
         * eggless :
         * eggless_amt :
         * heart_shape :
         * heart_shape_amt :
         * flavour :
         * message :
         */

        private String id;
        private String Module;
        private String main_category_id;
        private String main_category_name;
        private String sub_category_id;
        private String sub_category_name;
        private String product_id;
        private String product_name;
        private String ImagePath;
        private String SingleImage;
        private String AllImages;
        private String brand_id;
        private String product_type;
        private String color;
        private String cart_type;
        private String tax_rate;
        private String item_id;
        private String availability;
        private String capacity;
        private String unit_price_incl_tax;
        private String rating;
        private String discount;
        private String eggless;
        private String eggless_amt;
        private String heart_shape;
        private String heart_shape_amt;
        private String flavour;
        private String message;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getModule() {
            return Module;
        }

        public void setModule(String Module) {
            this.Module = Module;
        }

        public String getMain_category_id() {
            return main_category_id;
        }

        public void setMain_category_id(String main_category_id) {
            this.main_category_id = main_category_id;
        }

        public String getMain_category_name() {
            return main_category_name;
        }

        public void setMain_category_name(String main_category_name) {
            this.main_category_name = main_category_name;
        }

        public String getSub_category_id() {
            return sub_category_id;
        }

        public void setSub_category_id(String sub_category_id) {
            this.sub_category_id = sub_category_id;
        }

        public String getSub_category_name() {
            return sub_category_name;
        }

        public void setSub_category_name(String sub_category_name) {
            this.sub_category_name = sub_category_name;
        }

        public String getProduct_id() {
            return product_id;
        }

        public void setProduct_id(String product_id) {
            this.product_id = product_id;
        }

        public String getProduct_name() {
            return product_name;
        }

        public void setProduct_name(String product_name) {
            this.product_name = product_name;
        }

        public String getImagePath() {
            return ImagePath;
        }

        public void setImagePath(String ImagePath) {
            this.ImagePath = ImagePath;
        }

        public String getSingleImage() {
            return SingleImage;
        }

        public void setSingleImage(String SingleImage) {
            this.SingleImage = SingleImage;
        }

        public String getAllImages() {
            return AllImages;
        }

        public void setAllImages(String AllImages) {
            this.AllImages = AllImages;
        }

        public String getBrand_id() {
            return brand_id;
        }

        public void setBrand_id(String brand_id) {
            this.brand_id = brand_id;
        }

        public String getProduct_type() {
            return product_type;
        }

        public void setProduct_type(String product_type) {
            this.product_type = product_type;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getCart_type() {
            return cart_type;
        }

        public void setCart_type(String cart_type) {
            this.cart_type = cart_type;
        }

        public String getTax_rate() {
            return tax_rate;
        }

        public void setTax_rate(String tax_rate) {
            this.tax_rate = tax_rate;
        }

        public String getItem_id() {
            return item_id;
        }

        public void setItem_id(String item_id) {
            this.item_id = item_id;
        }

        public String getAvailability() {
            return availability;
        }

        public void setAvailability(String availability) {
            this.availability = availability;
        }

        public String getCapacity() {
            return capacity;
        }

        public void setCapacity(String capacity) {
            this.capacity = capacity;
        }

        public String getUnit_price_incl_tax() {
            return unit_price_incl_tax;
        }

        public void setUnit_price_incl_tax(String unit_price_incl_tax) {
            this.unit_price_incl_tax = unit_price_incl_tax;
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getDiscount() {
            return discount;
        }

        public void setDiscount(String discount) {
            this.discount = discount;
        }

        public String getEggless() {
            return eggless;
        }

        public void setEggless(String eggless) {
            this.eggless = eggless;
        }

        public String getEggless_amt() {
            return eggless_amt;
        }

        public void setEggless_amt(String eggless_amt) {
            this.eggless_amt = eggless_amt;
        }

        public String getHeart_shape() {
            return heart_shape;
        }

        public void setHeart_shape(String heart_shape) {
            this.heart_shape = heart_shape;
        }

        public String getHeart_shape_amt() {
            return heart_shape_amt;
        }

        public void setHeart_shape_amt(String heart_shape_amt) {
            this.heart_shape_amt = heart_shape_amt;
        }

        public String getFlavour() {
            return flavour;
        }

        public void setFlavour(String flavour) {
            this.flavour = flavour;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
