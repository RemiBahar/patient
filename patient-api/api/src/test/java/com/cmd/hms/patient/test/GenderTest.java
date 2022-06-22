package com.cmd.hms.patient.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.cmd.hms.patient.model.Gender;

public class GenderTest {

     // Instanstiate object
     Gender gender = new Gender();

     // Tests
     @Test
     public void IdTest(){
         Long Id = 1L;
         gender.setGenderId(Id);
             
         assertTrue(gender.getGenderId().equals(Id), "Id");
     }

     @Test
     public void TitleTest(){
         String Title = "Male";
         gender.setTitle(Title);
             
         assertTrue(gender.getTitle().equals(Title), "Title");
     }

     @Test
     public void IsDeletedTest(){
         Boolean IsDeleted = false;
         gender.setIsDeleted(false);
             
         assertTrue(gender.getIsDeleted().equals(IsDeleted), "IsDeleted");
     }
    
}