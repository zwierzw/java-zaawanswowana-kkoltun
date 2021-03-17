package com.sda.nestedClass;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    @org.junit.jupiter.api.Test
    void writeEntry() {
        //Given
        Diary diary = new Diary();

        //When
        diary.writeEntry("Mój pierwszy wpis");
        diary.writeEntry("Drugi wpis");

        //Then
        int c = diary.getEntries().size();
        assertEquals(2, c);
    }

    @org.junit.jupiter.api.Test
    void getEntriesFrom() {
        //Given
        Diary diary = new Diary();

        //When
        diary.writeEntry("Mój pierwszy wpis");
        diary.writeEntry("Drugi wpis");
        diary.writeEntry("Trzeci wpis");
        int b = diary.getEntriesFrom(LocalDate.of(2021,3,16)).size();

        System.out.println(b);
        assertEquals(3,b);

        //Then



    }
}