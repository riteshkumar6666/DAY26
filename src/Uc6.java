
public class Uc6 {
    public String hotelName;
    public int rateForRegularCustomer;
    public int weekDayRate;
    public int weekEndRate;
    public int rating;
    //Default Constructor
    public Uc6() {

    }
    //Parameterized Constructor
    public Uc6(String name,int weekDayRate, int weekEndRate,int rating) {

        this.hotelName = name;
        this.weekDayRate = weekDayRate;
        this.weekEndRate = weekEndRate;
        this.rating=rating;
    }

    public String getName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRateForRegularCustomer() {
        return rateForRegularCustomer;
    }

    public void setRateForRegularCustomer(int rateForRegularCustomer) {
        this.rateForRegularCustomer = rateForRegularCustomer;
    }
    public int getWeekDayRate() {
        return weekDayRate;
    }
    public void setWeekDayRate(int weekDayRate) {
        this.weekDayRate = weekDayRate;
    }
    public int getWeekEndRate() {
        return weekEndRate;
    }
    public void setWeekEndRate(int weekEndRate) {
        this.weekEndRate = weekEndRate;
    }
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }



    @Override
    public String toString() {
        return " HotelName = " + hotelName +  ", WeekDayRate = "
                + weekDayRate + ", WeekEndRate = " + weekEndRate+",Rating ="+rating ;
    }


}
