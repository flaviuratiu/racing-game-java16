package org.fasttrackit.persistence;

public interface RankingRepository {

    void addRankingItem(int rank, String competitorName, double totalDistance);

    void close();
}
