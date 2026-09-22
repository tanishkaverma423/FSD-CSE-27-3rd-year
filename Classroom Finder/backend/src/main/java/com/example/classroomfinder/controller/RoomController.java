package com.example.classroomfinder.controller;
import com.example.classroomfinder.data.TimetableData; import com.example.classroomfinder.model.*; import org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.*; import java.time.*; import java.util.*;
@RestController @RequestMapping("/api/rooms") @CrossOrigin(origins="http://localhost:5173")
public class RoomController {
 @GetMapping("/free") public ResponseEntity<?> free(@RequestParam String day,@RequestParam String startTime,@RequestParam String endTime){
  try{DayOfWeek d=DayOfWeek.valueOf(day.toUpperCase()); LocalTime s=LocalTime.parse(startTime), e=LocalTime.parse(endTime); if(!s.isBefore(e)) return ResponseEntity.badRequest().body("End time must be after start time."); List<Room> out=new ArrayList<>();
   for(Room r:TimetableData.rooms()){boolean busy=false; for(Lecture l:TimetableData.lectures()){if(l.getRoomId().equals(r.getId())&&l.getDay()==d&&s.isBefore(l.getEndTime())&&e.isAfter(l.getStartTime())){busy=true;break;}} if(!busy)out.add(r);} return ResponseEntity.ok(out);
  }catch(Exception ex){return ResponseEntity.badRequest().body("Invalid day or time.");}
 }
}
