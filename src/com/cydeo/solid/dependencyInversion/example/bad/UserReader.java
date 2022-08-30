package com.cydeo.solid.dependencyInversion.example.bad;

public class UserReader {

    private XMLReader xmlReader;            // What happens if we decide to use JSON format instead of XML format?
    // private XMLReade jsonReader;
    public UserReader(XMLReader xmlReader) {    // We need to update json reader in constructor too
        this.xmlReader = xmlReader;
    }

    public String getUsername() {
        return xmlReader.getUsername();     // public string getUserNameFromXML()
    }


  //  public String getUsernameFromJson() {
        // return JsonReader.getUserName;

  //  }

}
