package com.deli;

public class Product {

public double getPrice() {
    return 0;
}
        private double prices;
        private String toppings;
        private String cheese;
        private String sauces;
        private String drinks;
        private String chips;
        private  String meats;

        public Product(double prices, String toppings, String cheese, String sauces, String drinks, String chips, String meats) {
            this.prices = prices;
            this.toppings = toppings;
            this.cheese = cheese;
            this.sauces = sauces;
            this.drinks = drinks;
            this.chips = chips;
            this.meats = meats;
        }


        public double getPrices() {
            return prices;
        }

        public void setPrices(double prices) {
            this.prices = prices;
        }

        public String getToppings() {
            return toppings;
        }

        public void setToppings(String toppings) {
            this.toppings = toppings;
        }

        public String getCheese() {
            return cheese;
        }

        public void setCheese(String cheese) {
            this.cheese = cheese;
        }

        public String getSauces() {
            return sauces;
        }

        public void setSauces(String sauces) {
            this.sauces = sauces;
        }

        public String getDrinks() {
            return drinks;
        }

        public void setDrinks(String drinks) {
            this.drinks = drinks;
        }

        public String getChips() {
            return chips;
        }

        public void setChips(String chips) {
            this.chips = chips;
        }

        public String getMeats() {
            return meats;
        }

        public void setMeats(String meats) {
            this.meats = meats;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "prices=" + prices +
                    ", toppings='" + toppings + '\'' +
                    ", cheese='" + cheese + '\'' +
                    ", sauces='" + sauces + '\'' +
                    ", drinks='" + drinks + '\'' +
                    ", chips='" + chips + '\'' +
                    ", meats='" + meats + '\'' +
                    '}';
        }


}
