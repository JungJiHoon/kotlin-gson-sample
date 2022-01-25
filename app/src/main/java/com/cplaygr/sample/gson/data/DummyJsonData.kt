package com.cplaygr.sample.gson.data

class DummyJsonData {
    companion object {
        fun getJsonData(): String {
            return dummyJsonData
        }
        private const val dummyJsonData: String = "{\n" +
                "    \"drama_title\": \"좋좋소\",\n" +
                "    \"drama_season\": 4,\n" +
                "    \"company_list\": [\n" +
                "        {\n" +
                "            \"name\": \"JPD 소프트\",\n" +
                "            \"member_list\": [\n" +
                "                {\n" +
                "                    \"name\": \"정필돈\",\n" +
                "                    \"age\": 50,\n" +
                "                    \"career\": {\n" +
                "                        \"position\": \"사장\",\n" +
                "                        \"year\": 20\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"name\": \"이미나\",\n" +
                "                    \"age\": 32,\n" +
                "                    \"career\": {\n" +
                "                        \"position\": \"영업\",\n" +
                "                        \"year\": 4\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"name\": \"이예영\",\n" +
                "                    \"age\": 24,\n" +
                "                    \"career\": {\n" +
                "                        \"position\": \"개발\",\n" +
                "                        \"year\": 1\n" +
                "                    }\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"백인터내셔날\",\n" +
                "            \"member_list\": [\n" +
                "                {\n" +
                "                    \"name\": \"백진상\",\n" +
                "                    \"age\": 48,\n" +
                "                    \"career\": {\n" +
                "                        \"position\": \"사장\",\n" +
                "                        \"year\": 18\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"name\": \"이과장\",\n" +
                "                    \"age\": 47,\n" +
                "                    \"career\": {\n" +
                "                        \"position\": \"영업\",\n" +
                "                        \"year\": 15\n" +
                "                    }\n" +
                "                },\n" +
                "                {\n" +
                "                    \"name\": \"조충범\",\n" +
                "                    \"age\": 33,\n" +
                "                    \"career\": {\n" +
                "                        \"position\": \"영업\",\n" +
                "                        \"year\": 2\n" +
                "                    }\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}"
    }


}