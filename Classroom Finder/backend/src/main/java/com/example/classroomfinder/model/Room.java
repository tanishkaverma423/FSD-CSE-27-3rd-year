package com.example.classroomfinder.model;
public class Room {
    private String id, name, building; private int capacity;
    public Room(String id, String name, int capacity, String building) { this.id=id; this.name=name; this.capacity=capacity; this.building=building; }
    public String getId(){return id;} public String getName(){return name;} public int getCapacity(){return capacity;} public String getBuilding(){return building;}
}
