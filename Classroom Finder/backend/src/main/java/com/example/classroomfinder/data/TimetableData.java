package com.example.classroomfinder.data;
import com.example.classroomfinder.model.Lecture; import com.example.classroomfinder.model.Room;
import java.time.*; import java.util.List;
public class TimetableData {
 public static List<Room> rooms(){return List.of(
  new Room("R101","Room 101",60,"Block A"),new Room("R102","Room 102",60,"Block A"),new Room("R201","Room 201",80,"Block B"),new Room("R202","Room 202",80,"Block B"),new Room("LAB1","Computer Lab 1",40,"Block C"),new Room("LAB2","Computer Lab 2",40,"Block C"));}
 public static List<Lecture> lectures(){return List.of(
  new Lecture("R101",DayOfWeek.MONDAY,t("09:00"),t("10:00"),"DBMS","Dr. Sharma"),new Lecture("R101",DayOfWeek.MONDAY,t("11:00"),t("12:00"),"Operating Systems","Dr. Singh"),new Lecture("R102",DayOfWeek.MONDAY,t("10:00"),t("11:00"),"Computer Networks","Dr. Gupta"),new Lecture("R201",DayOfWeek.MONDAY,t("09:00"),t("11:00"),"Data Structures","Prof. Verma"),new Lecture("LAB1",DayOfWeek.MONDAY,t("12:00"),t("14:00"),"Java Lab","Prof. Mehta"),
  new Lecture("R101",DayOfWeek.TUESDAY,t("10:00"),t("12:00"),"Software Engineering","Dr. Rao"),new Lecture("R102",DayOfWeek.TUESDAY,t("09:00"),t("10:00"),"DBMS","Dr. Sharma"),new Lecture("R202",DayOfWeek.TUESDAY,t("13:00"),t("15:00"),"Artificial Intelligence","Dr. Khan"),new Lecture("LAB2",DayOfWeek.TUESDAY,t("11:00"),t("13:00"),"Web Development Lab","Prof. Mehta"),
  new Lecture("R201",DayOfWeek.WEDNESDAY,t("09:00"),t("10:00"),"Mathematics","Dr. Kapoor"),new Lecture("R202",DayOfWeek.WEDNESDAY,t("10:00"),t("12:00"),"Computer Networks","Dr. Gupta"),new Lecture("LAB1",DayOfWeek.WEDNESDAY,t("14:00"),t("16:00"),"Cloud Computing Lab","Prof. Joshi"),
  new Lecture("R101",DayOfWeek.THURSDAY,t("09:00"),t("11:00"),"Data Structures","Prof. Verma"),new Lecture("R102",DayOfWeek.THURSDAY,t("11:00"),t("12:00"),"Operating Systems","Dr. Singh"),new Lecture("R201",DayOfWeek.THURSDAY,t("12:00"),t("14:00"),"Web Development","Prof. Mehta"),new Lecture("LAB2",DayOfWeek.THURSDAY,t("10:00"),t("12:00"),"Python Lab","Dr. Khan"),
  new Lecture("R102",DayOfWeek.FRIDAY,t("09:00"),t("11:00"),"Artificial Intelligence","Dr. Khan"),new Lecture("R202",DayOfWeek.FRIDAY,t("11:00"),t("13:00"),"DBMS","Dr. Sharma"),new Lecture("LAB1",DayOfWeek.FRIDAY,t("09:00"),t("11:00"),"Java Lab","Prof. Mehta"));}
 private static LocalTime t(String x){return LocalTime.parse(x);}
}
