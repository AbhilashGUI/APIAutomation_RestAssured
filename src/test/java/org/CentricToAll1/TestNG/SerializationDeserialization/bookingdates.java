package org.CentricToAll1.TestNG.SerializationDeserialization;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class bookingdates
{


        @SerializedName("checkin")
        @Expose
        private String checkin;
        @SerializedName("checkout")
        @Expose
        private String checkout;

        public String getCheckin() {
            return checkin;
        }

        public void setCheckin(String checkin) {
            this.checkin = checkin;
        }

        public String getCheckout() {
            return checkout;
        }

        public void setCheckout(String checkout) {
            this.checkout = checkout;
        }

    }





