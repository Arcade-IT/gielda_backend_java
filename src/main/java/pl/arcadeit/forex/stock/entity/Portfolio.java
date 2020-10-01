package pl.arcadeit.forex.stock.entity;

import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Transactional
public class Portfolio {
    //private User user;
    private ArrayList<Investment> investmentsList;

    public Portfolio(ArrayList<Investment> investmentsList) {
        this.investmentsList = investmentsList;
    }

    public Portfolio() {
    }

    public void addInvestment (Investment investment) {
        investmentsList.add(investment);
    }

    public void removeInvestment (Investment investment) {
        investmentsList.remove(investment);
    }

    public void printInvestments() {
        for (Investment investment : investmentsList) {
            System.out.println(investment);
        }
    }
}