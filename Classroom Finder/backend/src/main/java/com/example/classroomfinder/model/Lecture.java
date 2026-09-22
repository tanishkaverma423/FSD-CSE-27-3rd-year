package com.example.classroomfinder.model;
import java.time.DayOfWeek; import java.time.LocalTime;
public class Lecture {
    private String roomId, subject, faculty; private DayOfWeek day; private LocalTime startTime,endTime;
    public Lecture(String roomId, DayOfWeek day, LocalTime startTime, LocalTime endTime, String subject, String faculty){this.roomId=roomId;this.day=day;this.startTime=startTime;this.endTime=endTime;this.subject=subject;this.faculty=faculty;}
    public String getRoomId(){return roomId;} public DayOfWeek getDay(){return day;} public LocalTime getStartTime(){return startTime;} public LocalTime getEndTime(){return endTime;} public String getSubject(){return subject;} public String getFaculty(){return faculty;}
}
