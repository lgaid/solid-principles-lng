package com.cydeo.solid.dependencyInversion.example.good;

public class UserReader implements Reader{

    private Reader reader ;


    public UserReader(Reader reader) {
        this.reader = reader;
    }

    @Override
    public String getUserName() {
        return reader.getUserName();
    }

}
