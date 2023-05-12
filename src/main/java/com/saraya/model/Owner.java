package com.saraya.model;

import java.util.List;
import java.util.Objects;

public class Owner {
   private String id;
   private String firstName;
    private String lastName;
    private String address;
    private String city;
    private int telephone;
    private List<Pet> pets;
 public Owner() {

 }

 public Owner(String id) {
  this.id = id;
 }

 public Owner(String id, String firstName, String lastName, String address, String city, int telephone, List<Pet> pets) {
  this.id = id;
  this.firstName = firstName;
  this.lastName = lastName;
  this.address = address;
  this.city = city;
  this.telephone = telephone;
  this.pets = pets;
 }



 public String getId() {
  return id;
 }

 public void setId(String id) {
  this.id = id;
 }

 public String getFirstName() {
  return firstName;
 }

 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }

 public String getLastName() {
  return lastName;
 }

 public void setLastName(String lastName) {
  this.lastName = lastName;
 }

 public String getAddress() {
  return address;
 }

 public void setAddress(String address) {
  this.address = address;
 }

 public String getCity() {
  return city;
 }

 public void setCity(String city) {
  this.city = city;
 }

 public int getTelephone() {
  return telephone;
 }

 public void setTelephone(int telephone) {
  this.telephone = telephone;
 }

 public List<Pet> getPets() {
  return pets;
 }

 public void setPets(List<Pet> pets) {
  this.pets = pets;
 }

 @Override
 public boolean equals(Object o) {
  if (this == o) return true;
  if (!(o instanceof Owner)) return false;
  Owner owner = (Owner) o;
  return getId().equals(owner.getId());
 }

 @Override
 public int hashCode() {
  return Objects.hash(getId());
 }
}
