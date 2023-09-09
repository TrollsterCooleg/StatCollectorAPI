package me.cooleg.statcollector.statisticsmanagement;

import java.util.UUID;

public interface Statistic {

    String getName();

    default void setStatistic(UUID id, double num) {}

    default double getStatistic(UUID id) {return 0.0;}

    default void addStatistic(UUID id, double num) {}

    default void incrementStatistic(UUID id) {}

}
