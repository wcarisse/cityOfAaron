/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Carissa, Kyli, Kate
 */
public enum TeamMember {
    
    OldMan("Aaron", "Prophet"),
    YoungMan("Joe", "Follower");
    
    private String name;
    private String title;

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    TeamMember(String name, String title) {
        this.name = name;
        this.title = title;
    }
}
