package com.company.domain;

import java.util.ArrayList;
import java.util.List;

public class TicketOffice {
    private final List<Integer> lottoNumber = new ArrayList<Integer>();
    private final int MAX_NUMBER = 45;

    public TicketOffice() {
        setLottoNumber();
    }

    private void setLottoNumber() {
        for (int i = 1; i <= MAX_NUMBER; i++) {
           this.lottoNumber.add(i);
        }
    }


}
