package me.cooleg.statcollector.statisticsmanagement;

import org.bukkit.event.Listener;

import java.util.Map;
import java.util.UUID;

public interface Statistic extends Listener {

    String getName();

    default void setStatistic(UUID id, double num) {}

    default double getStatistic(UUID id) {return 0.0;}

    default void addStatistic(UUID id, double num) {}

    default void incrementStatistic(UUID id) {}

    default Map<UUID, Double> getAllScores() {return null;}

}
