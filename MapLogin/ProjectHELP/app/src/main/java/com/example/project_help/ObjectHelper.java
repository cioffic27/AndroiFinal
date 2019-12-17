package com.example.project_help;

public class ObjectHelper {
        //int bookingCounter = 2;
        static Booking objBooking[] = new Booking[150];

//-------------------------------------------------------------------------------------------------------------------------
//
    static class Booking{
        String emailBook;
        String date;
        String tutorType;
        String typeOfClass;
        String time;
        String mapLocation;
        String description;

        public Booking(String email, String date, String tutorType, String typeOfClass, String time, String mapLocation, String description) {
            this.emailBook = email;
            this.date = date;
            this.tutorType = tutorType;
            this.time = time;
            this.mapLocation = mapLocation;
            this.description = description;
            this.typeOfClass = typeOfClass;
        }

        public String getEmailBook() {
            return emailBook;
        }

        public void setEmailBook(String email) {
            this.emailBook = email;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getTutorType() {
            return tutorType;
        }

        public void setTutorType(String tutorType) {
            this.tutorType = tutorType;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getMapLocation() {
            return mapLocation;
        }

        public void setMapLocation(String mapLocation) {
            this.mapLocation = mapLocation;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getTypeOfClass() {
            return description;
        }

        public void setTypeOfClass(String description) {
            this.description = description;
        }
    }

//-------------------------------------------------------------------------------------------------------------------------
//
    static class Account {
        String emailAcc;
        String username;
        String password;
        String year;
        String major;
        String name;
        String lastName;

        public Account(CharSequence email, CharSequence username, CharSequence password, CharSequence year, CharSequence major, CharSequence name, CharSequence lastName) {
            this.emailAcc = (String) email;
            this.username = (String) username;
            this.password = (String) password;
            this.year = (String) year;
            this.major = (String) major;
            this.name = (String) name;
            this.lastName = (String) lastName;
        }

        public String getEmailAcc() {
            return emailAcc;
        }

        public void setEmailAcc(String emailAcc) {
            this.emailAcc = emailAcc;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getMajor() {
            return major;
        }

        public void setMajor(String major) {
            this.major = major;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

}




