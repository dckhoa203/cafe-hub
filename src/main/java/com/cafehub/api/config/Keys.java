package com.cafehub.api.config;

public class Keys {
    private Keys() {

    }
    public static final String DELIMITER_CHARACTER = ", ";

    public static class ApiPath {
        private ApiPath() {

        }
        private static final String VERSION = "/v1/";
        public static final String GET_ALL_PROVINCE_PATH = VERSION + "provinces";
        public static final String PROVINCE_GET_BY_ID_PATH = VERSION + "province/{id}";

        public static final String DISTRICT_GET_BY_PROVINCE_ID_PATH = VERSION + "{provinceId}/districts";
        public static final String DISTRICT_GET_BY_ID_PATH = VERSION + "district/{id}";

        public static final String WARD_GET_BY_DISTRICT_ID_PATH = VERSION + "{districtId}/wards";
        public static final String WARD_GET_BY_ID_PATH = VERSION + "ward/{id}";
    }

    public static class Messages {
        private Messages() {

        }
        public static final String CONNECT_ERROR_MESSAGE = "Connection Refused: Connect.";
        public static final String PATH_NOT_FOUND = "End Point Not Found.";
        public static final String SERVER_ERROR_MESSAGE = "Internal Server Error.";
        public static final String PROVINCE_NOT_FOUND = "Province is not found. Id: [%s]";
        public static final String DISTRICT_NOT_FOUND = "District is not found. Id: [%s]";
        public static final String WARD_NOT_FOUND = "Ward is not found. Id: [%s]";
    }
}
