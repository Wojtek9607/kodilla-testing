package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public final class Lizard implements Figure {
    private final String figureName;
    private List<String> beats = new ArrayList<>();

    public Lizard(final String figureName) {
        this.figureName = figureName;
    }

    @Override
    public String getFigureName() {
        return figureName;
    }

    @Override
    public List<String>beats() {
        beats.add(Figures.spock);
        beats.add(Figures.paper);
        return beats;
    }
}