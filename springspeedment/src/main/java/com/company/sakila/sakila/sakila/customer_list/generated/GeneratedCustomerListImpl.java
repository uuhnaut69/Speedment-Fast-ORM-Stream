package com.company.sakila.sakila.sakila.customer_list.generated;

import com.company.sakila.sakila.sakila.customer_list.CustomerList;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.company.sakila.sakila.sakila.customer_list.CustomerList}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCustomerListImpl implements CustomerList {
    
    private int id;
    private String name;
    private String address;
    private String zipCode;
    private String phone;
    private String city;
    private String country;
    private String notes;
    private short sid;
    
    protected GeneratedCustomerListImpl() {}
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
    
    @Override
    public String getAddress() {
        return address;
    }
    
    @Override
    public Optional<String> getZipCode() {
        return Optional.ofNullable(zipCode);
    }
    
    @Override
    public String getPhone() {
        return phone;
    }
    
    @Override
    public String getCity() {
        return city;
    }
    
    @Override
    public String getCountry() {
        return country;
    }
    
    @Override
    public String getNotes() {
        return notes;
    }
    
    @Override
    public short getSid() {
        return sid;
    }
    
    @Override
    public CustomerList setId(int id) {
        this.id = id;
        return this;
    }
    
    @Override
    public CustomerList setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public CustomerList setAddress(String address) {
        this.address = address;
        return this;
    }
    
    @Override
    public CustomerList setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }
    
    @Override
    public CustomerList setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    
    @Override
    public CustomerList setCity(String city) {
        this.city = city;
        return this;
    }
    
    @Override
    public CustomerList setCountry(String country) {
        this.country = country;
        return this;
    }
    
    @Override
    public CustomerList setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    
    @Override
    public CustomerList setSid(short sid) {
        this.sid = sid;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "      + Objects.toString(getId()));
        sj.add("name = "    + Objects.toString(OptionalUtil.unwrap(getName())));
        sj.add("address = " + Objects.toString(getAddress()));
        sj.add("zipCode = " + Objects.toString(OptionalUtil.unwrap(getZipCode())));
        sj.add("phone = "   + Objects.toString(getPhone()));
        sj.add("city = "    + Objects.toString(getCity()));
        sj.add("country = " + Objects.toString(getCountry()));
        sj.add("notes = "   + Objects.toString(getNotes()));
        sj.add("sid = "     + Objects.toString(getSid()));
        return "CustomerListImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof CustomerList)) { return false; }
        final CustomerList thatCustomerList = (CustomerList)that;
        if (this.getId() != thatCustomerList.getId()) { return false; }
        if (!Objects.equals(this.getName(), thatCustomerList.getName())) { return false; }
        if (!Objects.equals(this.getAddress(), thatCustomerList.getAddress())) { return false; }
        if (!Objects.equals(this.getZipCode(), thatCustomerList.getZipCode())) { return false; }
        if (!Objects.equals(this.getPhone(), thatCustomerList.getPhone())) { return false; }
        if (!Objects.equals(this.getCity(), thatCustomerList.getCity())) { return false; }
        if (!Objects.equals(this.getCountry(), thatCustomerList.getCountry())) { return false; }
        if (!Objects.equals(this.getNotes(), thatCustomerList.getNotes())) { return false; }
        if (this.getSid() != thatCustomerList.getSid()) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getName()));
        hash = 31 * hash + Objects.hashCode(getAddress());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getZipCode()));
        hash = 31 * hash + Objects.hashCode(getPhone());
        hash = 31 * hash + Objects.hashCode(getCity());
        hash = 31 * hash + Objects.hashCode(getCountry());
        hash = 31 * hash + Objects.hashCode(getNotes());
        hash = 31 * hash + Short.hashCode(getSid());
        return hash;
    }
}