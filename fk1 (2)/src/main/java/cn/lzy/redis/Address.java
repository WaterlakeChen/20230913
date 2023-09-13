package cn.lzy.redis;

import org.springframework.data.redis.core.index.Indexed;

public class Address {
    @Indexed
    private String city;
    @Indexed
    private String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public Address() {

    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
