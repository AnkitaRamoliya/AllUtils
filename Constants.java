package com.oozeetech.bizdesk.utils;

import android.os.Environment;

import java.io.File;
import java.io.Serializable;

public class Constants implements Serializable {


    public static final String FOLDER_PATH = Environment
            .getExternalStorageDirectory().getAbsolutePath()
            + File.separator
            + "BizDesk";

    public static final int PICK_GIF = 1080;
    public static final String IS_LOGIN = "is_login";
    public static final String API_KEY = "123";
    public static final int PICK_IMAGE = 02;
    public static final String LOGIN_REGISTER_RESPONSE = "login_register_response";
    public static final String FCM_KEY = "fcm_key";

    //Broadcast key
    public static final String ACTION_DEVICE_ID = "com.oozeetech.bizdesk.device_id";
    //Intent Keys
    public static final String TYPE = "type";
    public static final String GET_PARTY = "get_party";
    public static final String GET_CUSTOMER = "get_customer";
    public static final String GET_STOCK = "get_stock";
    public static final String ACTION_UPDATE_PROFILE = "";
    public static final String IS_SOCIAL_LOGIN = "isSocialLogin";
    //Set Setting Keys
    public static final String ROUGH_BROKERAGE = "RoughBrokerage";
    public static final String POLISH_BROKERAGE = "PolishBrokerage";
    public static final String NOTIFY_PAYMENT_DUE = "NotifyPaymentDue";
    public static final String NOTIFY_BIZ_CONFIRM = "NotifyBizConfirm";
    public static final String NOTIFY_BIZ_CONFIRM_DAY = "NotifyBizConfirmDay";
    public static final String NOTIFY_UPDATES = "NotifyUpdates";
    public static final String EXCHANGE_RATE = "ExchangeRate";
    //Payment Outstanding Keys
    public static final String ID = "id";
    // My Biz Filter
    public static final String PARTY_IDS = "partyIds";
    public static final String CUSTOMER_IDS = "customerIds";
    public static final String SELLER_FROM_DATE = "sellerFromDate";
    public static final String SELLER_TO_DATE = "sellerToDate";
    public static final String PAYMENT_FROM_DATE = "paymentFromDate";
    public static final String PAYMENT_TO_DATE = "paymentToDate";
    public static String USER_ID = "number";
    //Update Biz Detail
    public static String UPDATE_BIZ = "updateBizType";

    public static int TIMEOUT = 200000;

}
