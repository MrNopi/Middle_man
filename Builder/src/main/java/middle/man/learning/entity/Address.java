package middle.man.learning.entity;

/*
 Цей клас потокобезпечний, бо на кожному кроці, незалежно від можливостей потоку - цей клас незмінний
 що надає впевненість в тому, що окремі потоки будуть працювати з одними і тими самими незміннимими даними
 */

import java.util.Objects;

public final class Address {
    private final String street;
    private final String city;
    private final int houseNumber;

    public Address(String street, String city, int houseNumber) {
        this.street = street;
        this.city = city;
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return houseNumber == address.houseNumber && Objects.equals(street, address.street) && Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, houseNumber);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
