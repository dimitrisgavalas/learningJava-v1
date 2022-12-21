package com.buch;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.duplex = duplex;

        if (tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }else
            this.tonerLevel = -1;

        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){

        if (this.tonerLevel > 0 && this.tonerLevel < 100){
            if (this.tonerLevel + tonerAmount <= 100){
                tonerAmount = 100 - this.tonerLevel;
                return tonerAmount;
            }else
                return -1;
           //System.out.println("The percentage that is going to be added is " + addToner + "%");
        }else
            return -1;
    }

    public int printPages(int pages){ //h metavliti einai poses selides theloume na prostesoume

        int pagesToPrint = pages;

        if (duplex){

            pagesPrinted = pagesToPrint;
            if (pagesPrinted % 2 == 0){
                System.out.println("Duplex mode is on. So " + pagesPrinted + " pages are needed in " + pagesPrinted/2 +" sheets");
                return pagesPrinted = (pagesPrinted + pagesToPrint)/2;
            }else {
                pagesPrinted = (pagesToPrint) / 2 +1;
                System.out.println("Duplex mode is on. So " + pagesToPrint + " pages are needed in " + pagesPrinted + " sheets");
                return pagesPrinted = (pagesToPrint) / 2 +1;
            }
        }else
            return pagesPrinted = pagesPrinted + pagesToPrint;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
