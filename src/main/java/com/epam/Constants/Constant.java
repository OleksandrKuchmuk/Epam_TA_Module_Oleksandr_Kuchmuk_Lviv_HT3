package com.epam.Constants;

public class Constant {
    public static class TimeoutVariable{
        public static final int IMPLICIT_WAIT = 4;
        public static final int EXPLICIT_WAIT = 10;
    }

    public static class Urls{
        public static final String AVIC_HOME_PAGE = "https://avic.ua/ua";
        public static final String USER_HOME_PAGE = "https://avic.ua/ua/user-profile";
    }

    public static class Counts{
        public static final Integer COUNT_CARDS_ON_PAGE = 12;
    }

    public static class LoginsAndPasswords{
        public static final String USER_PHONE_NUMBER = "0638450187";
        public static final String USER_PASSWORD = "Avic_Test_Password";
    }

    public static class AlertsMessages{
        public static final String ALERT_MESSAGE_AUTHORISATION_OK = "Ви успішно авторизувалися!";
    }
}