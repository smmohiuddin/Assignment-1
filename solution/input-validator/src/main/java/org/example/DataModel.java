package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class DataModel {
    private String id;
    private String name;
    private String address;
    private String zip;

    public DataModel() {

    }

    public DataModel(String id, String name, String address, String zip) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.zip = zip;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataModel dataModel = (DataModel) o;
        return // Objects.equals(id, dataModel.id) &&
                Objects.equals(name, dataModel.name) && Objects.equals(address, dataModel.address) && Objects.equals(zip, dataModel.zip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, zip);
    }

    @Override
    public String toString() {
        return "DataModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }

    public boolean invalid() {
        return StringUtils.isBlank(name) || StringUtils.isBlank(address) || StringUtils.isBlank(zip);
    }
}
