//package com.flag.robot_dispatch.model;
//
//import java.io.Serializable;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
//@Entity
//@Table(name = "vehicle_image")
//public class VehicleImage implements Serializable {
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    private String url;
//
//    @OneToOne(mappedBy = "image")
//    private VehicleType type;
//
//    public VehicleImage() {}
//
//    public VehicleImage(String url, VehicleType type) {
//        this.url = url;
//        this.type = type;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public VehicleImage setUrl(String url) {
//        this.url = url;
//        return this;
//    }
//
//    public VehicleType getVehicleType() {
//        return type;
//    }
//
//    public VehicleImage setVehicleType(VehicleType type) {
//        this.type = type;
//        return this;
//    }
//}
