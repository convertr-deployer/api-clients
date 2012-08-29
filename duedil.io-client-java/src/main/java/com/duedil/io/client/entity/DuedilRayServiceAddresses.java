/**
 * DuedilApiClient
 * @copyright 2012 Duedil Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.duedil.io.client.entity;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client.entity
 */
public class DuedilRayServiceAddresses extends Entity {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String address1;

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    private String address2;

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    private String address3;

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    private String address4;

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    private String address5;

    public String getAddress5() {
        return address5;
    }

    public void setAddress5(String address5) {
        this.address5 = address5;
    }

    private String postcode;

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    private String postalarea;

    public String getPostalarea() {
        return postalarea;
    }

    public void setPostalarea(String postalarea) {
        this.postalarea = postalarea;
    }

    private String careof;

    public String getCareof() {
        return careof;
    }

    public void setCareof(String careof) {
        this.careof = careof;
    }

    private String pobox;

    public String getPobox() {
        return pobox;
    }

    public void setPobox(String pobox) {
        this.pobox = pobox;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DuedilRayServiceAddresses that = (DuedilRayServiceAddresses) o;

        if (id != that.id) return false;
        if (address1 != null ? !address1.equals(that.address1) : that.address1 != null) return false;
        if (address2 != null ? !address2.equals(that.address2) : that.address2 != null) return false;
        if (address3 != null ? !address3.equals(that.address3) : that.address3 != null) return false;
        if (address4 != null ? !address4.equals(that.address4) : that.address4 != null) return false;
        if (address5 != null ? !address5.equals(that.address5) : that.address5 != null) return false;
        if (careof != null ? !careof.equals(that.careof) : that.careof != null) return false;
        if (pobox != null ? !pobox.equals(that.pobox) : that.pobox != null) return false;
        if (postalarea != null ? !postalarea.equals(that.postalarea) : that.postalarea != null) return false;
        if (postcode != null ? !postcode.equals(that.postcode) : that.postcode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (address2 != null ? address2.hashCode() : 0);
        result = 31 * result + (address3 != null ? address3.hashCode() : 0);
        result = 31 * result + (address4 != null ? address4.hashCode() : 0);
        result = 31 * result + (address5 != null ? address5.hashCode() : 0);
        result = 31 * result + (postcode != null ? postcode.hashCode() : 0);
        result = 31 * result + (postalarea != null ? postalarea.hashCode() : 0);
        result = 31 * result + (careof != null ? careof.hashCode() : 0);
        result = 31 * result + (pobox != null ? pobox.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DuedilRayServiceAddresses{" +
                "id=" + id +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", address3='" + address3 + '\'' +
                ", address4='" + address4 + '\'' +
                ", address5='" + address5 + '\'' +
                ", postcode='" + postcode + '\'' +
                ", postalarea='" + postalarea + '\'' +
                ", careof='" + careof + '\'' +
                ", pobox='" + pobox + '\'' +
                '}';
    }
}
