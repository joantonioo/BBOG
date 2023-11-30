package net.bancodebogota.siebeluat.utils;

public class Variables {

    static String NameFrame;

    public static String getNameFrame() {
        NameFrame ="TargetContent";
        return NameFrame;
    }

    static String urlPeopleSoft;
    static String Urlsiebel;

    static String UserId;
    static String Password;


    static String UserIdSiebel;

    static String PasswordSiebel;

    public static String getUserIdSiebel() {
        UserIdSiebel = "JCAS20";
        return UserIdSiebel;
    }

    public static String getPasswordSiebel() {
        PasswordSiebel = "Qapruebas2023**";
        return PasswordSiebel;
    }

    static int tiempoEspera;

    public static String getUserId() {
        UserId = "42430312";
        return UserId;
    }

    public static String getPassword() {
        Password = "NOVIEMBRE2023+";
        return Password;
    }

    public static String getUrlPeopleSoft() {
        urlPeopleSoft = "http://crmprue:8020/psp/ps/?cmd=login&languageCd=ESP";
        return urlPeopleSoft;
    }

    public static String getUrlsiebel() {
        Urlsiebel ="https://finscall.siebeluat.bancodebogota.net:4430/siebel/app/fins1/esn?SWECmd=Logoff&SWETS=1672239227767&SWEPreLd=1";
        return Urlsiebel;
    }

    public static int getTiempoEspera() {
        tiempoEspera = 10;
        return tiempoEspera;
    }
}
