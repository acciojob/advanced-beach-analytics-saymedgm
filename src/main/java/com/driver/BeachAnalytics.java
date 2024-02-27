package com.driver;

import java.util.List;

public class BeachAnalytics {
    public Beach findMostPopularBeach(List<Beach> beaches) {
        if (beaches.isEmpty()) {
            return null;
        }

        Beach mostPopular = beaches.get(0);

        for (Beach beach : beaches) {
            if (beach.getYearlyVisitors() > mostPopular.getYearlyVisitors()) {
                mostPopular = beach;
            }
        }

        return mostPopular;
    }

    public Beach findHighestRatedBeach(List<Beach> beaches) {
        if (beaches.isEmpty()) {
            return null;
        }

        Beach highestRated = beaches.get(0);

        for (Beach beach : beaches) {
            if (beach.getRating() > highestRated.getRating()) {
                highestRated = beach;
            }
        }

        return highestRated;
    }
}