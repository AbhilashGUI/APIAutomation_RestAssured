package org.CentricToAll1.TestNG.SerializationDeserialization;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class bookingresponse
{

        @SerializedName("bookingid")
        @Expose
        private Integer bookingid;
        @SerializedName("booking")
        @Expose
        private booking booking;

        public Integer getBookingid() {
            return bookingid;
        }

        public void setBookingid(Integer bookingid) {
            this.bookingid = bookingid;
        }

        public booking getBooking() {
            return booking;
        }

        public void setBooking(booking booking) {
            this.booking = booking;
        }
}
