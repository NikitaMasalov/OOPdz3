package data;

public enum Country {
    RU("Россия"), CN("Китай"), US("Омерика");

    private String countryName;

    Country(String countryName){
        this.countryName = countryName;
    }

    public String getCountryName(){
        return countryName;
    }
}
