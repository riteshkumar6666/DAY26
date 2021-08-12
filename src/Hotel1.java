public class Hotel1 {
    public String hotelName;
    public int rateForRegularCustomer;
    public int weekDayRate;
    public int weekEndRate;

    public Hotel1(String hotelName, int rateForRegularCustomer) {

        this.hotelName = hotelName;
        this.rateForRegularCustomer = rateForRegularCustomer;

    }
    public Hotel1(String name,int weekDayRate, int weekEndRate) {

        this.hotelName = name;
        this.weekDayRate = weekDayRate;
        this.weekEndRate = weekEndRate;
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

    public Hotel1() {

    }

    @Override
    public String toString() {
        return " HotelName = " + hotelName +  ", WeekDayRate = "
                + weekDayRate + ", WeekEndRate = " + weekEndRate ;
    }
}
