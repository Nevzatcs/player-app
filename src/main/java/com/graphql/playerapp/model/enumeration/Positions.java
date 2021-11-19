package com.graphql.playerapp.model.enumeration;

public enum Positions {
    PG("Point guard", "PG"),
    SG("Shooting guard", "SG"),
    SF("Small forward", "SF"),
    PF("Power forward", "PF"),
    C("Center", "C");

    private String positionName;
    private String positionAbbrv;

    Positions(String positionName, String positionAbbrv) {
        this.positionName = positionName;
        this.positionAbbrv = positionAbbrv;
    }

    public String getPositionName() {
        return positionName;
    }

    public String getPositionAbbrv() {
        return positionAbbrv;
    }
}
