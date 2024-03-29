package com.example.gho5t.diotrial;

public class NewsClass {

        //Method variables
        private String newsTitle;
        private String sectionName;
        private String newsDate;
        private String newsURL;
        private String newsAuthor;

        //Class constructor
        public NewsClass(String title, String section, String date, String url, String author){
            newsTitle = title;
            sectionName = section;
            newsDate = date;
            newsURL = url;
            newsAuthor = author;
        }

        //method to get magnitude
        public String getNewsTitle(){
            return newsTitle;
        }

        //method to get location
        public String getSectionName(){
            return sectionName;
        }

        //method to get date
        public String getNewsDate(){
            return newsDate;
        }

        //method to get url
        public String getNewsURL(){
            return newsURL;
        }

        //method to get news author
        public String getNewsAuthor(){return newsAuthor;}
    }

