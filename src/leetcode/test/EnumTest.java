package leetcode.test;

import java.util.EnumSet;

public class EnumTest {
    private static EnumSet<PizzaStatus> undeliveredPizzaStatus = EnumSet.of(PizzaStatus.ORDERED,PizzaStatus.READY);
    public enum PizzaStatus{
        /**
         *
         */
        ORDERED (5){
            @Override
            public boolean isOrdered(){
                return true;
            }
        },
        READY (2){
            @Override
            public boolean isReady() {
                return true;
            }
        },
        DELIVERED (0){
            @Override
            public boolean isDelivered() {
                return true;
            }
        };

        private int timeToDelivery;


        public int getTimeToDelivery() {
            return timeToDelivery;
        }

        PizzaStatus (int timeToDelivery) {
            this.timeToDelivery = timeToDelivery;
        }

        public boolean isOrdered(){
            return false;
        }

        public boolean isReady() {return false;}

        public boolean isDelivered(){return false;}
    }

    private PizzaStatus status;

    public boolean isDeliverable(){
        return this.status.isReady();
    }

    public void printTimeToDeliver() {
        System.out.println("Time to delivery is " +
                this.getStatus().getTimeToDelivery());
    }


    public PizzaStatus getStatus() {
        return status;
    }

    public void setStatus(PizzaStatus status) {
        this.status = status;
    }


}
