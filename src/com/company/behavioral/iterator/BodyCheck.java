package com.company.behavioral.iterator;

import javax.print.Doc;
import java.util.LinkedList;

public class BodyCheck implements BodyCheckI{
    private LinkedList<Doctor> doctors;
    public BodyCheck() {
        this.doctors = new LinkedList<>();
    }
    @Override
    public void add(Doctor doctor){
        this.doctors.add(doctor);
    }
    @Override
    public Iterator iterator() {
        return new IteratorCheckImpl();
    }
    private class IteratorCheckImpl implements Iterator<Doctor>{
        private Doctor current;
        private int currentIndex=0;
        @Override
        public boolean hasNext() {
            return currentIndex<doctors.size();
        }
        @Override
        public Doctor getNext() {
            var cur = doctors.get(currentIndex);
            currentIndex+=1;
            current = cur;
            return current;
        }
    }
}
