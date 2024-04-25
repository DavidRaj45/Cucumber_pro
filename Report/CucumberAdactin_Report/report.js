$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User launch The Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-launch-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@LoginPage1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enter The Username In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Enter The Password In Password Field",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User Click On The Login Button And Its Navigate To Search Hotel Page",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepdef.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 3351444700,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_Enter_The_Username_In_Username_Field()"
});
formatter.result({
  "duration": 112573900,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_Enter_The_Password_In_Password_Field()"
});
formatter.result({
  "duration": 76578600,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_Click_On_The_Login_Button_And_Its_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 539645800,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 10,
      "value": "#LoginPage2"
    },
    {
      "line": 11,
      "value": "#Scenario Outline:User launch The Application"
    },
    {
      "line": 12,
      "value": "#Given User Launch The Adactin Application"
    },
    {
      "line": 13,
      "value": "#When User Enter The \"\u003cUsername\u003e\" In Username Field"
    },
    {
      "line": 14,
      "value": "#Then User Enter The \"\u003cPassword\u003e\" In Password Field"
    },
    {
      "line": 15,
      "value": "#And User Click On The Login Button And Its Navigate To Search Hotel Page"
    },
    {
      "line": 16,
      "value": "#"
    },
    {
      "line": 17,
      "value": "#Examples:"
    },
    {
      "line": 18,
      "value": "#     |Username      | Password  |"
    },
    {
      "line": 19,
      "value": "#     |David7358     |David@7358 |"
    },
    {
      "line": 20,
      "value": "#     |mohammedfazil |fazil12345 |"
    }
  ],
  "line": 23,
  "name": "User Select Hotel From Search Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-select-hotel-from-search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@SearchHotel"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User Select The Location In Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User Select The Hotel In Hotels Field",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User Select The Room Type In Room Type Field",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User Select The Room Count In Number Of Rooms Field",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User Select The Date In Check In Date Field",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User Select The Date In Check Out Date Field",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User Select The Adult Count In Adults per Room Field",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User Select The Child Count In Childrens per Room Field",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User Click the Search Button And Its Navigate To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepdef.user_Select_The_Location_In_Location_Field()"
});
formatter.result({
  "duration": 233728800,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_Select_The_Hotel_In_Hotels_Field()"
});
formatter.result({
  "duration": 197076500,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_Select_The_Room_Type_In_Room_Type_Field()"
});
formatter.result({
  "duration": 112814900,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_Select_The_Room_Count_In_Number_Of_Rooms_Field()"
});
formatter.result({
  "duration": 116821400,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_Select_The_Date_In_Check_In_Date_Field()"
});
formatter.result({
  "duration": 133374800,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_Select_The_Date_In_Check_Out_Date_Field()"
});
formatter.result({
  "duration": 117896900,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_Select_The_Adult_Count_In_Adults_per_Room_Field()"
});
formatter.result({
  "duration": 145122200,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_Select_The_Child_Count_In_Childrens_per_Room_Field()"
});
formatter.result({
  "duration": 115404000,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_Click_the_Search_Button_And_Its_Navigate_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 712043000,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "User Select The Hotel In Select Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-select-the-hotel-in-select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@SelectHotelPage"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "User Click The Select Hotel Button",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "User Click The Continue Button And Its Navigate To Book A Hotel Page",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepdef.user_Click_The_Select_Hotel_Button()"
});
formatter.result({
  "duration": 45544500,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_Click_The_Continue_Button_And_Its_Navigate_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 376277800,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "User Book The Hotel In Book A Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-book-the-hotel-in-book-a-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@BookHotelPage"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "User Enter The First Name In First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "User Enter The Last Name In Last Name Field",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "User Enter The Address In Billing Address Field",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "User Enter The Credit Card No In Credit Card No Field",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "User Select The Credit Card Type In Credit Card Type Field",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "User Select The Credit Card Expiry Month In Expiry Date Field",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "User Select The Credit Card Expiry Year In Expiry Date Field",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "User Enter The Cvv Number In CVV Number Field",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "User Click The Book Now Button And Its Navigate To Booking Confirmation Page",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "User Click The My Ltinerary Button For Check The Booking Hotel",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepdef.user_Enter_The_First_Name_In_First_Name_Field()"
});
formatter.result({
  "duration": 119696000,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_Enter_The_Last_Name_In_Last_Name_Field()"
});
formatter.result({
  "duration": 112795100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_Enter_The_Address_In_Billing_Address_Field()"
});
formatter.result({
  "duration": 105853200,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_Enter_The_Credit_Card_No_In_Credit_Card_No_Field()"
});
formatter.result({
  "duration": 99430500,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field()"
});
formatter.result({
  "duration": 128472200,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_Select_The_Credit_Card_Expiry_Month_In_Expiry_Date_Field()"
});
formatter.result({
  "duration": 130920400,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_Select_The_Credit_Card_Expiry_Year_In_Expiry_Date_Field()"
});
formatter.result({
  "duration": 433365300,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_Enter_The_Cvv_Number_In_CVV_Number_Field()"
});
formatter.result({
  "duration": 48350900,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_Click_The_Book_Now_Button_And_Its_Navigate_To_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 53623400,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepdef.user_Click_The_My_Ltinerary_Button_For_Check_The_Booking_Hotel()"
});
formatter.result({
  "duration": 10668019900,
  "status": "passed"
});
});