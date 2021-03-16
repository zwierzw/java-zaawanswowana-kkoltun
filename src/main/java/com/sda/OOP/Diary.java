package com.sda.OOP;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Diary {
    private List <Entry> entries = new ArrayList<>();

    private class Entry{
        String name;
        LocalDate date;

        @Override
        public String toString() {
            return "Entry{" +
                    "name='" + name + '\'' +
                    ", date=" + date +
                    '}';
        }
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void writeEntry(String text) {
        // kod dodający nowy wpis z dzisiejszą datą
        Entry entry = new Entry();
        entry.name = text;
        entry.date = LocalDate.now();
        entries.add(entry);
    }

    public List<String> getEntriesFrom(LocalDate date) {
        // kod zwracający wpisy z odpowiednią datą
        List<String> dziennik = new ArrayList<>();
        for (Entry entry: entries){
            if(entry.date.isEqual(date)) {
                dziennik.add(entry.name);
            }
        }
        return dziennik;
    }


    @Override
    public String toString() {
        return "Diary{" +
                "entries=" + entries +
                '}';
    }
}
